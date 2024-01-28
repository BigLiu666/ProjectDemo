package com.nowcoder.community.annotation;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/16  15:01
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {


}
