package com.shineyue.cn.model;

/**
 * @author xiaobin
 */
public class Student {
    private String gId;

    private String gName;

    private Short gAge;

    private String gSex;

    private String gTeamId;

    private Short gType;

    public Student() {
    }

    public Student(String gName, Short gAge, String gSex, String gTeamId) {
        this.gName = gName;
        this.gAge = gAge;
        this.gSex = gSex;
        this.gTeamId = gTeamId;
    }

    public Student(String gId, String gName, Short gAge, String gSex, String gTeamId, Short gType) {
        this.gId = gId;
        this.gName = gName;
        this.gAge = gAge;
        this.gSex = gSex;
        this.gTeamId = gTeamId;
        this.gType = gType;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
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
        this.gSex = gSex;
    }

    public String getgTeamId() {
        return gTeamId;
    }

    public void setgTeamId(String gTeamId) {
        this.gTeamId = gTeamId;
    }

    public Short getgType() {
        return gType;
    }

    public void setgType(Short gType) {
        this.gType = gType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gId='" + gId + '\'' +
                ", gName='" + gName + '\'' +
                ", gAge=" + gAge +
                ", gSex='" + gSex + '\'' +
                '}';
    }
}