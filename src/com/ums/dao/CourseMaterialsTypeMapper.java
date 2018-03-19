package com.ums.dao;

import com.ums.bean.CourseMaterialsType;
import com.ums.bean.CourseMaterialsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMaterialsTypeMapper {
    long countByExample(CourseMaterialsTypeExample example);

    int deleteByExample(CourseMaterialsTypeExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(CourseMaterialsType record);

    int insertSelective(CourseMaterialsType record);

    List<CourseMaterialsType> selectByExample(CourseMaterialsTypeExample example);

    CourseMaterialsType selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") CourseMaterialsType record, @Param("example") CourseMaterialsTypeExample example);

    int updateByExample(@Param("record") CourseMaterialsType record, @Param("example") CourseMaterialsTypeExample example);

    int updateByPrimaryKeySelective(CourseMaterialsType record);

    int updateByPrimaryKey(CourseMaterialsType record);
}