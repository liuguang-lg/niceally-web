package com.niceally.webpage.mapper;

import com.niceally.webpage.domain.FirstLevelHeading;
import com.niceally.webpage.domain.LevelHeadingContent;

import java.util.List;

/**
 * 一级标题Mapper接口
 *
 * @author ruoyi
 * @date 2023-08-25
 */
public interface FirstLevelHeadingMapper {
    /**
     * 查询一级标题
     *
     * @param id 一级标题主键
     * @return 一级标题
     */
    public FirstLevelHeading selectFirstLevelHeadingById(Long id);

    /**
     * 查询一级标题列表
     *
     * @param firstLevelHeading 一级标题
     * @return 一级标题集合
     */
    public List<FirstLevelHeading> selectFirstLevelHeadingList(FirstLevelHeading firstLevelHeading);

    /**
     * 新增一级标题
     *
     * @param firstLevelHeading 一级标题
     * @return 结果
     */
    public int insertFirstLevelHeading(FirstLevelHeading firstLevelHeading);

    /**
     * 修改一级标题
     *
     * @param firstLevelHeading 一级标题
     * @return 结果
     */
    public int updateFirstLevelHeading(FirstLevelHeading firstLevelHeading);

    /**
     * 删除一级标题
     *
     * @param id 一级标题主键
     * @return 结果
     */
    public int deleteFirstLevelHeadingById(Long id);

    /**
     * 批量删除一级标题
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFirstLevelHeadingByIds(Long[] ids);

    /**
     * 批量删除内容
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLevelHeadingContentByLevelHeadingIds(Long[] ids);

    /**
     * 批量新增内容
     *
     * @param levelHeadingContentList 内容列表
     * @return 结果
     */
    public int batchLevelHeadingContent(List<LevelHeadingContent> levelHeadingContentList);


    /**
     * 通过一级标题主键删除内容信息
     *
     * @param id 一级标题ID
     * @return 结果
     */
    public int deleteLevelHeadingContentByLevelHeadingId(Long id);
}
