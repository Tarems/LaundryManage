package com.example.demo.controller;

import com.example.demo.common.AjaxJson;
import com.example.demo.entity.LaundryDevice;
import com.example.demo.entity.LaundryDeviceLogs;
import com.example.demo.service.LaundryDeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Resource
    private LaundryDeviceService laundryDeviceService;

    /**
     * http://localhost:8080/index
     * <p>@ResponseBody 没有这个注解，spring将去默认的/resources/templates/** 中寻找对应页面文件</p>
     *
     * @return
     */
    @GetMapping
    public String index() {
        return "index";
    }

    /**
     * <p>@ResponseBody 作用是返回具体类型</p>
     *
     * @return
     */
    @PostMapping("/findLaundryList")
    @ResponseBody
    public AjaxJson findLaundryList() {
        List<LaundryDevice> laundryDeviceList = laundryDeviceService.selectAll();
        for (LaundryDevice laundryDevice : laundryDeviceList) {
            // 根据设备ID查询对应的使用记录
            laundryDevice.setLogsList(laundryDeviceService.queryTheLastFiveUsageRecords(laundryDevice.getId()));
        }
        return AjaxJson.getSuccess("", laundryDeviceList);
    }

    /**
     * 清除使用记录
     *
     * @param id 设备ID
     * @return
     */
    @GetMapping("/clearUseTime")
    @ResponseBody
    public AjaxJson clearUseTime(Long id) {
        if (id != null) {
            LaundryDevice laundryDevice = laundryDeviceService.selectOneById(id);
            laundryDevice.setDeviceStatus("idle");
            laundryDevice.setStartTime(null);
            laundryDevice.setEndTime(null);
            laundryDevice.setStudentName(null);
            laundryDevice.setStudentRoom(null);
            laundryDeviceService.update(laundryDevice, false);
            return AjaxJson.getSuccess("清理成功");
        } else {
            return AjaxJson.getWarning("设备ID不能为空");
        }
    }

    @PostMapping("/saveLaundryLogs")
    @ResponseBody
    public AjaxJson saveLaundryLogs(@RequestBody LaundryDevice laundryDevice) {
        if (laundryDevice != null) {
            // 保存正在使用者
            laundryDeviceService.update(laundryDevice);
            return AjaxJson.getSuccess("记录成功");
        }else{
            return AjaxJson.getWarning("无效数据");
        }
    }

}
