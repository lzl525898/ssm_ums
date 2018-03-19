package com.ums.dao;

import com.ums.bean.ImageManage;
import com.ums.bean.ImageManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageManageMapper {
    long countByExample(ImageManageExample example);

    int deleteByExample(ImageManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageManage record);

    int insertSelective(ImageManage record);

    List<ImageManage> selectByExample(ImageManageExample example);

    ImageManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageManage record, @Param("example") ImageManageExample example);

    int updateByExample(@Param("record") ImageManage record, @Param("example") ImageManageExample example);

    int updateByPrimaryKeySelective(ImageManage record);

    int updateByPrimaryKey(ImageManage record);
}