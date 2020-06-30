package net.zhaoqing.shopmall.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    //@ExceptionHandler(value =Exception.class)
    @ResponseBody
    public String exceptionHandler(HttpServletRequest req, Exception e){
        System.out.println(e.toString());
        return "failure"+"-"+e.toString();
    }

}
