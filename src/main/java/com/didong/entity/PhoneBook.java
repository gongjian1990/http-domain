package com.didong.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PhoneBook {

    private Integer id;

    private String udid;

    private String contactName;

    private String contact_phone;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
