package com.comp208.response;

import com.comp208.Catch.HandleException;
import lombok.Data;

@Data
public class BaseResponse {

    private int result;

    private String msg;

    private Object data;

    public BaseResponse(int result) {
        this.result = result;
    }

    public BaseResponse(int result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public BaseResponse(int result, String msg, Object data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public static BaseResponse fail() {
        return new BaseResponse(0, HandleException.DEFAULT_ERROR_MESSAGE);
    }

    public static BaseResponse fail(String msg) {
        return new BaseResponse(0, msg);
    }

    public static BaseResponse fail(int result) {
        return new BaseResponse(result);
    }

    public static BaseResponse success() {
        return new BaseResponse(1, "success");
    }

    public static BaseResponse success(String msg) {
        return new BaseResponse(1, msg);
    }

    public static BaseResponse success(Object data) {
        return new BaseResponse(1, "success", data);
    }

    public static BaseResponse success(String msg, Object data) {
        return new BaseResponse(1, msg, data);
    }
}