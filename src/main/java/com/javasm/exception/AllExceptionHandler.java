package com.javasm.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AllExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("allErroMessage", "全局异常#######"+e.getMessage());
        modelAndView.setViewName("common/500");
        e.printStackTrace();
        return modelAndView;
    }
}
