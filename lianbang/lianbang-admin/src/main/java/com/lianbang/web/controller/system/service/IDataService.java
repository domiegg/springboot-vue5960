package com.lianbang.web.controller.system.service;

import java.util.List;

import com.lianbang.web.controller.system.domain.Data;

/**
 * 数据管理Service接口
 *
 * @author lianbang
 * @date 2024-02-17
 */
public interface IDataService
{
    /**
     * 查询数据管理
     *
     * @param dataId 数据管理主键
     * @return 数据管理
     */
    public Data selectDataByDataId(Long dataId);

    /**
     * 查询数据管理列表
     *
     * @param data 数据管理
     * @return 数据管理集合
     */
    public List<Data> selectDataList(Data data);

    /**
     * 新增数据管理
     *
     * @param data 数据管理
     * @return 结果
     */
    public int insertData(Data data);

    /**
     * 修改数据管理
     *
     * @param data 数据管理
     * @return 结果
     */
    public int updateData(Data data);

    /**
     * 批量删除数据管理
     *
     * @param dataIds 需要删除的数据管理主键集合
     * @return 结果
     */
    public int deleteDataByDataIds(Long[] dataIds);

    /**
     * 删除数据管理信息
     *
     * @param dataId 数据管理主键
     * @return 结果
     */
    public int deleteDataByDataId(Long dataId);
}
