package com.ums.dao;

import com.ums.bean.IndexNews;
import com.ums.bean.IndexNewsExample;
import com.ums.bean.IndexNewsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexNewsMapper {
    long countByExample(IndexNewsExample example);

    int deleteByExample(IndexNewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IndexNewsWithBLOBs record);

    int insertSelective(IndexNewsWithBLOBs record);

    List<IndexNewsWithBLOBs> selectByExampleWithBLOBs(IndexNewsExample example);

    List<IndexNews> selectByExample(IndexNewsExample example);

    IndexNewsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IndexNewsWithBLOBs record, @Param("example") IndexNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") IndexNewsWithBLOBs record, @Param("example") IndexNewsExample example);

    int updateByExample(@Param("record") IndexNews record, @Param("example") IndexNewsExample example);

    int updateByPrimaryKeySelective(IndexNewsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IndexNewsWithBLOBs record);

    int updateByPrimaryKey(IndexNews record);
}