package com.ums.dao;

import com.ums.bean.CourseIndex;
import com.ums.bean.CourseIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseIndexMapper {
    long countByExample(CourseIndexExample example);

    int deleteByExample(CourseIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseIndex record);

    int insertSelective(CourseIndex record);

    List<CourseIndex> selectByExample(CourseIndexExample example);

    CourseIndex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseIndex record, @Param("example") CourseIndexExample example);

    int updateByExample(@Param("record") CourseIndex record, @Param("example") CourseIndexExample example);

    int updateByPrimaryKeySelective(CourseIndex record);

    int updateByPrimaryKey(CourseIndex record);
}