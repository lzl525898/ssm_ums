package com.ums.dao;

import com.ums.bean.TeacherResource;
import com.ums.bean.TeacherResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherResourceMapper {
    long countByExample(TeacherResourceExample example);

    int deleteByExample(TeacherResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeacherResource record);

    int insertSelective(TeacherResource record);

    List<TeacherResource> selectByExample(TeacherResourceExample example);

    TeacherResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeacherResource record, @Param("example") TeacherResourceExample example);

    int updateByExample(@Param("record") TeacherResource record, @Param("example") TeacherResourceExample example);

    int updateByPrimaryKeySelective(TeacherResource record);

    int updateByPrimaryKey(TeacherResource record);
}