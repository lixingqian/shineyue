package com.shineyue.demo.pojo;

//import lombok.Data;

/**
 * @author jianghua
 * @date 2019/6/14
 */

//@Data
public class Teacher {
    private String id;
    private String name;
    private int age;
    private String sex;

    public Teacher setId(String id) {
        this.id = id;
        return this;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public Teacher setAge(int age) {
        this.age = age;
        return this;
    }

    public Teacher setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
