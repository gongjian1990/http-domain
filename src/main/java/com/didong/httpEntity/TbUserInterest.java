package com.didong.httpEntity;

import lombok.Data;

import java.util.Date;

@Data
public class TbUserInterest {

    private long id;

    private String userId;

    private String optCode;

    private String optValue;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
