package com.ums.dao;

import com.ums.bean.CourseSC;
import com.ums.bean.CourseSCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSCMapper {
    long countByExample(CourseSCExample example);

    int deleteByExample(CourseSCExample example);

    int deleteByPrimaryKey(Long coursescid);

    int insert(CourseSC record);

    int insertSelective(CourseSC record);

    List<CourseSC> selectByExample(CourseSCExample example);

    CourseSC selectByPrimaryKey(Long coursescid);

    int updateByExampleSelective(@Param("record") CourseSC record, @Param("example") CourseSCExample example);

    int updateByExample(@Param("record") CourseSC record, @Param("example") CourseSCExample example);

    int updateByPrimaryKeySelective(CourseSC record);

    int updateByPrimaryKey(CourseSC record);
}