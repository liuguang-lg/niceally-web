package com.niceally.webpage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 内容对象 level_heading_content
 *
 * @author ruoyi
 * @date 2023-08-25
 */
public class LevelHeadingContent extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long levelHeadingId;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setLevelHeadingId(Long levelHeadingId) {
        this.levelHeadingId = levelHeadingId;
    }

    public Long getLevelHeadingId() {
        return levelHeadingId;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getPolicy() {
        return policy;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("levelHeadingId", getLevelHeadingId())
                .append("picture", getPicture())
                .append("briefIntroduction", getBriefIntroduction())
                .append("policy", getPolicy())
                .append("projectType", getProjectType())
                .append("contactInformation", getContactInformation())
                .append("linkUrl", getLinkUrl())
                .toString();
    }
}
