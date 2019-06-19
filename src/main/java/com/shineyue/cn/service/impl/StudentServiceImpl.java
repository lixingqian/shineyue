package com.shineyue.cn.service.Impl;

import com.shineyue.cn.mapper.StudentMapper;
import com.shineyue.cn.model.Student;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaobin
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;
    //根据id删除学生信息
    @Override
    public int deleteByPrimaryKey(String gId) {

        return studentMapper.deleteByPrimaryKey(gId);
    }
   //添加学生信息
    @Override
    public int insert(Student record) {

        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {

        return studentMapper.insertSelective(record);
    }

    //根据id查询学生信息
    @Override
    public Student selectByPrimaryKey(String gId) {

        return studentMapper.selectByPrimaryKey(gId);
    }
  //修改学生信息
    @Override
    public int updateByPrimaryKeySelective(Student record) {

        return studentMapper.updateByPrimaryKeySelective(record);
    }
    //修改学生信息
    @Override
    public int updateByPrimaryKey(Student record) {

        return studentMapper.updateByPrimaryKey(record);
    }
}
