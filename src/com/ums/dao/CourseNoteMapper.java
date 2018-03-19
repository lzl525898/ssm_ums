package com.ums.dao;

import com.ums.bean.CourseNote;
import com.ums.bean.CourseNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseNoteMapper {
    long countByExample(CourseNoteExample example);

    int deleteByExample(CourseNoteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseNote record);

    int insertSelective(CourseNote record);

    List<CourseNote> selectByExampleWithBLOBs(CourseNoteExample example);

    List<CourseNote> selectByExample(CourseNoteExample example);

    CourseNote selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseNote record, @Param("example") CourseNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseNote record, @Param("example") CourseNoteExample example);

    int updateByExample(@Param("record") CourseNote record, @Param("example") CourseNoteExample example);

    int updateByPrimaryKeySelective(CourseNote record);

    int updateByPrimaryKeyWithBLOBs(CourseNote record);

    int updateByPrimaryKey(CourseNote record);
}