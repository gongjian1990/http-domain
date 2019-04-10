package com.didong.httpEntity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户关注表
 */
@Data
public class TbUserFollow implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
    private long id;
    /* 用户ID */
    private Long userId;
    /* 关注用户ID */
    private Long followUserId;
    /* 关注状态(0关注 1取消关注) */
    private Integer followStatus;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
