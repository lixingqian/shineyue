package com.shineyue.cn.service.impl;

import com.shineyue.cn.mapper.StudentMapper;
import com.shineyue.cn.model.Student;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanJI
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 增加
     *
     * @param student
     * @return Integer
     */
    @Override
    public Integer add(Student student) {
        return studentMapper.insertSelective(student);
    }

    /**
     * 删除
     *
     * @param id
     * @return Integer
     */
    @Override
    public Integer delete(String id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     *
     * @param student
     * @return Integer
     */
    @Override
    public Integer update(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return Integer
     */
    @Override
    public Student selectById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有
     *
     * @return List
     */
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
