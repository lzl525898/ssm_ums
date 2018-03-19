package com.ums.dao;

import com.ums.bean.CourseBuyHistory;
import com.ums.bean.CourseBuyHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseBuyHistoryMapper {
    long countByExample(CourseBuyHistoryExample example);

    int deleteByExample(CourseBuyHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseBuyHistory record);

    int insertSelective(CourseBuyHistory record);

    List<CourseBuyHistory> selectByExample(CourseBuyHistoryExample example);

    CourseBuyHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseBuyHistory record, @Param("example") CourseBuyHistoryExample example);

    int updateByExample(@Param("record") CourseBuyHistory record, @Param("example") CourseBuyHistoryExample example);

    int updateByPrimaryKeySelective(CourseBuyHistory record);

    int updateByPrimaryKey(CourseBuyHistory record);
}