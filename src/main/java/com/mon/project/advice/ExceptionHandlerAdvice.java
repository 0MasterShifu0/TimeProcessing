package com.mon.project.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    //拦截所有Exception,展示Error页面
    @ExceptionHandler(value = Exception.class)
    public String exception(Exception exception, WebRequest webRequest,Model model){
        model.addAttribute("erroMessage",exception.getMessage());
        return   "error";
    }

    //将额外键值添加到所有全局请求参数中
    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("msg","额外信息");
    }

    //忽略请求中的id参数
//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder){
//        webDataBinder.setDisallowedFields("id");
//    }


}
