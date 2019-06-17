package com.shineyue.cn.controller;

import com.shineyue.cn.model.Student;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @author YanJI
 */
@RestController()
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("hello")
    public String hello(){
        System.out.println(12346);
        return "hello, spring boot，lixingqian";
    }
    @RequestMapping("getAll")
    public List getAll(){
        return new ArrayList<Student>(studentService.listAll());
    }
}

