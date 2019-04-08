package com.didong.httpEntity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频点赞表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
public class TbVideoThumbsUp implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
    private long id;
    /* 视频ID */
    private Long videoId;
    /* 拍摄用户ID */
    private Long userId;
    /* 点赞用户ID */
    private Long thumbUpUserId;
    /* 删除标识 */
    private Boolean delFlag;
    /* 点赞时间 */
    private Date thumbUpTime;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
