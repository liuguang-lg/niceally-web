package com.niceally.webpage.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import lombok.Data;

/**
 * 内容对象 level_heading_content
 *
 * @author ruoyi
 * @date 2023-08-25
 */
@Data
public class LevelHeadingContent extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * $column.columnComment
     */
    private String levelHeadingId;
    /**
     * 名称
     */
    @Excel(name = "名称")
    private String region;
    /**
     * 图片
     */
    @Excel(name = "图片")
    private String picture;

    /**
     * 简介
     */
    @Excel(name = "简介")
    private String briefIntroduction;

    /**
     * 政策
     */
    @Excel(name = "政策")
    private String policy;

    /**
     * 可承接项目类型
     */
    @Excel(name = "可承接项目类型")
    private String projectType;

    /**
     * 联系方式
     */
    @Excel(name = "联系方式")
    private String contactInformation;

    /**
     * 链接地址
     */
    @Excel(name = "链接地址")
    private String linkUrl;

}
