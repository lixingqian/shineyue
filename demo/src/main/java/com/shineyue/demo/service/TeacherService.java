package com.shineyue.demo.service;

import com.shineyue.demo.pojo.Teacher;

import java.util.List;

/**
 * @author jianghua
 * @date 2019/6/14
 */
public interface TeacherService {

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Teacher load(String id);

    /**
     * 查询所有
     * @return
     */
    List<Teacher> selectAll();

    /**
     * 增加
     * @param teacher
     */
    void add(Teacher teacher);

    /**
     * 删除
     * @param id
     */
    void delete(String id);

    /**
     * 修改
     *
     * @param teacher
     */
    void update(Teacher teacher);
}
