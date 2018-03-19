package com.ums.dao;

import com.ums.bean.Scwork;
import com.ums.bean.ScworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScworkMapper {
    long countByExample(ScworkExample example);

    int deleteByExample(ScworkExample example);

    int deleteByPrimaryKey(Long scid);

    int insert(Scwork record);

    int insertSelective(Scwork record);

    List<Scwork> selectByExample(ScworkExample example);

    Scwork selectByPrimaryKey(Long scid);

    int updateByExampleSelective(@Param("record") Scwork record, @Param("example") ScworkExample example);

    int updateByExample(@Param("record") Scwork record, @Param("example") ScworkExample example);

    int updateByPrimaryKeySelective(Scwork record);

    int updateByPrimaryKey(Scwork record);
}