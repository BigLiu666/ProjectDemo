package com.nowcoder.community;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/4  20:17
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = {"com.atguigu.community.dao"})
public class CommunityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class,args);
    }
}
