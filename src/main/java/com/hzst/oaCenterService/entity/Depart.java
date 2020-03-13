package com.hzst.oaCenterService.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wm
 * @since 2020-03-13
 */
@TableName("t_depart")
public class Depart implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String departId;

    private String name;

    private String num;

    private String departCode;

    private String level;

    private String shortName;

    private String responsibleId;

    private String responsibleName;

    private String leaderId;

    private String leaderName;

    private String isMechanism;

    private String isEnable;

    private String orderNum;

    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getResponsibleId() {
        return responsibleId;
    }

    public void setResponsibleId(String responsibleId) {
        this.responsibleId = responsibleId;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getIsMechanism() {
        return isMechanism;
    }

    public void setIsMechanism(String isMechanism) {
        this.isMechanism = isMechanism;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Depart{" +
        "id=" + id +
        ", departId=" + departId +
        ", name=" + name +
        ", num=" + num +
        ", departCode=" + departCode +
        ", level=" + level +
        ", shortName=" + shortName +
        ", responsibleId=" + responsibleId +
        ", responsibleName=" + responsibleName +
        ", leaderId=" + leaderId +
        ", leaderName=" + leaderName +
        ", isMechanism=" + isMechanism +
        ", isEnable=" + isEnable +
        ", orderNum=" + orderNum +
        ", description=" + description +
        "}";
    }
}
