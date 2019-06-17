package com.shineyue.cn.model;

import java.util.List;

/**
 * @quthor:李启云
 * @date:2019/6/17-20-02
 */
public class Team {
    private  Integer g_id;
    private  String g_name;
    private List<Student> list;

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                ", list=" + list +
                '}';
    }
}
