package com.cy.community.dao;
import com.cy.community.entity.Discuss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository//加了注解才可以扫描
public interface DiscussDao {
    //根据用户id查询帖子返回集合,并分页显示
    List<Discuss> selectDiscuss(int userId, int offset, int limit);
    //查询帖子行数(@Param注解给参数起别名，如果需要动态sql，参数只有一个必须起别名)
    int selectDiscussCount(@Param("userId") int userId);




}
