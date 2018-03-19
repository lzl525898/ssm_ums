package com.ums.dao;

import com.ums.bean.TaskTitle;
import com.ums.bean.TaskTitleExample;
import com.ums.bean.TaskTitleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskTitleMapper {
    long countByExample(TaskTitleExample example);

    int deleteByExample(TaskTitleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskTitleWithBLOBs record);

    int insertSelective(TaskTitleWithBLOBs record);

    List<TaskTitleWithBLOBs> selectByExampleWithBLOBs(TaskTitleExample example);

    List<TaskTitle> selectByExample(TaskTitleExample example);

    TaskTitleWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskTitleWithBLOBs record, @Param("example") TaskTitleExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskTitleWithBLOBs record, @Param("example") TaskTitleExample example);

    int updateByExample(@Param("record") TaskTitle record, @Param("example") TaskTitleExample example);

    int updateByPrimaryKeySelective(TaskTitleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskTitleWithBLOBs record);

    int updateByPrimaryKey(TaskTitle record);
}