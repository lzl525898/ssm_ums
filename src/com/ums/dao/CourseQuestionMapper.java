package com.ums.dao;

import com.ums.bean.CourseQuestion;
import com.ums.bean.CourseQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseQuestionMapper {
    long countByExample(CourseQuestionExample example);

    int deleteByExample(CourseQuestionExample example);

    int deleteByPrimaryKey(Long questionid);

    int insert(CourseQuestion record);

    int insertSelective(CourseQuestion record);

    List<CourseQuestion> selectByExampleWithBLOBs(CourseQuestionExample example);

    List<CourseQuestion> selectByExample(CourseQuestionExample example);

    CourseQuestion selectByPrimaryKey(Long questionid);

    int updateByExampleSelective(@Param("record") CourseQuestion record, @Param("example") CourseQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseQuestion record, @Param("example") CourseQuestionExample example);

    int updateByExample(@Param("record") CourseQuestion record, @Param("example") CourseQuestionExample example);

    int updateByPrimaryKeySelective(CourseQuestion record);

    int updateByPrimaryKeyWithBLOBs(CourseQuestion record);

    int updateByPrimaryKey(CourseQuestion record);
}