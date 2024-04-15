package com.comp208.Catch;

import com.comp208.error.BaseException;
import com.comp208.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Created by comp208 on 2024.3.1.
 * @date
 * @description
 */
@ControllerAdvice
@Slf4j
public class HandleException {

    /**
     * 全局统一异常返回信息
     */
    public static final String DEFAULT_ERROR_MESSAGE = "error";

    /**
     * 500的所有异常会被这个方法捕获
     *
     * @param req 请求
     * @param e   异常
     * @return 输出
     * @throws Exception 未知异常
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResponse handleAllError(HttpServletRequest req, Exception e) {
        log.error("error", e);
        return BaseResponse.fail();
    }

    /**
     * 500的事务异常会被这个方法捕获
     *
     * @param req 请求
     * @param e   异常
     * @return 输出
     * @throws Exception 未知异常
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResponse handleBizError(HttpServletRequest req, BaseException e) {
        log.error("error", e);
        return BaseResponse.fail(e.getMsg());
    }
}
