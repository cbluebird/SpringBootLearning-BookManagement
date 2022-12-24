package com.springbootlearning.controller.utility;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障");
    }
}
