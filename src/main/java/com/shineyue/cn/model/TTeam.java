package com.shineyue.cn.model;

public class TTeam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.g_id
     *
     * @mbggenerated
     */
    private String gId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.g_name
     *
     * @mbggenerated
     */
    private String gName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.g_id
     *
     * @return the value of t_team.g_id
     *
     * @mbggenerated
     */
    public String getgId() {
        return gId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.g_id
     *
     * @param gId the value for t_team.g_id
     *
     * @mbggenerated
     */
    public void setgId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.g_name
     *
     * @return the value of t_team.g_name
     *
     * @mbggenerated
     */
    public String getgName() {
        return gName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.g_name
     *
     * @param gName the value for t_team.g_name
     *
     * @mbggenerated
     */
    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }
}