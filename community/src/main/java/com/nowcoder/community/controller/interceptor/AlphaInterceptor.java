package com.nowcoder.community.controller.interceptor;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/11  15:34
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AlphaInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AlphaInterceptor.class);
    //在Controller之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("prehandler:"+handler.toString());
        return true; //返回true或false，用来决定之后的Controller是否执行，如果想不让某些方法执行，在此可以设置false
    }

    //在Controller之后执行,模板引擎(TemplateEngine)之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        logger.debug("postHandler:"+handler.toString());
    }

    //在模板引擎(TemplateEngine)之后执行

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("afterCompletion:"+handler.toString());
    }
}
