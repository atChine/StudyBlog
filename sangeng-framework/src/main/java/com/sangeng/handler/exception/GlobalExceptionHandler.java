package com.sangeng.handler.exception;

import com.sangeng.enums.AppHttpCodeEnum;
import com.sangeng.exception.SystemException;
import com.sangeng.result.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 登录异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(SystemException.class)
    public ResponseResult systemExceptionHandler(SystemException e){
        log.error("出现异常啦 {}",e);
        return ResponseResult.errorResult(e.getCode(), e.getMsg());
    }

    /**
     * 出现其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseResult ExceptionHandler(Exception e){
        log.error("出现异常啦 {}",e);
        return ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR.getCode(), e.getMessage());
    }
}
