package com.example.demo.entity;

//import com.mybatisflex.annotation.Table;
import lombok.Data;

/**
 * 学生表
 */
@Data
//@Table("student")
public class Student {
    private int id;
    private String name;
    private String sex;
    private String address;

    public Student() {
    }
}
