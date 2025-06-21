package com.lianbang.web.controller.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lianbang.common.annotation.Excel;
import com.lianbang.common.core.domain.BaseEntity;

/**
 * 数据管理对象 a_data
 *
 * @author lianbang
 * @date 2024-02-17
 */
public class Data extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 数据id */
    private Long dataId;

    /** 数据类型 */
    @Excel(name = "数据类型")
    private String dataType;

    /** 数据内容 */
    @Excel(name = "数据内容")
    private String dataInfo;

    /** 数据模型 */
    @Excel(name = "数据模型")
    private String dataModel;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dataTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dataTimeEnd;



    /** 数据参数 */
    @Excel(name = "数据参数")
    private String dataVar;

    public Date getDataTimeEnd() {
        return dataTimeEnd;
    }

    public void setDataTimeEnd(Date dataTimeEnd) {
        this.dataTimeEnd = dataTimeEnd;
    }

    public void setDataId(Long dataId)
    {
        this.dataId = dataId;
    }

    public Long getDataId()
    {
        return dataId;
    }
    public void setDataType(String dataType)
    {
        this.dataType = dataType;
    }

    public String getDataType()
    {
        return dataType;
    }
    public void setDataInfo(String dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    public String getDataInfo()
    {
        return dataInfo;
    }
    public void setDataModel(String dataModel)
    {
        this.dataModel = dataModel;
    }

    public String getDataModel()
    {
        return dataModel;
    }
    public void setDataTime(Date dataTime)
    {
        this.dataTime = dataTime;
    }

    public Date getDataTime()
    {
        return dataTime;
    }
    public void setDataVar(String dataVar)
    {
        this.dataVar = dataVar;
    }

    public String getDataVar()
    {
        return dataVar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dataId", getDataId())
            .append("dataType", getDataType())
            .append("dataInfo", getDataInfo())
            .append("dataModel", getDataModel())
            .append("dataTime", getDataTime())
            .append("dataVar", getDataVar())
            .toString();
    }
}
