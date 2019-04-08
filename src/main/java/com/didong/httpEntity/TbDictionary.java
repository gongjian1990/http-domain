package com.didong.httpEntity;

import lombok.Data;

import java.util.Date;

@Data
public class TbDictionary {

    private long id;

    private String operator;

    private String optGroup;

    private String optCode;

    private String optValue;

    private String optDesc;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
