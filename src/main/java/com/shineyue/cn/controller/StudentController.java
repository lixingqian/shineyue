package com.shineyue.cn.controller;

import com.shineyue.cn.model.Response;
import com.shineyue.cn.model.Student;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author YanJI
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Resource
    private Response response;

    private Integer row = 0;

    @GetMapping("selectById/{id}")
    public Response selectById(@PathVariable String id) {
        Student student = studentService.selectById(id);
        if (student != null) {
            setResponseParam(student);
        } else {
            setResponseParam();
        }
        return response;
    }

    @GetMapping("selectAll")
    public Response selectAll() {
        List<Student> students = studentService.selectAll();
        if (students != null) {
            setResponseParam(students);
        } else {
            setResponseParam();
        }
        return response;
    }

    @PostMapping("add")
    public Response add(Student student) {
        row = studentService.add(student);
        if (row > 0) {
            setResponseParam(row);
        } else {
            setResponseParam();
        }
        return response;
    }

    @GetMapping("delete/{id}")
    public Response delete(@PathVariable String id) {
        row = studentService.delete(id);
        if (row > 0) {
            setResponseParam(row);
        } else {
            setResponseParam();
        }
        return response;
    }

    @PostMapping("update")
    public Response update(Student student) {
        row = studentService.add(student);
        if (row > 0) {
            setResponseParam(row);
        } else {
            setResponseParam();
        }
        return response;
    }

    private void setResponseParam(Object data) {
        response.setData(data);
        response.setStatus(200);
        response.setMesage("success");
    }

    private void setResponseParam() {
        response.setData(null);
        response.setStatus(500);
        response.setMesage("failed");
    }
}
