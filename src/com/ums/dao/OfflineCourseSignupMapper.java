package com.ums.dao;

import com.ums.bean.OfflineCourseSignup;
import com.ums.bean.OfflineCourseSignupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfflineCourseSignupMapper {
    long countByExample(OfflineCourseSignupExample example);

    int deleteByExample(OfflineCourseSignupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OfflineCourseSignup record);

    int insertSelective(OfflineCourseSignup record);

    List<OfflineCourseSignup> selectByExample(OfflineCourseSignupExample example);

    OfflineCourseSignup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OfflineCourseSignup record, @Param("example") OfflineCourseSignupExample example);

    int updateByExample(@Param("record") OfflineCourseSignup record, @Param("example") OfflineCourseSignupExample example);

    int updateByPrimaryKeySelective(OfflineCourseSignup record);

    int updateByPrimaryKey(OfflineCourseSignup record);
}