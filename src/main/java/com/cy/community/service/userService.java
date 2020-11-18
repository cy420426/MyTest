package com.cy.community.service;


import com.cy.community.dao.discussUserdao;
import com.cy.community.entity.discussUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private discussUserdao userdao;

    public discussUser finduserById(int id){
        System.out.println(userdao.selectByid(id)+"曹越1");
        return userdao.selectByid(id);
    }

}
