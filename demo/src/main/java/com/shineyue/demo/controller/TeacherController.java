package com.shineyue.demo.controller;

import com.shineyue.demo.pojo.Teacher;
import com.shineyue.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author jianghua
 * @date 2019/6/14
 */
@RestController
@RequestMapping(value = {"teacher"},method = RequestMethod.GET)
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @GetMapping("load/{id}")
    public Teacher load(@PathVariable String id) {
        return teacherService.load(id);
    }

    @GetMapping("selectAll")
    public List<Teacher> selectAll(){
        return teacherService.selectAll();
    }


}
