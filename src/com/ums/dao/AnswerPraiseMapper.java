package com.ums.dao;

import com.ums.bean.AnswerPraise;
import com.ums.bean.AnswerPraiseExample;
import com.ums.bean.AnswerPraiseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerPraiseMapper {
    long countByExample(AnswerPraiseExample example);

    int deleteByExample(AnswerPraiseExample example);

    int deleteByPrimaryKey(AnswerPraiseKey key);

    int insert(AnswerPraise record);

    int insertSelective(AnswerPraise record);

    List<AnswerPraise> selectByExample(AnswerPraiseExample example);

    AnswerPraise selectByPrimaryKey(AnswerPraiseKey key);

    int updateByExampleSelective(@Param("record") AnswerPraise record, @Param("example") AnswerPraiseExample example);

    int updateByExample(@Param("record") AnswerPraise record, @Param("example") AnswerPraiseExample example);

    int updateByPrimaryKeySelective(AnswerPraise record);

    int updateByPrimaryKey(AnswerPraise record);
}