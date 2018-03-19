package com.ums.dao;

import com.ums.bean.PhoneVercode;
import com.ums.bean.PhoneVercodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneVercodeMapper {
    long countByExample(PhoneVercodeExample example);

    int deleteByExample(PhoneVercodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PhoneVercode record);

    int insertSelective(PhoneVercode record);

    List<PhoneVercode> selectByExample(PhoneVercodeExample example);

    PhoneVercode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PhoneVercode record, @Param("example") PhoneVercodeExample example);

    int updateByExample(@Param("record") PhoneVercode record, @Param("example") PhoneVercodeExample example);

    int updateByPrimaryKeySelective(PhoneVercode record);

    int updateByPrimaryKey(PhoneVercode record);
}