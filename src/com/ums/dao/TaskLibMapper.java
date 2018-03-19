package com.ums.dao;

import com.ums.bean.TaskLib;
import com.ums.bean.TaskLibExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskLibMapper {
    long countByExample(TaskLibExample example);

    int deleteByExample(TaskLibExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskLib record);

    int insertSelective(TaskLib record);

    List<TaskLib> selectByExample(TaskLibExample example);

    TaskLib selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskLib record, @Param("example") TaskLibExample example);

    int updateByExample(@Param("record") TaskLib record, @Param("example") TaskLibExample example);

    int updateByPrimaryKeySelective(TaskLib record);

    int updateByPrimaryKey(TaskLib record);
}