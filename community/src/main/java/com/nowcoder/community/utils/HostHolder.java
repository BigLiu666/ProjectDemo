package com.nowcoder.community.utils;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/11  19:46
 */

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();
    public void setUser(User user){
        users.set(user);
    }
    public User getUser(){
        return users.get();
    }
    public void clear(){
        users.remove();
    }
}
