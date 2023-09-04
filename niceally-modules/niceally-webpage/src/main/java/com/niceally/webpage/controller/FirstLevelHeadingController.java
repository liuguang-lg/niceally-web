package com.niceally.webpage.controller;

import com.niceally.webpage.domain.FirstLevelHeading;
import com.niceally.webpage.service.IFirstLevelHeadingService;
import com.ruoyi.common.core.utils.StringUtils;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 一级标题Controller
 *
 * @author ruoyi
 * @date 2023-08-25
 */
@RestController
@RequestMapping("/heading")
public class FirstLevelHeadingController extends BaseController {

    @Resource
    private IFirstLevelHeadingService firstLevelHeadingService;

    /**
     * 查询一级标题列表
     */
//    @RequiresPermissions("heading:heading:list")
    @GetMapping("/list")
    public TableDataInfo list(FirstLevelHeading firstLevelHeading, String paramsO) {
        System.err.println("params---" + paramsO);
        startPage();
        List<FirstLevelHeading> list = firstLevelHeadingService.selectFirstLevelHeadingList(firstLevelHeading);
        return getDataTable(list);
    }

    /**
     * 导出一级标题列表
     */
    @RequiresPermissions("heading:heading:export")
    @Log(title = "一级标题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FirstLevelHeading firstLevelHeading) {
        List<FirstLevelHeading> list = firstLevelHeadingService.selectFirstLevelHeadingList(firstLevelHeading);
        ExcelUtil<FirstLevelHeading> util = new ExcelUtil<>(FirstLevelHeading.class);
        util.exportExcel(response, list, "一级标题数据");
    }

    /**
     * 获取一级标题详细信息
     */
//    @RequiresPermissions("heading:heading:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return success(firstLevelHeadingService.selectFirstLevelHeadingById(id));
    }

    /**
     * 新增一级标题
     */
    @RequiresPermissions("heading:heading:add")
    @Log(title = "一级标题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FirstLevelHeading firstLevelHeading) {
        return toAjax(firstLevelHeadingService.insertFirstLevelHeading(firstLevelHeading));
    }

    /**
     * 修改一级标题
     */
    @RequiresPermissions("heading:heading:edit")
    @Log(title = "一级标题", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    public AjaxResult edit(@RequestBody FirstLevelHeading firstLevelHeading) {
        return toAjax(firstLevelHeadingService.updateFirstLevelHeading(firstLevelHeading));
    }

    /**
     * 删除一级标题
     */
    @RequiresPermissions("heading:heading:remove")
    @Log(title = "一级标题", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(firstLevelHeadingService.deleteFirstLevelHeadingByIds(ids));
    }

    /**
     * 新增子级标题
     */
    @RequiresPermissions("heading:heading:add")
    @Log(title = "新增子级标题", businessType = BusinessType.INSERT)
    @PostMapping("/addSub")
    public AjaxResult addSub(@RequestBody FirstLevelHeading firstLevelHeading) {
        if (StringUtils.isBlank(firstLevelHeading.getParentId())) {
            return error("参数异常！");
        }
        return success(firstLevelHeadingService.insertFirstLevelHeading(firstLevelHeading));
    }

    /**
     * 修改子级标题
     */
    @RequiresPermissions("heading:heading:edit")
    @Log(title = "修改子级标题", businessType = BusinessType.UPDATE)
    @PostMapping("/editSub")
    public AjaxResult editSub(@RequestBody FirstLevelHeading firstLevelHeading) {
        if (StringUtils.isBlank(firstLevelHeading.getParentId())) {
            return error("参数异常！");
        }
        return toAjax(firstLevelHeadingService.updateFirstLevelHeading(firstLevelHeading));
    }

    /**
     * 删除子级标题
     */
    @RequiresPermissions("heading:heading:remove")
    @Log(title = "删除子级标题", businessType = BusinessType.DELETE)
    @DeleteMapping("/deleteSub")
    public AjaxResult deleteSub(String[] ids) {
        return toAjax(firstLevelHeadingService.deleteLevelHeadingByIds(ids));
    }
}
