package com.shineyue.cn.model;

public class Student {
    private String gId;

    private String gName;

    private Short gAge;

    private String gSex;

    private String gTeamId;

    private Short gStatus;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Short getgAge() {
        return gAge;
    }

    public void setgAge(Short gAge) {
        this.gAge = gAge;
    }

    public String getgSex() {
        return gSex;
    }

    public void setgSex(String gSex) {
        this.gSex = gSex == null ? null : gSex.trim();
    }

    public String getgTeamId() {
        return gTeamId;
    }

    public void setgTeamId(String gTeamId) {
        this.gTeamId = gTeamId == null ? null : gTeamId.trim();
    }

    public Short getgStatus() {
        return gStatus;
    }

    public void setgStatus(Short gStatus) {
        this.gStatus = gStatus;
    }
}