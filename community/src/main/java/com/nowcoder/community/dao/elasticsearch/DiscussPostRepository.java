package com.nowcoder.community.dao.elasticsearch;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/27  15:51
 */

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost,Integer> {

}
