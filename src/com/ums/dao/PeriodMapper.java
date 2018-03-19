package com.ums.dao;

import com.ums.bean.Period;
import com.ums.bean.PeriodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeriodMapper {
    long countByExample(PeriodExample example);

    int deleteByExample(PeriodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Period record);

    int insertSelective(Period record);

    List<Period> selectByExample(PeriodExample example);

    Period selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Period record, @Param("example") PeriodExample example);

    int updateByExample(@Param("record") Period record, @Param("example") PeriodExample example);

    int updateByPrimaryKeySelective(Period record);

    int updateByPrimaryKey(Period record);
}