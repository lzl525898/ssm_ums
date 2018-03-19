package com.ums.dao;

import com.ums.bean.OfflineCourse;
import com.ums.bean.OfflineCourseExample;
import com.ums.bean.OfflineCourseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfflineCourseMapper {
    long countByExample(OfflineCourseExample example);

    int deleteByExample(OfflineCourseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OfflineCourseWithBLOBs record);

    int insertSelective(OfflineCourseWithBLOBs record);

    List<OfflineCourseWithBLOBs> selectByExampleWithBLOBs(OfflineCourseExample example);

    List<OfflineCourse> selectByExample(OfflineCourseExample example);

    OfflineCourseWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OfflineCourseWithBLOBs record, @Param("example") OfflineCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") OfflineCourseWithBLOBs record, @Param("example") OfflineCourseExample example);

    int updateByExample(@Param("record") OfflineCourse record, @Param("example") OfflineCourseExample example);

    int updateByPrimaryKeySelective(OfflineCourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OfflineCourseWithBLOBs record);

    int updateByPrimaryKey(OfflineCourse record);
}