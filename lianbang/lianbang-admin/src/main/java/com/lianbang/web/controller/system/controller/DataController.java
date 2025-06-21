package com.lianbang.web.controller.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.lianbang.web.controller.system.domain.Data;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lianbang.common.annotation.Log;
import com.lianbang.common.core.controller.BaseController;
import com.lianbang.common.core.domain.AjaxResult;
import com.lianbang.common.enums.BusinessType;
import com.lianbang.web.controller.system.service.IDataService;
import com.lianbang.common.utils.poi.ExcelUtil;
import com.lianbang.common.core.page.TableDataInfo;

/**
 * 数据管理Controller
 *
 * @author lianbang
 * @date 2024-02-17
 */
@RestController
@RequestMapping("/system/data")
public class DataController extends BaseController
{
    @Autowired
    private IDataService dataService;

    /**
     * 查询数据管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:list')")
    @GetMapping("/list")
    public TableDataInfo list(Data data)
    {
        startPage();
        List<Data> list = dataService.selectDataList(data);
        return getDataTable(list);
    }

    /**
     * 导出数据管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:export')")
    @Log(title = "数据管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Data data)
    {
        List<Data> list = dataService.selectDataList(data);
        ExcelUtil<Data> util = new ExcelUtil<Data>(Data.class);
        util.exportExcel(response, list, "数据管理数据");
    }

    /**
     * 获取数据管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data:query')")
    @GetMapping(value = "/{dataId}")
    public AjaxResult getInfo(@PathVariable("dataId") Long dataId)
    {
        return success(dataService.selectDataByDataId(dataId));
    }

    /**
     * 新增数据管理
     */
    @PreAuthorize("@ss.hasPermi('system:data:add')")
    @Log(title = "数据管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Data data)
    {
        return toAjax(dataService.insertData(data));
    }

    /**
     * 修改数据管理
     */
    @PreAuthorize("@ss.hasPermi('system:data:edit')")
    @Log(title = "数据管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Data data)
    {
        return toAjax(dataService.updateData(data));
    }

    /**
     * 删除数据管理
     */
    @PreAuthorize("@ss.hasPermi('system:data:remove')")
    @Log(title = "数据管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dataIds}")
    public AjaxResult remove(@PathVariable Long[] dataIds)
    {
        return toAjax(dataService.deleteDataByDataIds(dataIds));
    }
}
