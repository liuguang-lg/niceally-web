package com.niceally.webpage.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * 一级标题对象 first_level_heading
 *
 * @author ruoyi
 * @date 2023-08-25
 */
@Data
public class FirstLevelHeading extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private String id;

    /**
     * 父级id
     */
    private String parentId;
    /**
     * 标题
     */
    @Excel(name = "标题")
    private String headline;

    /**
     * 排序
     */
    @Excel(name = "排序")
    private Long sort;

    /**
     * 内容信息
     */
    private List<LevelHeadingContent> levelHeadingContentList;

}
