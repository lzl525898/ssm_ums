package com.ums.dao;

import com.ums.bean.WorkType;
import com.ums.bean.WorkTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTypeMapper {
    long countByExample(WorkTypeExample example);

    int deleteByExample(WorkTypeExample example);

    int deleteByPrimaryKey(Long worktypeid);

    int insert(WorkType record);

    int insertSelective(WorkType record);

    List<WorkType> selectByExample(WorkTypeExample example);

    WorkType selectByPrimaryKey(Long worktypeid);

    int updateByExampleSelective(@Param("record") WorkType record, @Param("example") WorkTypeExample example);

    int updateByExample(@Param("record") WorkType record, @Param("example") WorkTypeExample example);

    int updateByPrimaryKeySelective(WorkType record);

    int updateByPrimaryKey(WorkType record);
}