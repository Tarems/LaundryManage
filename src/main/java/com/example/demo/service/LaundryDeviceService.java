package com.example.demo.service;

import com.example.demo.entity.LaundryDevice;
import com.example.demo.entity.LaundryDeviceLogs;
import com.example.demo.mapper.LaundryDeviceLogsMapper;
import com.example.demo.mapper.LaundryDeviceMapper;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class LaundryDeviceService {
    private final LaundryDeviceMapper deviceMapper;
    private final LaundryDeviceLogsMapper logsMapper;

    public LaundryDeviceService(LaundryDeviceMapper deviceMapper, LaundryDeviceLogsMapper logsMapper) {
        this.deviceMapper = deviceMapper;
        this.logsMapper = logsMapper;
    }

    public List<LaundryDevice> selectAll() {
        return deviceMapper.selectAll();
    }

    public LaundryDevice selectOneById(Long id) {
        return deviceMapper.selectOneById(id);
    }

    @Transactional
    public void update(LaundryDevice laundryDevice) {
        deviceMapper.update(laundryDevice);
        // 保存使用记录
        LaundryDeviceLogs logs = new LaundryDeviceLogs();
        logs.setDeviceId(laundryDevice.getId());
        logs.setDeviceName(laundryDevice.getDeviceName());
        logs.setStartTime(laundryDevice.getStartTime());
        logs.setEndTime(laundryDevice.getEndTime());
        logs.setStudentName(laundryDevice.getStudentName());
        logs.setStudentRoom(laundryDevice.getStudentRoom());
        logsMapper.insert(logs);
    }

    /**
     * 根据主键来更新数据到数据库。
     *
     * @param t 数据内容，必须包含有主键
     * @param b 是否忽略空内容字段
     * @return 受影响的行数
     * @see com.mybatisflex.core.provider.EntitySqlProvider#update(Map, ProviderContext)
     */
    public void update(LaundryDevice t, boolean b) {
        deviceMapper.update(t, b);
    }

    public List<LaundryDeviceLogs> queryTheLastFiveUsageRecords(Long deviceId) {
        return logsMapper.queryTheLastFiveUsageRecords(deviceId);
    }
}
