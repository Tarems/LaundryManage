package com.example.demo.controller;//package com.example.demo.controller;
//
//import com.example.demo.common.AjaxJson;
//import com.example.demo.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("/demo")
//public class StudentController {
//    @Autowired
//    private StudentService studentService;
//
//    /**
//     * 测试地址： http://localhost:8080/demo/hello?name=1
//     *
//     * @param name
//     * @return
//     */
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello(String name) {
//        return "Hello " + name;
//    }
//
//    /**
//     * 测试地址：http://localhost:8080/demo/findAll
//     *
//     * @return
//     */
//    @GetMapping("/findAll/8081")
//    @ResponseBody
//    public AjaxJson findAll() {
//        return AjaxJson.getSuccess("所有学生", studentService.findAll());
//    }
//
//    /**
//     * 测试地址：http://localhost:8080/demo/findById?id=1
//     *
//     * @param id
//     * @return
//     */
//    @GetMapping("/findById")
//    @ResponseBody
//    public AjaxJson findById(int id) {
//        return AjaxJson.getSuccess("学生信息", studentService.findById(id));
//    }
//}
