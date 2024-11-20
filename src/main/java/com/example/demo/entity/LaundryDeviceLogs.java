package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.mybatisflex.annotation.Id;
//import com.mybatisflex.annotation.KeyType;
//import com.mybatisflex.annotation.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 洗衣房设备记录
 *
 * @TableName laundry_device_logs
 */
@Data
//@Table("laundry_device_logs")
public class LaundryDeviceLogs implements Serializable {
//    @Id(keyType = KeyType.Auto)
    private Long id;

    private Long deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 开始使用时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 结束使用时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 学生名称
     */
    private String studentName;

    /**
     *
     */
    private String studentRoom;

    @Serial
    private static final long serialVersionUID = 1L;
}