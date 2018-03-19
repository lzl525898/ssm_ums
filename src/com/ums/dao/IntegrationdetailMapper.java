package com.ums.dao;

import com.ums.bean.Integrationdetail;
import com.ums.bean.IntegrationdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegrationdetailMapper {
    long countByExample(IntegrationdetailExample example);

    int deleteByExample(IntegrationdetailExample example);

    int deleteByPrimaryKey(Long detailid);

    int insert(Integrationdetail record);

    int insertSelective(Integrationdetail record);

    List<Integrationdetail> selectByExampleWithBLOBs(IntegrationdetailExample example);

    List<Integrationdetail> selectByExample(IntegrationdetailExample example);

    Integrationdetail selectByPrimaryKey(Long detailid);

    int updateByExampleSelective(@Param("record") Integrationdetail record, @Param("example") IntegrationdetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Integrationdetail record, @Param("example") IntegrationdetailExample example);

    int updateByExample(@Param("record") Integrationdetail record, @Param("example") IntegrationdetailExample example);

    int updateByPrimaryKeySelective(Integrationdetail record);

    int updateByPrimaryKeyWithBLOBs(Integrationdetail record);

    int updateByPrimaryKey(Integrationdetail record);
}