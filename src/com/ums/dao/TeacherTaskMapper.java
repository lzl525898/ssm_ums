package com.ums.dao;

import com.ums.bean.TeacherTask;
import com.ums.bean.TeacherTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherTaskMapper {
    long countByExample(TeacherTaskExample example);

    int deleteByExample(TeacherTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeacherTask record);

    int insertSelective(TeacherTask record);

    List<TeacherTask> selectByExample(TeacherTaskExample example);

    TeacherTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeacherTask record, @Param("example") TeacherTaskExample example);

    int updateByExample(@Param("record") TeacherTask record, @Param("example") TeacherTaskExample example);

    int updateByPrimaryKeySelective(TeacherTask record);

    int updateByPrimaryKey(TeacherTask record);
}