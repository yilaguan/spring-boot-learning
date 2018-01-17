package com.nd.bigdata.exceptions;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-17
 * Time: 下午11:04
 * AuthorEmail: zhangliangxgd@163.com
 */
public class ErrorMessage<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private long timestamp;
    private String url;
    private Integer code;
    private String message;
    private T data;

    public static Integer getOK() {
        return OK;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getUrl() {
        return url;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }
}
