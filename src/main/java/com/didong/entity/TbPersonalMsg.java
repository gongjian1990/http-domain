package com.didong.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 个人消息表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
public class TbPersonalMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long mId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 消息内容
     */
    private String msgContent;

    /**
     * 操作人员 
     */
    private Long operater;

    /**
     * 点赞时间
     */
    private Date createTime;


}