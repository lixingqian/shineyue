package com.shineyue.cn.service;

import com.shineyue.cn.model.Student;
import com.shineyue.cn.model.TStudent;

import java.util.List;

/**
 * @Author ZengZhiPing
 * @Description:
 * @Date 2019/6/18 17:52
 * @Version 1.0
 */
public interface TestMybatisService {
    /**
     * 测试Example方法
     * @return
     */
    List<TStudent> findByExample();

    /**
     * 添加修改接口
     * @param tStudent
     * @return
     */
    String updateByExample(TStudent tStudent);

    /**
     * 查找数据
     * @param tStudent
     * @return
     */
    List<TStudent> findByExample(TStudent tStudent);

    /**
     * 删除数据
     * @param id
     * @return
     */
    String delByExample(String id);

    /**
     * 增加数据
     * @param tStudent
     * @return
     */
    String addByExample(TStudent tStudent);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    String updateStatus(String id);
}
