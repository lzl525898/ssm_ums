package com.ums.dao;

import com.ums.bean.CourseMenuMy;
import com.ums.bean.CourseMenuMyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMenuMyMapper {
    long countByExample(CourseMenuMyExample example);

    int deleteByExample(CourseMenuMyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseMenuMy record);

    int insertSelective(CourseMenuMy record);

    List<CourseMenuMy> selectByExample(CourseMenuMyExample example);

    CourseMenuMy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseMenuMy record, @Param("example") CourseMenuMyExample example);

    int updateByExample(@Param("record") CourseMenuMy record, @Param("example") CourseMenuMyExample example);

    int updateByPrimaryKeySelective(CourseMenuMy record);

    int updateByPrimaryKey(CourseMenuMy record);
}