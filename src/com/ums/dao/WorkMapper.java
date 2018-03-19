package com.ums.dao;

import com.ums.bean.Work;
import com.ums.bean.WorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkMapper {
    long countByExample(WorkExample example);

    int deleteByExample(WorkExample example);

    int deleteByPrimaryKey(Long workid);

    int insert(Work record);

    int insertSelective(Work record);

    List<Work> selectByExampleWithBLOBs(WorkExample example);

    List<Work> selectByExample(WorkExample example);

    Work selectByPrimaryKey(Long workid);

    int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByExampleWithBLOBs(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKeyWithBLOBs(Work record);

    int updateByPrimaryKey(Work record);
}