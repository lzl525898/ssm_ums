package com.ums.dao;

import com.ums.bean.ReplyComments;
import com.ums.bean.ReplyCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyCommentsMapper {
    long countByExample(ReplyCommentsExample example);

    int deleteByExample(ReplyCommentsExample example);

    int deleteByPrimaryKey(Long replycommentsid);

    int insert(ReplyComments record);

    int insertSelective(ReplyComments record);

    List<ReplyComments> selectByExampleWithBLOBs(ReplyCommentsExample example);

    List<ReplyComments> selectByExample(ReplyCommentsExample example);

    ReplyComments selectByPrimaryKey(Long replycommentsid);

    int updateByExampleSelective(@Param("record") ReplyComments record, @Param("example") ReplyCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplyComments record, @Param("example") ReplyCommentsExample example);

    int updateByExample(@Param("record") ReplyComments record, @Param("example") ReplyCommentsExample example);

    int updateByPrimaryKeySelective(ReplyComments record);

    int updateByPrimaryKeyWithBLOBs(ReplyComments record);

    int updateByPrimaryKey(ReplyComments record);
}