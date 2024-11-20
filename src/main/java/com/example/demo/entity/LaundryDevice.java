package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.mybatisflex.annotation.Column;
//import com.mybatisflex.annotation.Id;
//import com.mybatisflex.annotation.KeyType;
//import com.mybatisflex.annotation.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 洗衣房设备
 * @TableName laundry_device
 */
@Data
//@Table("laundry_device")
public class LaundryDevice implements Serializable {
    public LaundryDevice() {
    }

    public LaundryDevice(Long id) {
        this.id = id;
    }

//    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 设备名称
     */
//    @Column(value = "device_name")
    private String deviceName;

    /**
     * 设备状态：空闲、工作
     */
    private String deviceStatus;

    /**
     * 设备使用的开始时间
     * <p>@JsonFormat 数据再返回至前端前进行序列化，把时间格式进行按照自定义格式进行处理</p>
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 学生姓名
     */
    private String studentName;
    private String studentRoom;

    private List<LaundryDeviceLogs> logsList;
}