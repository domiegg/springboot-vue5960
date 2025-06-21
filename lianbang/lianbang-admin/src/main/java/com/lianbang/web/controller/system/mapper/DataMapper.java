package com.lianbang.web.controller.system.mapper;

import java.util.List;

import com.lianbang.web.controller.system.domain.Data;

/**
 * 数据管理Mapper接口
 *
 * @author lianbang
 * @date 2024-02-17
 */
public interface DataMapper
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
     * 删除数据管理
     *
     * @param dataId 数据管理主键
     * @return 结果
     */
    public int deleteDataByDataId(Long dataId);

    /**
     * 批量删除数据管理
     *
     * @param dataIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDataByDataIds(Long[] dataIds);
}
