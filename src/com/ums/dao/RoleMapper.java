package com.ums.dao;

import com.ums.bean.Role;
import com.ums.bean.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Byte roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Byte roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}