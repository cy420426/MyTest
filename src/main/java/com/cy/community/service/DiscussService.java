package com.cy.community.service;
import com.cy.community.dao.DiscussDao;
import com.cy.community.entity.Discuss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussService {
    @Autowired
    private DiscussDao discussDao;
    //查询用户的帖子列表，并显示username
    public List<Discuss> findDiscuss(int userId, int offset, int limit)
    {
        return discussDao.selectDiscuss(userId, offset, limit);
    }
//查询用户帖子列表数量
    public int findDiscussrows(int userId){

        return discussDao.selectDiscussCount(userId);
    }

}
