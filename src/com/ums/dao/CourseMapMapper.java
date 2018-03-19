package com.ums.dao;

import com.ums.bean.CourseMap;
import com.ums.bean.CourseMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapMapper {
    long countByExample(CourseMapExample example);

    int deleteByExample(CourseMapExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseMap record);

    int insertSelective(CourseMap record);

    List<CourseMap> selectByExampleWithBLOBs(CourseMapExample example);

    List<CourseMap> selectByExample(CourseMapExample example);

    CourseMap selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseMap record, @Param("example") CourseMapExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseMap record, @Param("example") CourseMapExample example);

    int updateByExample(@Param("record") CourseMap record, @Param("example") CourseMapExample example);

    int updateByPrimaryKeySelective(CourseMap record);

    int updateByPrimaryKeyWithBLOBs(CourseMap record);

    int updateByPrimaryKey(CourseMap record);
}