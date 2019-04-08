package com.didong.httpEntity;

import lombok.Data;

import java.util.Date;

@Data
public class TbPhoneBook {

    private Long id;

    private String udid;

    private String contactName;

    private String contactPhone;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
