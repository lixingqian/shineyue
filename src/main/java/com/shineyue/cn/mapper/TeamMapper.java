package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @quthor:李启云
 * @date:2019/6/17-20-12
 */

@Mapper
public interface TeamMapper {
    List<Team> biglist();
}
