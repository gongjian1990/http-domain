package com.didong.httpEntity;

import lombok.Data;

import java.util.Date;

/**
 * 举报图片表
 */
@Data
public class TbVideoReportPhoto {

    private Integer id;
    /*被举报视频*/
    private TbVideo videoId;
    /*图片url地址*/
    private String photoUrl;
    /*举报人*/
    private TbUserInfo userId;
    /*上传时间*/
    private Date uploadTime;

}
