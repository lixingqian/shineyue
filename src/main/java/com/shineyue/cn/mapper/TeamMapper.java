package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(String gId);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(String gId);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}