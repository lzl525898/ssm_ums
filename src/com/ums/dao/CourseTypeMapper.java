package com.ums.dao;

import com.ums.bean.CourseType;
import com.ums.bean.CourseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTypeMapper {
    long countByExample(CourseTypeExample example);

    int deleteByExample(CourseTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    List<CourseType> selectByExampleWithBLOBs(CourseTypeExample example);

    List<CourseType> selectByExample(CourseTypeExample example);

    CourseType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByExample(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKeyWithBLOBs(CourseType record);

    int updateByPrimaryKey(CourseType record);
}