package com.ums.dao;

import com.ums.bean.UserAuthority;
import com.ums.bean.UserAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthorityMapper {
    long countByExample(UserAuthorityExample example);

    int deleteByExample(UserAuthorityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAuthority record);

    int insertSelective(UserAuthority record);

    List<UserAuthority> selectByExample(UserAuthorityExample example);

    UserAuthority selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);

    int updateByExample(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);

    int updateByPrimaryKeySelective(UserAuthority record);

    int updateByPrimaryKey(UserAuthority record);
}