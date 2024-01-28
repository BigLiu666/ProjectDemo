package com.nowcoder.community;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/4  20:26
 */

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.LoginTicketMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.LoginTicket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {
    @Autowired
    private LoginTicketMapper loginTicketMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testSelectPost(){
        List<DiscussPost> discussPosts =
                discussPostMapper.selectDiscussPosts(0, 0, 10);
        for(DiscussPost discussPost:discussPosts){
            System.out.println(discussPost);
        }
    }

    @Test
    public void testInserLoginTicket(){
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setUserId(101);
        loginTicket.setStatus(0);
        loginTicket.setTicket("abc");
        loginTicket.setExpired(new Date(System.currentTimeMillis()+1000*60*10));
        loginTicketMapper.insertLoginTicket(loginTicket);
    }
    @Test
    public void testSelectAndUpdateLoginTicket(){
        LoginTicket loginTicket = loginTicketMapper.selectByTicket("abc");
        System.out.println(loginTicket);
        loginTicketMapper.updateStatus(loginTicket.getTicket(),1);
        System.out.println(loginTicket);
    }

}
