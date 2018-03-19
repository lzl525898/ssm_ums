package com.ums.dao;

import com.ums.bean.StuTask;
import com.ums.bean.StuTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuTaskMapper {
    long countByExample(StuTaskExample example);

    int deleteByExample(StuTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StuTask record);

    int insertSelective(StuTask record);

    List<StuTask> selectByExample(StuTaskExample example);

    StuTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StuTask record, @Param("example") StuTaskExample example);

    int updateByExample(@Param("record") StuTask record, @Param("example") StuTaskExample example);

    int updateByPrimaryKeySelective(StuTask record);

    int updateByPrimaryKey(StuTask record);
}