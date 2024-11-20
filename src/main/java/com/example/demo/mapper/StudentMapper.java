package com.example.demo.mapper;//package com.example.demo.mapper;
//
//import com.example.demo.entity.Student;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//@Mapper
//public interface StudentMapper {
//    /**
//     * xml方式书写SQL语句
//     *
//     * @return
//     */
//    List<Student> findAll();
//
//    /**
//     * 注解方式
//     *
//     * @param id
//     * @return
//     */
//    @Select("select * from student where id = #{id}")
//    Student findById(int id);
//}
