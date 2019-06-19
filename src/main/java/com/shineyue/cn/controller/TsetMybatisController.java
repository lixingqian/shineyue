package com.shineyue.cn.controller;

import com.shineyue.cn.model.TStudent;
import com.shineyue.cn.service.TestMybatisService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author ZengZhiPing
 * @Description:
 * @Date 2019/6/18 18:04
 * @Version 1.0
 */
@RestController
public class TsetMybatisController {

    @Autowired
    private TestMybatisService testMybatisService;

    /**
     * 用于测试
     * @return
     */
    @RequestMapping("test")
    public List<TStudent> test(){
        return testMybatisService.findByExample();
    }

    @RequestMapping("updateStatus")
    public String updateStatus(String id){
        return testMybatisService.updateStatus(id);
    }


    @RequestMapping("addByExample")
    public String addByExample( @Param("name")String name ,
                               @Param("age")String age, @Param("sex") String sex,
                               @Param("teamId") String teamId){


        TStudent tStudent=new TStudent();
        if(name != null && name != ""){
            tStudent.setgName(name);
        }else{
            return "姓名能为空";
        }
        if(sex != null && sex != ""){
            tStudent.setgSex(sex);
        }else{
            return "性别不能为空";
        }
        if(teamId != null && teamId != ""){
            tStudent.setgTeamId(teamId);
        }
        if(age != null ){
            tStudent.setgAge(Short.parseShort(age));
        }


        return testMybatisService.addByExample(tStudent);
    }

    /**
     * 更新学生信息接口
     * @param id
     * @param name
     * @param age
     * @param sex
     * @param teamId
     * @return
     */
    @RequestMapping("updateExample")
    public String updateExample( @Param("id") String id, @Param("name")String name ,
                                 @Param("age")String age, @Param("sex") String sex,
                                 @Param("teamId") String teamId){
        if(id == null || id == ""){
            return "id不能为空";
        }

        TStudent tStudent=new TStudent();
        tStudent.setgId(id);
        tStudent.setgTeamId(teamId);
        tStudent.setgName(name);
        if(age != null ){
            tStudent.setgAge(Short.parseShort(age));
        }
        tStudent.setgSex(sex);
        return testMybatisService.updateByExample(tStudent);
    }


    /**
     * 查询学生信息接口
     * @param id
     * @param name
     * @param age
     * @param sex
     * @param teamId
     * @param status
     * @return
     */
    @RequestMapping("findByExample")
    public List<TStudent> findByExample(@Param("id") String id, @Param("name")String name ,
                                        @Param("age")String age, @Param("sex") String sex,
                                        @Param("teamId") String teamId,@Param("status") String status){

        TStudent tStudent=new TStudent();
        tStudent.setgTeamId(teamId);
        tStudent.setgName(name);
        if(age != null ){
            tStudent.setgAge(Short.parseShort(age));
        }
        tStudent.setgSex(sex);
        if(status != null ) {
            tStudent.setgStatus(Short.parseShort(status));
        }
        return testMybatisService.findByExample(tStudent);
    }

    /**
     * 删除学生信息接口,默认删除第一个,且状态为1的数
     * @param name
     * @param age
     * @param sex
     * @param teamId
     * @return
     */
    @RequestMapping("delByExample")
    public String delByExample(@Param("name")String name ,
                               @Param("age")String age, @Param("sex") String sex,
                               @Param("teamId") String teamId){
        TStudent tStudent=new TStudent();
        tStudent.setgTeamId(teamId);
        tStudent.setgName(name);
        if(age != null ) {
            tStudent.setgStatus(Short.parseShort(age));
        }


        tStudent.setgAge((short)1);
        tStudent.setgSex(sex);
        //先通过输入的信息，查询是否有此学生信息
       List<TStudent> list= testMybatisService.findByExample(tStudent);
        if(list.size() <= 0){
            return "删除失败，找不到此学生信息";
        }
        //选择第一个学生进行删除
        String id=list.get(0).getgId();
        return testMybatisService.delByExample(id);
    }




}
