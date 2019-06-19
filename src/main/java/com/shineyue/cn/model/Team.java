package com.shineyue.cn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YanJI
 * @DESC  用于班级描述 获取班级人员
 * @date 2019年6月17日18:01:45
 */
public class Team {
    /**
     * id
     */
    private String id;
    /**
     * 班级名称
     */
    private String name;
    /**
     * 班级学生
     */
    private Student student;
//    private List<Student> studentList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
