package com.ums.dao;

import com.ums.bean.CourseMenu;
import com.ums.bean.CourseMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMenuMapper {
    long countByExample(CourseMenuExample example);

    int deleteByExample(CourseMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseMenu record);

    int insertSelective(CourseMenu record);

    List<CourseMenu> selectByExample(CourseMenuExample example);

    CourseMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseMenu record, @Param("example") CourseMenuExample example);

    int updateByExample(@Param("record") CourseMenu record, @Param("example") CourseMenuExample example);

    int updateByPrimaryKeySelective(CourseMenu record);

    int updateByPrimaryKey(CourseMenu record);
}