package com.webserver.util;

public class Result<T> {
    private T body;
    private String error;
    private int code;


    public Result(T body,int code) {
        this.body = body;
        this.code = code;
    }

    public Result(String error, int code) {
        this.error = error;
        this.code = code;
    }
}
