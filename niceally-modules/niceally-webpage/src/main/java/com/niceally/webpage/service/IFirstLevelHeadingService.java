package com.niceally.webpage.service;

import com.niceally.webpage.domain.FirstLevelHeading;

import java.util.List;

/**
 * 一级标题Service接口
 *
 * @author ruoyi
 * @date 2023-08-25
 */
public interface IFirstLevelHeadingService {
    /**
     * 查询一级标题
     *
     * @param id 一级标题主键
     * @return 一级标题
     */
    FirstLevelHeading selectFirstLevelHeadingById(String id);

    /**
     * 查询一级标题列表
     *
     * @param firstLevelHeading 一级标题
     * @return 一级标题集合
     */
    List<FirstLevelHeading> selectFirstLevelHeadingList(FirstLevelHeading firstLevelHeading);

    /**
     * 新增一级标题
     *
     * @param firstLevelHeading 一级标题
     * @return 结果
     */
    int insertFirstLevelHeading(FirstLevelHeading firstLevelHeading);

    /**
     * 修改一级标题
     *
     * @param firstLevelHeading 一级标题
     * @return 结果
     */
    int updateFirstLevelHeading(FirstLevelHeading firstLevelHeading);

    /**
     * 批量删除一级标题
     *
     * @param ids 需要删除的一级标题主键集合
     * @return 结果
     */
    int deleteFirstLevelHeadingByIds(String[] ids);

    /**
     * 删除一级标题信息
     *
     * @param id 一级标题主键
     * @return 结果
     */
    int deleteFirstLevelHeadingById(String id);

    /**
     * 删除子级标题
     * @param ids
     * @return
     */
    int deleteLevelHeadingByIds(String[] ids);
}
