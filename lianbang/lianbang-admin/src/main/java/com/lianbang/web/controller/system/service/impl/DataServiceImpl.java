package com.lianbang.web.controller.system.service.impl;

import java.util.List;

import com.lianbang.web.controller.system.domain.Data;
import com.lianbang.web.controller.system.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lianbang.web.controller.system.service.IDataService;

/**
 * 数据管理Service业务层处理
 *
 * @author lianbang
 * @date 2024-02-17
 */
@Service
public class DataServiceImpl implements IDataService
{
    @Autowired
    private DataMapper dataMapper;

    /**
     * 查询数据管理
     *
     * @param dataId 数据管理主键
     * @return 数据管理
     */
    @Override
    public Data selectDataByDataId(Long dataId)
    {
        return dataMapper.selectDataByDataId(dataId);
    }

    /**
     * 查询数据管理列表
     *
     * @param data 数据管理
     * @return 数据管理
     */
    @Override
    public List<Data> selectDataList(Data data)
    {
        return dataMapper.selectDataList(data);
    }

    /**
     * 新增数据管理
     *
     * @param data 数据管理
     * @return 结果
     */
    @Override
    public int insertData(Data data)
    {
        return dataMapper.insertData(data);
    }

    /**
     * 修改数据管理
     *
     * @param data 数据管理
     * @return 结果
     */
    @Override
    public int updateData(Data data)
    {
        return dataMapper.updateData(data);
    }

    /**
     * 批量删除数据管理
     *
     * @param dataIds 需要删除的数据管理主键
     * @return 结果
     */
    @Override
    public int deleteDataByDataIds(Long[] dataIds)
    {
        return dataMapper.deleteDataByDataIds(dataIds);
    }

    /**
     * 删除数据管理信息
     *
     * @param dataId 数据管理主键
     * @return 结果
     */
    @Override
    public int deleteDataByDataId(Long dataId)
    {
        return dataMapper.deleteDataByDataId(dataId);
    }
}
