package com.dgut.test.paper.messgae;


import lombok.Data;

@Data
public class JsonResult<T> {

    private Integer code;
    private String msg;
    private T data;

    //操作成功，有data数据
    public static JsonResult suc(Object data) {
        JsonResult result = new JsonResult();
        result.setResultCode(JsonCode.SUCCESS);
        result.setData(data);
        return result;
    }


    //运行错误,数据库连接错误
    public static JsonResult error() {
        JsonResult result = new JsonResult();
        result.setResultCode(JsonCode.ERROR);
        return result;
    }
    //运行错误,数据库连接错误
    public static JsonResult error(Integer code,String msg) {
        JsonResult result = new JsonResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


    private void setResultCode(JsonCode code) {
        this.code = code.code();
        this.msg = code.message();
    }





}
