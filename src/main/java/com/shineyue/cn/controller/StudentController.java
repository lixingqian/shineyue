package com.shineyue.cn.controller;

import com.shineyue.cn.model.Student;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobin
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("deleBy")
    public Integer deleBy(String gId){
        int i = studentService.deleteByPrimaryKey(gId);
        return i;
    }
    @RequestMapping("addStu")
    private Integer addStu(String gId, String gName, Short gAge, String gSex, String gTeamId, Short gType){
        Student student=new Student(gId,gName,gAge,gSex,gTeamId,gType);
        int insert = studentService.insert(student);
        return insert;
    }
    @RequestMapping("addStuse")
    private Integer addStuse(String gId, String gName, Short gAge, String gSex, String gTeamId, Short gType){
        Student student1=new Student(gId,gName,gAge,gSex,gTeamId,gType);
        int insertSelective = studentService.insertSelective(student1);
        return insertSelective;
    }
    @RequestMapping("seleStu")
    private Student seleStu(String gId){
        Student student = studentService.selectByPrimaryKey(gId);
        return student;
    }
    @RequestMapping("updaBpks")
    private Integer updaBpks(String gId, String gName, Short gAge, String gSex, String gTeamId, Short gType){
        Student student2=new Student(gId,gName,gAge,gSex,gTeamId,gType);
        int bpks = studentService.updateByPrimaryKeySelective(student2);
        return bpks;
    }
    @RequestMapping("updaBpk")
    private Integer updaBpk(String gId, String gName, Short gAge, String gSex, String gTeamId, Short gType){
        Student student3=new Student(gId,gName,gAge,gSex,gTeamId,gType);
        int bpk = studentService.updateByPrimaryKey(student3);
        return bpk;
    }
}
