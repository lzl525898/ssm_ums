package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class ReplyCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyCommentsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReplycommentsidIsNull() {
            addCriterion("replyCommentsId is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidIsNotNull() {
            addCriterion("replyCommentsId is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidEqualTo(Long value) {
            addCriterion("replyCommentsId =", value, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidNotEqualTo(Long value) {
            addCriterion("replyCommentsId <>", value, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidGreaterThan(Long value) {
            addCriterion("replyCommentsId >", value, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidGreaterThanOrEqualTo(Long value) {
            addCriterion("replyCommentsId >=", value, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidLessThan(Long value) {
            addCriterion("replyCommentsId <", value, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidLessThanOrEqualTo(Long value) {
            addCriterion("replyCommentsId <=", value, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidIn(List<Long> values) {
            addCriterion("replyCommentsId in", values, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidNotIn(List<Long> values) {
            addCriterion("replyCommentsId not in", values, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidBetween(Long value1, Long value2) {
            addCriterion("replyCommentsId between", value1, value2, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsidNotBetween(Long value1, Long value2) {
            addCriterion("replyCommentsId not between", value1, value2, "replycommentsid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidIsNull() {
            addCriterion("replyCommentsWorkId is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidIsNotNull() {
            addCriterion("replyCommentsWorkId is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidEqualTo(Long value) {
            addCriterion("replyCommentsWorkId =", value, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidNotEqualTo(Long value) {
            addCriterion("replyCommentsWorkId <>", value, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidGreaterThan(Long value) {
            addCriterion("replyCommentsWorkId >", value, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidGreaterThanOrEqualTo(Long value) {
            addCriterion("replyCommentsWorkId >=", value, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidLessThan(Long value) {
            addCriterion("replyCommentsWorkId <", value, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidLessThanOrEqualTo(Long value) {
            addCriterion("replyCommentsWorkId <=", value, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidIn(List<Long> values) {
            addCriterion("replyCommentsWorkId in", values, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidNotIn(List<Long> values) {
            addCriterion("replyCommentsWorkId not in", values, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidBetween(Long value1, Long value2) {
            addCriterion("replyCommentsWorkId between", value1, value2, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsworkidNotBetween(Long value1, Long value2) {
            addCriterion("replyCommentsWorkId not between", value1, value2, "replycommentsworkid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridIsNull() {
            addCriterion("oldCommentsUserId is null");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridIsNotNull() {
            addCriterion("oldCommentsUserId is not null");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridEqualTo(Long value) {
            addCriterion("oldCommentsUserId =", value, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridNotEqualTo(Long value) {
            addCriterion("oldCommentsUserId <>", value, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridGreaterThan(Long value) {
            addCriterion("oldCommentsUserId >", value, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("oldCommentsUserId >=", value, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridLessThan(Long value) {
            addCriterion("oldCommentsUserId <", value, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridLessThanOrEqualTo(Long value) {
            addCriterion("oldCommentsUserId <=", value, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridIn(List<Long> values) {
            addCriterion("oldCommentsUserId in", values, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridNotIn(List<Long> values) {
            addCriterion("oldCommentsUserId not in", values, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridBetween(Long value1, Long value2) {
            addCriterion("oldCommentsUserId between", value1, value2, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andOldcommentsuseridNotBetween(Long value1, Long value2) {
            addCriterion("oldCommentsUserId not between", value1, value2, "oldcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridIsNull() {
            addCriterion("replyCommentsUserId is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridIsNotNull() {
            addCriterion("replyCommentsUserId is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridEqualTo(Long value) {
            addCriterion("replyCommentsUserId =", value, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridNotEqualTo(Long value) {
            addCriterion("replyCommentsUserId <>", value, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridGreaterThan(Long value) {
            addCriterion("replyCommentsUserId >", value, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("replyCommentsUserId >=", value, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridLessThan(Long value) {
            addCriterion("replyCommentsUserId <", value, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridLessThanOrEqualTo(Long value) {
            addCriterion("replyCommentsUserId <=", value, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridIn(List<Long> values) {
            addCriterion("replyCommentsUserId in", values, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridNotIn(List<Long> values) {
            addCriterion("replyCommentsUserId not in", values, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridBetween(Long value1, Long value2) {
            addCriterion("replyCommentsUserId between", value1, value2, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsuseridNotBetween(Long value1, Long value2) {
            addCriterion("replyCommentsUserId not between", value1, value2, "replycommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeIsNull() {
            addCriterion("replyCommentsCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeIsNotNull() {
            addCriterion("replyCommentsCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeEqualTo(String value) {
            addCriterion("replyCommentsCreateTime =", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeNotEqualTo(String value) {
            addCriterion("replyCommentsCreateTime <>", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeGreaterThan(String value) {
            addCriterion("replyCommentsCreateTime >", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("replyCommentsCreateTime >=", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeLessThan(String value) {
            addCriterion("replyCommentsCreateTime <", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeLessThanOrEqualTo(String value) {
            addCriterion("replyCommentsCreateTime <=", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeLike(String value) {
            addCriterion("replyCommentsCreateTime like", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeNotLike(String value) {
            addCriterion("replyCommentsCreateTime not like", value, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeIn(List<String> values) {
            addCriterion("replyCommentsCreateTime in", values, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeNotIn(List<String> values) {
            addCriterion("replyCommentsCreateTime not in", values, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeBetween(String value1, String value2) {
            addCriterion("replyCommentsCreateTime between", value1, value2, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentscreatetimeNotBetween(String value1, String value2) {
            addCriterion("replyCommentsCreateTime not between", value1, value2, "replycommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowIsNull() {
            addCriterion("replyCommentsIsShow is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowIsNotNull() {
            addCriterion("replyCommentsIsShow is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowEqualTo(Byte value) {
            addCriterion("replyCommentsIsShow =", value, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowNotEqualTo(Byte value) {
            addCriterion("replyCommentsIsShow <>", value, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowGreaterThan(Byte value) {
            addCriterion("replyCommentsIsShow >", value, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("replyCommentsIsShow >=", value, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowLessThan(Byte value) {
            addCriterion("replyCommentsIsShow <", value, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowLessThanOrEqualTo(Byte value) {
            addCriterion("replyCommentsIsShow <=", value, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowIn(List<Byte> values) {
            addCriterion("replyCommentsIsShow in", values, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowNotIn(List<Byte> values) {
            addCriterion("replyCommentsIsShow not in", values, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowBetween(Byte value1, Byte value2) {
            addCriterion("replyCommentsIsShow between", value1, value2, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentsisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("replyCommentsIsShow not between", value1, value2, "replycommentsisshow");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonIsNull() {
            addCriterion("replyCommentReason is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonIsNotNull() {
            addCriterion("replyCommentReason is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonEqualTo(String value) {
            addCriterion("replyCommentReason =", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonNotEqualTo(String value) {
            addCriterion("replyCommentReason <>", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonGreaterThan(String value) {
            addCriterion("replyCommentReason >", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonGreaterThanOrEqualTo(String value) {
            addCriterion("replyCommentReason >=", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonLessThan(String value) {
            addCriterion("replyCommentReason <", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonLessThanOrEqualTo(String value) {
            addCriterion("replyCommentReason <=", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonLike(String value) {
            addCriterion("replyCommentReason like", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonNotLike(String value) {
            addCriterion("replyCommentReason not like", value, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonIn(List<String> values) {
            addCriterion("replyCommentReason in", values, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonNotIn(List<String> values) {
            addCriterion("replyCommentReason not in", values, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonBetween(String value1, String value2) {
            addCriterion("replyCommentReason between", value1, value2, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentreasonNotBetween(String value1, String value2) {
            addCriterion("replyCommentReason not between", value1, value2, "replycommentreason");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeIsNull() {
            addCriterion("replyCommentModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeIsNotNull() {
            addCriterion("replyCommentModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeEqualTo(String value) {
            addCriterion("replyCommentModifyTime =", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeNotEqualTo(String value) {
            addCriterion("replyCommentModifyTime <>", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeGreaterThan(String value) {
            addCriterion("replyCommentModifyTime >", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("replyCommentModifyTime >=", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeLessThan(String value) {
            addCriterion("replyCommentModifyTime <", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeLessThanOrEqualTo(String value) {
            addCriterion("replyCommentModifyTime <=", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeLike(String value) {
            addCriterion("replyCommentModifyTime like", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeNotLike(String value) {
            addCriterion("replyCommentModifyTime not like", value, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeIn(List<String> values) {
            addCriterion("replyCommentModifyTime in", values, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeNotIn(List<String> values) {
            addCriterion("replyCommentModifyTime not in", values, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeBetween(String value1, String value2) {
            addCriterion("replyCommentModifyTime between", value1, value2, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplycommentmodifytimeNotBetween(String value1, String value2) {
            addCriterion("replyCommentModifyTime not between", value1, value2, "replycommentmodifytime");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridIsNull() {
            addCriterion("replyWorkCommentsUserId is null");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridIsNotNull() {
            addCriterion("replyWorkCommentsUserId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridEqualTo(Long value) {
            addCriterion("replyWorkCommentsUserId =", value, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridNotEqualTo(Long value) {
            addCriterion("replyWorkCommentsUserId <>", value, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridGreaterThan(Long value) {
            addCriterion("replyWorkCommentsUserId >", value, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("replyWorkCommentsUserId >=", value, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridLessThan(Long value) {
            addCriterion("replyWorkCommentsUserId <", value, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridLessThanOrEqualTo(Long value) {
            addCriterion("replyWorkCommentsUserId <=", value, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridIn(List<Long> values) {
            addCriterion("replyWorkCommentsUserId in", values, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridNotIn(List<Long> values) {
            addCriterion("replyWorkCommentsUserId not in", values, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridBetween(Long value1, Long value2) {
            addCriterion("replyWorkCommentsUserId between", value1, value2, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplyworkcommentsuseridNotBetween(Long value1, Long value2) {
            addCriterion("replyWorkCommentsUserId not between", value1, value2, "replyworkcommentsuserid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidIsNull() {
            addCriterion("replycommentsrcId is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidIsNotNull() {
            addCriterion("replycommentsrcId is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidEqualTo(Long value) {
            addCriterion("replycommentsrcId =", value, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidNotEqualTo(Long value) {
            addCriterion("replycommentsrcId <>", value, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidGreaterThan(Long value) {
            addCriterion("replycommentsrcId >", value, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidGreaterThanOrEqualTo(Long value) {
            addCriterion("replycommentsrcId >=", value, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidLessThan(Long value) {
            addCriterion("replycommentsrcId <", value, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidLessThanOrEqualTo(Long value) {
            addCriterion("replycommentsrcId <=", value, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidIn(List<Long> values) {
            addCriterion("replycommentsrcId in", values, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidNotIn(List<Long> values) {
            addCriterion("replycommentsrcId not in", values, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidBetween(Long value1, Long value2) {
            addCriterion("replycommentsrcId between", value1, value2, "replycommentsrcid");
            return (Criteria) this;
        }

        public Criteria andReplycommentsrcidNotBetween(Long value1, Long value2) {
            addCriterion("replycommentsrcId not between", value1, value2, "replycommentsrcid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}