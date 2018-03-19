package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCommentsidIsNull() {
            addCriterion("commentsId is null");
            return (Criteria) this;
        }

        public Criteria andCommentsidIsNotNull() {
            addCriterion("commentsId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsidEqualTo(Long value) {
            addCriterion("commentsId =", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidNotEqualTo(Long value) {
            addCriterion("commentsId <>", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidGreaterThan(Long value) {
            addCriterion("commentsId >", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidGreaterThanOrEqualTo(Long value) {
            addCriterion("commentsId >=", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidLessThan(Long value) {
            addCriterion("commentsId <", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidLessThanOrEqualTo(Long value) {
            addCriterion("commentsId <=", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidIn(List<Long> values) {
            addCriterion("commentsId in", values, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidNotIn(List<Long> values) {
            addCriterion("commentsId not in", values, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidBetween(Long value1, Long value2) {
            addCriterion("commentsId between", value1, value2, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidNotBetween(Long value1, Long value2) {
            addCriterion("commentsId not between", value1, value2, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidIsNull() {
            addCriterion("commentsWorkId is null");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidIsNotNull() {
            addCriterion("commentsWorkId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidEqualTo(Long value) {
            addCriterion("commentsWorkId =", value, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidNotEqualTo(Long value) {
            addCriterion("commentsWorkId <>", value, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidGreaterThan(Long value) {
            addCriterion("commentsWorkId >", value, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidGreaterThanOrEqualTo(Long value) {
            addCriterion("commentsWorkId >=", value, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidLessThan(Long value) {
            addCriterion("commentsWorkId <", value, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidLessThanOrEqualTo(Long value) {
            addCriterion("commentsWorkId <=", value, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidIn(List<Long> values) {
            addCriterion("commentsWorkId in", values, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidNotIn(List<Long> values) {
            addCriterion("commentsWorkId not in", values, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidBetween(Long value1, Long value2) {
            addCriterion("commentsWorkId between", value1, value2, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsworkidNotBetween(Long value1, Long value2) {
            addCriterion("commentsWorkId not between", value1, value2, "commentsworkid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridIsNull() {
            addCriterion("commentsReleaseUserId is null");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridIsNotNull() {
            addCriterion("commentsReleaseUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridEqualTo(Long value) {
            addCriterion("commentsReleaseUserId =", value, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridNotEqualTo(Long value) {
            addCriterion("commentsReleaseUserId <>", value, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridGreaterThan(Long value) {
            addCriterion("commentsReleaseUserId >", value, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("commentsReleaseUserId >=", value, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridLessThan(Long value) {
            addCriterion("commentsReleaseUserId <", value, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridLessThanOrEqualTo(Long value) {
            addCriterion("commentsReleaseUserId <=", value, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridIn(List<Long> values) {
            addCriterion("commentsReleaseUserId in", values, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridNotIn(List<Long> values) {
            addCriterion("commentsReleaseUserId not in", values, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridBetween(Long value1, Long value2) {
            addCriterion("commentsReleaseUserId between", value1, value2, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentsreleaseuseridNotBetween(Long value1, Long value2) {
            addCriterion("commentsReleaseUserId not between", value1, value2, "commentsreleaseuserid");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeIsNull() {
            addCriterion("commentsCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeIsNotNull() {
            addCriterion("commentsCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeEqualTo(String value) {
            addCriterion("commentsCreateTime =", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeNotEqualTo(String value) {
            addCriterion("commentsCreateTime <>", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeGreaterThan(String value) {
            addCriterion("commentsCreateTime >", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("commentsCreateTime >=", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeLessThan(String value) {
            addCriterion("commentsCreateTime <", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeLessThanOrEqualTo(String value) {
            addCriterion("commentsCreateTime <=", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeLike(String value) {
            addCriterion("commentsCreateTime like", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeNotLike(String value) {
            addCriterion("commentsCreateTime not like", value, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeIn(List<String> values) {
            addCriterion("commentsCreateTime in", values, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeNotIn(List<String> values) {
            addCriterion("commentsCreateTime not in", values, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeBetween(String value1, String value2) {
            addCriterion("commentsCreateTime between", value1, value2, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentscreatetimeNotBetween(String value1, String value2) {
            addCriterion("commentsCreateTime not between", value1, value2, "commentscreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowIsNull() {
            addCriterion("commentsIsShow is null");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowIsNotNull() {
            addCriterion("commentsIsShow is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowEqualTo(Byte value) {
            addCriterion("commentsIsShow =", value, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowNotEqualTo(Byte value) {
            addCriterion("commentsIsShow <>", value, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowGreaterThan(Byte value) {
            addCriterion("commentsIsShow >", value, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("commentsIsShow >=", value, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowLessThan(Byte value) {
            addCriterion("commentsIsShow <", value, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowLessThanOrEqualTo(Byte value) {
            addCriterion("commentsIsShow <=", value, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowIn(List<Byte> values) {
            addCriterion("commentsIsShow in", values, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowNotIn(List<Byte> values) {
            addCriterion("commentsIsShow not in", values, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowBetween(Byte value1, Byte value2) {
            addCriterion("commentsIsShow between", value1, value2, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentsisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("commentsIsShow not between", value1, value2, "commentsisshow");
            return (Criteria) this;
        }

        public Criteria andCommentreasonIsNull() {
            addCriterion("commentReason is null");
            return (Criteria) this;
        }

        public Criteria andCommentreasonIsNotNull() {
            addCriterion("commentReason is not null");
            return (Criteria) this;
        }

        public Criteria andCommentreasonEqualTo(String value) {
            addCriterion("commentReason =", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonNotEqualTo(String value) {
            addCriterion("commentReason <>", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonGreaterThan(String value) {
            addCriterion("commentReason >", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonGreaterThanOrEqualTo(String value) {
            addCriterion("commentReason >=", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonLessThan(String value) {
            addCriterion("commentReason <", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonLessThanOrEqualTo(String value) {
            addCriterion("commentReason <=", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonLike(String value) {
            addCriterion("commentReason like", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonNotLike(String value) {
            addCriterion("commentReason not like", value, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonIn(List<String> values) {
            addCriterion("commentReason in", values, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonNotIn(List<String> values) {
            addCriterion("commentReason not in", values, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonBetween(String value1, String value2) {
            addCriterion("commentReason between", value1, value2, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentreasonNotBetween(String value1, String value2) {
            addCriterion("commentReason not between", value1, value2, "commentreason");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeIsNull() {
            addCriterion("commentModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeIsNotNull() {
            addCriterion("commentModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeEqualTo(String value) {
            addCriterion("commentModifyTime =", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeNotEqualTo(String value) {
            addCriterion("commentModifyTime <>", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeGreaterThan(String value) {
            addCriterion("commentModifyTime >", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("commentModifyTime >=", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeLessThan(String value) {
            addCriterion("commentModifyTime <", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeLessThanOrEqualTo(String value) {
            addCriterion("commentModifyTime <=", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeLike(String value) {
            addCriterion("commentModifyTime like", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeNotLike(String value) {
            addCriterion("commentModifyTime not like", value, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeIn(List<String> values) {
            addCriterion("commentModifyTime in", values, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeNotIn(List<String> values) {
            addCriterion("commentModifyTime not in", values, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeBetween(String value1, String value2) {
            addCriterion("commentModifyTime between", value1, value2, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifytimeNotBetween(String value1, String value2) {
            addCriterion("commentModifyTime not between", value1, value2, "commentmodifytime");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridIsNull() {
            addCriterion("commentModifyUserId is null");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridIsNotNull() {
            addCriterion("commentModifyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridEqualTo(Long value) {
            addCriterion("commentModifyUserId =", value, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridNotEqualTo(Long value) {
            addCriterion("commentModifyUserId <>", value, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridGreaterThan(Long value) {
            addCriterion("commentModifyUserId >", value, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("commentModifyUserId >=", value, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridLessThan(Long value) {
            addCriterion("commentModifyUserId <", value, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridLessThanOrEqualTo(Long value) {
            addCriterion("commentModifyUserId <=", value, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridIn(List<Long> values) {
            addCriterion("commentModifyUserId in", values, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridNotIn(List<Long> values) {
            addCriterion("commentModifyUserId not in", values, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridBetween(Long value1, Long value2) {
            addCriterion("commentModifyUserId between", value1, value2, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentmodifyuseridNotBetween(Long value1, Long value2) {
            addCriterion("commentModifyUserId not between", value1, value2, "commentmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailIsNull() {
            addCriterion("commentReplyDetail is null");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailIsNotNull() {
            addCriterion("commentReplyDetail is not null");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailEqualTo(String value) {
            addCriterion("commentReplyDetail =", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailNotEqualTo(String value) {
            addCriterion("commentReplyDetail <>", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailGreaterThan(String value) {
            addCriterion("commentReplyDetail >", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailGreaterThanOrEqualTo(String value) {
            addCriterion("commentReplyDetail >=", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailLessThan(String value) {
            addCriterion("commentReplyDetail <", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailLessThanOrEqualTo(String value) {
            addCriterion("commentReplyDetail <=", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailLike(String value) {
            addCriterion("commentReplyDetail like", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailNotLike(String value) {
            addCriterion("commentReplyDetail not like", value, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailIn(List<String> values) {
            addCriterion("commentReplyDetail in", values, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailNotIn(List<String> values) {
            addCriterion("commentReplyDetail not in", values, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailBetween(String value1, String value2) {
            addCriterion("commentReplyDetail between", value1, value2, "commentreplydetail");
            return (Criteria) this;
        }

        public Criteria andCommentreplydetailNotBetween(String value1, String value2) {
            addCriterion("commentReplyDetail not between", value1, value2, "commentreplydetail");
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