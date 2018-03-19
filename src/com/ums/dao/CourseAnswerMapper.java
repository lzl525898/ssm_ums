package com.ums.dao;

import com.ums.bean.CourseAnswer;
import com.ums.bean.CourseAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseAnswerMapper {
    long countByExample(CourseAnswerExample example);

    int deleteByExample(CourseAnswerExample example);

    int deleteByPrimaryKey(Long anwserid);

    int insert(CourseAnswer record);

    int insertSelective(CourseAnswer record);

    List<CourseAnswer> selectByExampleWithBLOBs(CourseAnswerExample example);

    List<CourseAnswer> selectByExample(CourseAnswerExample example);

    CourseAnswer selectByPrimaryKey(Long anwserid);

    int updateByExampleSelective(@Param("record") CourseAnswer record, @Param("example") CourseAnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseAnswer record, @Param("example") CourseAnswerExample example);

    int updateByExample(@Param("record") CourseAnswer record, @Param("example") CourseAnswerExample example);

    int updateByPrimaryKeySelective(CourseAnswer record);

    int updateByPrimaryKeyWithBLOBs(CourseAnswer record);

    int updateByPrimaryKey(CourseAnswer record);
}