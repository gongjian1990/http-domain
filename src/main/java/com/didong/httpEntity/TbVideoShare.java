package com.didong.httpEntity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频分享表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
public class TbVideoShare implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
    private long id;
    /* 视频ID */
    private Long videoId;
    /* 拍摄用户ID */
    private Long userId;
    /* 分享人ID */
    private Long shareUserId;
    /* 分享平台 */
    private String sharePlatform;
    /* 分享平台 */
    private String shareTime;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
