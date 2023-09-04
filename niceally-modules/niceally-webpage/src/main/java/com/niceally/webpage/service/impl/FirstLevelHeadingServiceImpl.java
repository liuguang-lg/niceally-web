package com.niceally.webpage.service.impl;

import com.niceally.webpage.domain.FirstLevelHeading;
import com.niceally.webpage.domain.LevelHeadingContent;
import com.niceally.webpage.mapper.FirstLevelHeadingMapper;
import com.niceally.webpage.service.IFirstLevelHeadingService;
import com.niceally.webpage.utils.UUidUtils;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.core.utils.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 一级标题Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-25
 */
@Service
public class FirstLevelHeadingServiceImpl implements IFirstLevelHeadingService {

    @Resource
    private FirstLevelHeadingMapper firstLevelHeadingMapper;

    /**
     * 查询一级标题
     *
     * @param id 一级标题主键
     * @return 一级标题
     */
    @Override
    public FirstLevelHeading selectFirstLevelHeadingById(String id) {
        return firstLevelHeadingMapper.selectFirstLevelHeadingById(id);
    }

    /**
     * 查询一级标题列表
     *
     * @param firstLevelHeading 一级标题
     * @return 一级标题
     */
    @Override
    public List<FirstLevelHeading> selectFirstLevelHeadingList(FirstLevelHeading firstLevelHeading) {
        return firstLevelHeadingMapper.selectFirstLevelHeadingList(firstLevelHeading);
    }

    /**
     * 新增一级标题
     *
     * @param firstLevelHeading 一级标题
     * @return 结果
     */
    @Transactional
    @Override
    public int insertFirstLevelHeading(FirstLevelHeading firstLevelHeading) {
        firstLevelHeading.setId(UUidUtils.getUUid());
        int rows = firstLevelHeadingMapper.insertFirstLevelHeading(firstLevelHeading);
        insertLevelHeadingContent(firstLevelHeading);
        return rows;
    }

    /**
     * 修改一级标题
     *
     * @param firstLevelHeading 一级标题
     * @return 结果
     */
    @Transactional
    @Override
    public int updateFirstLevelHeading(FirstLevelHeading firstLevelHeading) {
        firstLevelHeading.setUpdateTime(DateUtils.getNowDate());
        firstLevelHeadingMapper.deleteLevelHeadingContentByLevelHeadingId(firstLevelHeading.getId());
        insertLevelHeadingContent(firstLevelHeading);
        return firstLevelHeadingMapper.updateFirstLevelHeading(firstLevelHeading);
    }

    /**
     * 批量删除一级标题
     *
     * @param ids 需要删除的一级标题主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteFirstLevelHeadingByIds(String[] ids) {
        firstLevelHeadingMapper.deleteLevelHeadingContentByLevelHeadingIds(ids);
        return firstLevelHeadingMapper.deleteFirstLevelHeadingByIds(ids);
    }

    /**
     * 删除一级标题信息
     *
     * @param id 一级标题主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteFirstLevelHeadingById(String id) {
        firstLevelHeadingMapper.deleteLevelHeadingContentByLevelHeadingId(id);
        return firstLevelHeadingMapper.deleteFirstLevelHeadingById(id);
    }

    /**
     * 新增内容信息
     *
     * @param firstLevelHeading 一级标题对象
     */
    public void insertLevelHeadingContent(FirstLevelHeading firstLevelHeading) {
        List<LevelHeadingContent> levelHeadingContentList = firstLevelHeading.getLevelHeadingContentList();
        if (StringUtils.isNotNull(levelHeadingContentList)) {
            levelHeadingContentList.forEach(a -> a.setLevelHeadingId(firstLevelHeading.getId()));
            firstLevelHeadingMapper.batchLevelHeadingContent(levelHeadingContentList);
        }
    }

    /**
     * 删除子级标题
     * @param ids
     * @return
     */
    @Override
    public int deleteLevelHeadingByIds(String[] ids) {
        return firstLevelHeadingMapper.deleteLevelHeadingByIds(ids);
    }

}
