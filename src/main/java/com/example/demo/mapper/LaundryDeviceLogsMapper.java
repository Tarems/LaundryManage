package com.example.demo.mapper;

import com.example.demo.entity.LaundryDeviceLogs;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【laundry_device_logs(洗衣房设备记录)】的数据库操作Mapper
 * @createDate 2024-09-19 14:06:16
 * @Entity com.example.demo.entity.LaundryDeviceLogs
 */
@Mapper
public interface LaundryDeviceLogsMapper extends BaseMapper<LaundryDeviceLogs> {

    /**
     * 查询最近的5条使用记录
     * <p>根据开始使用时间倒叙查询</p>
     *
     * @return
     */
    @Select(value = "select * from laundry_device_logs where device_id=#{deviceId} order by start_time desc limit 5 offset 0")
    List<LaundryDeviceLogs> queryTheLastFiveUsageRecords(Long deviceId);
}




