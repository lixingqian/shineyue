package com.shineyue.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YanJI
 */
@SpringBootApplication
//@ComponentScan(value="com.shineyue.cn",useDefaultFilters = true)//加载@Service @Control注解类
//@MapperScan(value = "com.shinyue.cn.mapper")  //mybatis 需要扫描mapper接口 dao层
//@EnableWebMvc                   //启用mvc
//@EnableTransactionManagement    //启用事务管理
public class ShineyueApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShineyueApplication.class, args);
        System.out.println("hello,springboot");
    }
    时光倒流

}
