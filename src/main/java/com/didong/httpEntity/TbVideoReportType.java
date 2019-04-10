package com.didong.httpEntity;

import lombok.Data;

/**
 * 举报类型表
 */
@Data
public class TbVideoReportType {

    /*举报Id*/
    private Integer id;
    /*上级目录Id*/
    private Integer upId;
    /*举报code*/
    private String reportTypeCode;
    /*举报类型表述*/
    private String reportContent;

}
