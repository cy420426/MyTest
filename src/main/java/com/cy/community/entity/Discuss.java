package com.cy.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
@Data
public class Discuss {
    private Integer id;
    private Integer userId;
    private String title;//帖子标题
    private String content;//帖子内容
    private Integer type;//帖子类型0普通1置顶
    private Integer status;//帖子状态0正常1精华2拉黑
    private Date createTime;//帖子创建时间
    private int commentCount;//帖子评论数量
    private double score;//帖子分数用于排名


}
