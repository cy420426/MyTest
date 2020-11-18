package com.cy.community.dao;


import com.cy.community.entity.discussUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface discussUserdao {
    //根据id查询用户
    discussUser selectByid(int id);
    //根据用户名查询用户
    discussUser selectByName(String username);
    //根据用户email查询用户
    discussUser selectByEmail(String email);
    //插入用户
    int insertUser(discussUser user);
    //更新用户状态
    int updateStatus(int id,int status);
    //更新用户头像
    int updateHeader(int id,String headerUrl);
    //修改用户密码
    int updatePassword(int id,String password);

}
