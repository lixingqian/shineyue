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
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> listAll() {
        return studentMapper.listAll();
    }
}
