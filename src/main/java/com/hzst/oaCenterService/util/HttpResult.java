package com.hzst.oaCenterService.util;

public class HttpResult {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }
    public HttpResult setCode(Integer code) {
        this.code = code;
        return this;
    }
    public String getMsg() {
        return msg;
    }
    public HttpResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public Object getData() {
        return data;
    }
    public HttpResult setData(Object data) {
        this.data = data;
        return this;
    }

    public static HttpResult success() {
        HttpResult result = new HttpResult();
        result.setCode(666);
        result.setMsg("操作成功");
        return result;
    }

    public static HttpResult fail() {
        HttpResult result = new HttpResult();
        result.setCode(555);
        result.setMsg("操作失败");
        return result;
    }
}
