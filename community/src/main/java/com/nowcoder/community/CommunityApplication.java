package com.nowcoder.community;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/4  20:17
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
//@MapperScan(basePackages = {"com.atguigu.community.dao"})
public class CommunityApplication {
    @PostConstruct
    public void init(){
        //解决netty启动冲突问题
        //see Netty4Utils.setAvailableProcessors
        System.setProperty("es.set.netty.runtime.available.processors","false");
    }
    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class,args);
    }
}
