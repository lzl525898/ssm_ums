package com.ums.dao;

import com.ums.bean.CourseMaterials;
import com.ums.bean.CourseMaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMaterialsMapper {
    long countByExample(CourseMaterialsExample example);

    int deleteByExample(CourseMaterialsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseMaterials record);

    int insertSelective(CourseMaterials record);

    List<CourseMaterials> selectByExample(CourseMaterialsExample example);

    CourseMaterials selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseMaterials record, @Param("example") CourseMaterialsExample example);

    int updateByExample(@Param("record") CourseMaterials record, @Param("example") CourseMaterialsExample example);

    int updateByPrimaryKeySelective(CourseMaterials record);

    int updateByPrimaryKey(CourseMaterials record);
}