package com.shineyue.cn.service;

import com.shineyue.cn.model.Student;
import com.shineyue.cn.model.Team;

import java.util.List;

/**
 * @author YanJI
 */
public interface StudentService {
    /**
     * 获取所有学生信息
     * @return list
     */
    List<Team> listAll();

    /**
     * 增加学生信息
     * @param student
     * @return
     */
    String addStudent( Student student);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    String updateStudent(Student student);
    /**
     * 删除学生信息
     * @param  id
     * @return
     */
    String delStudent(String id);

    /**
     * 通过id找到数据
     * @param id
     * @return
     */
    Student  findById(String id);
}
