package com.shineyue.cn.service;

import java.util.List;

/**
 * @author jianghua
 * @date 2019/6/18
 */
public interface BaseService<T> {

    /**
     * 增加
     * @param t
     * @return Integer
     */
    Integer add (T t);

    /**
     * 删除
     * @param id
     * @return Integer
     */
    Integer delete (String id);

    /**
     * 修改
     * @param t
     * @return Integer
     */
    Integer update (T t);

    /**
     * 根据ID查询
     * @param id
     * @return Integer
     */
    T selectById (String id);

    /**
     * 查询所有
     * @return List
     */
    List<T> selectAll ();
}
