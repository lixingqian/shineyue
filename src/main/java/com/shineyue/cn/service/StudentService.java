package com.shineyue.cn.service;

import com.shineyue.cn.model.Student;

import java.util.List;
/**
 * @author YanJI
 */
public interface StudentService {
    /**
     * 获取所有学生信息
     * @return list
     */
    List<Student> listAll();
}
