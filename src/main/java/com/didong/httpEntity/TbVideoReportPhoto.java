package com.didong.httpEntity;

import lombok.Data;

import java.util.Date;

/**
 * 举报图片表
 */
@Data
public class TbVideoReportPhoto {

    private Integer id;
    /*举报图片id*/
    private Long reportPhotoId;
    /*被举报视频id*/
    private Long videoId;
    /*图片url地址*/
    private String photoUrl;
    /*举报人*/
    private Long userId;
    /*上传时间*/
    private Date uploadTime;

}
