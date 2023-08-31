package com.niceally.webpage.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * 一级标题对象 first_level_heading
 *
 * @author ruoyi
 * @date 2023-08-25
 */
public class FirstLevelHeading extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 标题
     */
    @Excel(name = "标题")
    private String headline;

    /**
     * 地区
     */
    @Excel(name = "地区")
    private String region;

    /**
     * 排序
     */
    @Excel(name = "排序")
    private Long sort;

    /**
     * 内容信息
     */
    private List<LevelHeadingContent> levelHeadingContentList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getSort() {
        return sort;
    }

    public List<LevelHeadingContent> getLevelHeadingContentList() {
        return levelHeadingContentList;
    }

    public void setLevelHeadingContentList(List<LevelHeadingContent> levelHeadingContentList) {
        this.levelHeadingContentList = levelHeadingContentList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("headline", getHeadline())
                .append("region", getRegion())
                .append("sort", getSort())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("levelHeadingContentList", getLevelHeadingContentList())
                .toString();
    }
}
