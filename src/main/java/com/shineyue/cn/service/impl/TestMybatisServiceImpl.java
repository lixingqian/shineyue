package com.shineyue.cn.service.impl;

import com.shineyue.cn.mapper.TStudentMapper;
import com.shineyue.cn.model.Student;
import com.shineyue.cn.model.TStudent;
import com.shineyue.cn.model.TStudentExample;
import com.shineyue.cn.service.TestMybatisService;
import javafx.scene.shape.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author ZengZhiPing
 * @Description:
 * @Date 2019/6/18 17:54
 * @Version 1.0
 */
@Service
public class TestMybatisServiceImpl  implements  TestMybatisService {

    @Autowired
    private TStudentMapper tStudentMapper;
    /**
    *@Author:ZengZhiPing
    *@param: * @param null
    *@Description: 这是一个测试方法
    *@Date: 15:25 2019/6/19
    */
    @Override
    public List<TStudent> findByExample() {
        TStudentExample tStudentExample=new TStudentExample();
        TStudentExample.Criteria criteria=tStudentExample.createCriteria();
        List <TStudent> list=tStudentMapper.selectByExample(tStudentExample);
        return list;
    }

    @Override
    public String updateByExample(TStudent tStudent) {
        TStudentExample tStudentExample=new TStudentExample();
        //这两句相当于创建where之后的条件
       TStudentExample.Criteria criteria=tStudentExample.createCriteria();
        criteria.andGIdEqualTo(tStudent.getgId());
       int index = tStudentMapper.updateByExampleSelective(tStudent,tStudentExample);
       if(index>0){
           return "修改成功";
       }
        return "修改失败";
    }

    @Override
    public List<TStudent> findByExample(TStudent tStudent) {

        TStudentExample tStudentExample=new TStudentExample();
        TStudentExample.Criteria criteria=tStudentExample.createCriteria();

        if(tStudent.getgName() != null && tStudent.getgName() != ""){
            criteria.andGNameEqualTo(tStudent.getgName());
        }
        if(tStudent.getgAge() != null ){
            criteria.andGAgeEqualTo(tStudent.getgAge());
        }
        if(tStudent.getgSex() != null && tStudent.getgSex() != "" ){
            criteria.andGSexEqualTo(tStudent.getgSex());
        }
        if(tStudent.getgTeamId() != null && tStudent.getgTeamId() != "" ){
            criteria.andGTeamIdEqualTo(tStudent.getgTeamId());
        }
        if(tStudent.getgStatus() != null){
            criteria.andGStatusEqualTo(tStudent.getgStatus());
        }else{
            criteria.andGStatusEqualTo((short)0);
        }

        return tStudentMapper.selectByExample(tStudentExample);
    }

    @Override
    public String delByExample(String id) {
        int index=tStudentMapper.deleteByPrimaryKey(id);
        if(index>0){
            return "删除成功";
        }
        return "删除失败";
    }

    @Override
    public String addByExample(TStudent tStudent) {
        tStudent.setgId(UUID.randomUUID().toString().replace("-",""));
            tStudent.setgStatus((short)0);
        int index=tStudentMapper.insertSelective(tStudent);
        if(index > 0){
            return "添加成功";
        }
        return "添加失败";
    }

    @Override
    public String updateStatus(String id) {
        TStudent tStudent=new TStudent();
        tStudent.setgId(id);
        tStudent.setgStatus((short)1);
        int index=tStudentMapper.updateByPrimaryKeySelective(tStudent);
        if(index > 0){
            return "逻辑删除成功";
        }
        return "逻辑删除失败";
    }
}
