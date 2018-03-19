package com.ums.dao;

import com.ums.bean.CourseMy;
import com.ums.bean.CourseMyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMyMapper {
    long countByExample(CourseMyExample example);

    int deleteByExample(CourseMyExample example);

    int deleteByPrimaryKey(Long mid);

    int insert(CourseMy record);

    int insertSelective(CourseMy record);

    List<CourseMy> selectByExample(CourseMyExample example);

    CourseMy selectByPrimaryKey(Long mid);

    int updateByExampleSelective(@Param("record") CourseMy record, @Param("example") CourseMyExample example);

    int updateByExample(@Param("record") CourseMy record, @Param("example") CourseMyExample example);

    int updateByPrimaryKeySelective(CourseMy record);

    int updateByPrimaryKey(CourseMy record);
}