package com.comp208.error;

import lombok.Data;

/**
 * @author Created by comp208 on 2024.3.1.
 * @date
 * @description
 */
@Data
public class BaseException extends RuntimeException {

    private int code;
    private String msg;

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
