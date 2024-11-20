package com.example.demo.service;//package com.example.demo.service;
//
//import com.example.demo.entity.Student;
//import com.example.demo.mapper.StudentMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentService {
//    @Autowired
//    private StudentMapper studentMapper;
//
//    /**
//     * 自定义查询所有
//     *
//     * @return
//     */
//    public List<Student> findAll() {
//        return studentMapper.findAll();
//    }
//
//    /**
//     * 通过BaseMapper继承而来的方法
//     *
//     * @param student
//     * @return
//     */
//    public List<Student> findAll(Student student) {
//        return studentMapper.select(student);
//    }
//
//    public Student findById(int id) {
//        return studentMapper.findById(id);
//    }
//}
