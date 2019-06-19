package com.shineyue.cn;

import com.shineyue.cn.mapper.TTeamMapper;
import com.shineyue.cn.model.TTeam;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author ZengZhiPing
 * @Description:
 * @Date 2019/6/18 17:49
 * @Version 1.0
 */
public class TestMybatisGeneration {
    public  void test(StringBuffer x,StringBuffer y){
        x.append(y);
        System.out.println(x);
        y=x;
        System.out.println(y);
    }


    public static void main(String[] args) {

        TestMybatisGeneration t= new TestMybatisGeneration();
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        t.test(a,b);
        System.out.println(a+"."+b);

    }




}
