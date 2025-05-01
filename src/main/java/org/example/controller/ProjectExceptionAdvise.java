package org.example.controller;

import org.example.exception.BusinessException;
import org.example.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvise {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
//       记录日志
//        发送消息给运维
//        发送邮件给开发人
//        返回消息
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doSystemException(BusinessException ex){
//        返回消息
        return new Result(ex.getCode(),null,ex.getMessage());
    }

//    处理其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        //       记录日志
//        发送消息给运维
//        发送邮件给开发人
//        返回消息
        return new Result(Code.Unknown_ERR1, null, ex.toString());
    }
}
