package com.example.demo.mapper;

import com.example.demo.entity.LaundryDevice;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description 针对表【laundry_device(洗衣房设备)】的数据库操作Mapper
 * @createDate 2024-09-19 08:58:56
 * @Entity com.example.demo.entity.LaundryDevice
 */
@Mapper
public interface LaundryDeviceMapper extends BaseMapper<LaundryDevice> {
}




