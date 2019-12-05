package com.server.blog.myblog.auth.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author byteblogs
 * @since 2019-08-28
 */
@Data
@Accessors(chain = true)
public class AuthUserVO  {

    /**
     * 主键
     */
    private Long id;

    /**
     * 社交账户ID
     */
    private String socialId;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色主键 1 普通用户 2 admin
     */
    private Long roleId;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;

    private String token;

    private List<String> roles;

    private String introduction;

    /**
     * 邮箱
     */
    private String email;

    /**
     * github个人主页
     */
    private String htmlUrl;

    private String qq;

    private String csdn;

    private String weibo;

    private String twitter;



    private String facebook;
}
