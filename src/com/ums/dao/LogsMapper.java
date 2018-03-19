package com.ums.dao;

import com.ums.bean.Logs;
import com.ums.bean.LogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogsMapper {
    long countByExample(LogsExample example);

    int deleteByExample(LogsExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(Logs record);

    int insertSelective(Logs record);

    List<Logs> selectByExampleWithBLOBs(LogsExample example);

    List<Logs> selectByExample(LogsExample example);

    Logs selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByExampleWithBLOBs(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByExample(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByPrimaryKeySelective(Logs record);

    int updateByPrimaryKeyWithBLOBs(Logs record);

    int updateByPrimaryKey(Logs record);
}