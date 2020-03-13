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
@TableName("t_system")
public class System implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String systemId;

    private String name;

    private String enName;

    private String path;

    private String serializeNum;

    private String createTime;

    private String orderNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSerializeNum() {
        return serializeNum;
    }

    public void setSerializeNum(String serializeNum) {
        this.serializeNum = serializeNum;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "System{" +
        "id=" + id +
        ", systemId=" + systemId +
        ", name=" + name +
        ", enName=" + enName +
        ", path=" + path +
        ", serializeNum=" + serializeNum +
        ", createTime=" + createTime +
        ", orderNum=" + orderNum +
        "}";
    }
}
