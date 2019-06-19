package com.shineyue.cn.controller;

import com.shineyue.cn.model.Student;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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
        return "hello, spring boot";
    }
    @RequestMapping("getAll")
    public List getAll(){
        return studentService.listAll();
    }

    @GetMapping("add")
    public String addStudent(String id ,String name ,Integer age,String sex,String teamId){
        if(id == null || id ==""){
            return "id不能为空";
        }

        if(studentService.findById(id) != null){
            return "id已被使用";
        }
        Student student=new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setTeamId(teamId);
        return studentService.addStudent(student);
    }

    @GetMapping("update")
    public  String updateStudent(String id ,String name ,Integer age,String sex,String teamId){
        if(id == null || "" == id){
            return "id不能为空";
        }
        if(studentService.findById(id) == null){
            return "学生不存在";
        }

        Student student=new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setTeamId(teamId);
        return studentService.updateStudent(student);
    }

    @GetMapping("del")
    public  String delStudent(String id){
        if(id == null || id ==""){
            return "主键不能为空";
        }
        if(studentService.findById(id) == null){
            return "学生不存在";
        }

        return studentService.delStudent(id);
    }

}
