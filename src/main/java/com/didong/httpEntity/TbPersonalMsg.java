package com.didong.httpEntity;

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

    private static final long serialVersionUID = 2232995282002557936L;
    /* 主键ID */
    private Long id;
    /* 用户ID */
    private Long userId;

    /* 消息内容 */
    private String msgContent;
    /* 操作人员 */
    private Long operater;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
