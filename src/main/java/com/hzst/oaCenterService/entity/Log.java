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
@TableName("t_log")
public class Log implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String logId;

    private String operationType;

    private String operationUserId;

    private String requestPath;

    private String requestParam;

    private String operationTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(String operationUserId) {
        this.operationUserId = operationUserId;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public String toString() {
        return "Log{" +
        "id=" + id +
        ", logId=" + logId +
        ", operationType=" + operationType +
        ", operationUserId=" + operationUserId +
        ", requestPath=" + requestPath +
        ", requestParam=" + requestParam +
        ", operationTime=" + operationTime +
        "}";
    }
}
