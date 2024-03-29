package com.nowcoder.community.utils;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/7  15:40
 */

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.Map;
import java.util.UUID;

public class CommunityUtil {
    //生成随机字符串
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //MD5加密，只能加密，不能解密
    //MD5加密之后，翻译成同一个字符串，别人要想解密，他有一个库
    //比如 hello -->abc123  所以通常hello+3eabc（随机字符串）-->再加密
    public static String md5(String key){
        //这个方法是判断是否为空或空格
        if(StringUtils.isBlank(key)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

    public static String getJSONString(int code, String msg, Map<String,Object> map){
        JSONObject json = new JSONObject();
        json.put("code",code);
        json.put("msg",msg);
        if (map != null){
            for (String key:map.keySet()){
                json.put(key,map.get(key));
            }
        }
        return json.toJSONString();
    }

    public static String getJSONString(int code, String msg){
        return getJSONString(code,msg,null);
    }
    public static String getJSONString(int code){
        return getJSONString(code,null,null);
    }
}
