package com.shineyue.cn.model;

import java.util.List;

/**
 * @Author ZengZhiPing
 * @Description:
 * @Date 2019/6/17 20:09
 * @Version 1.0
 */
public class Team {
    /**
     *班级id
     */
    private String id;
    /**
     *班级名称
     */
    private String name;

    /**
     * 学生信息
     */
    private List<Student> student;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
