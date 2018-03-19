package com.ums.dao;

import com.ums.bean.QuestionPraise;
import com.ums.bean.QuestionPraiseExample;
import com.ums.bean.QuestionPraiseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionPraiseMapper {
    long countByExample(QuestionPraiseExample example);

    int deleteByExample(QuestionPraiseExample example);

    int deleteByPrimaryKey(QuestionPraiseKey key);

    int insert(QuestionPraise record);

    int insertSelective(QuestionPraise record);

    List<QuestionPraise> selectByExample(QuestionPraiseExample example);

    QuestionPraise selectByPrimaryKey(QuestionPraiseKey key);

    int updateByExampleSelective(@Param("record") QuestionPraise record, @Param("example") QuestionPraiseExample example);

    int updateByExample(@Param("record") QuestionPraise record, @Param("example") QuestionPraiseExample example);

    int updateByPrimaryKeySelective(QuestionPraise record);

    int updateByPrimaryKey(QuestionPraise record);
}