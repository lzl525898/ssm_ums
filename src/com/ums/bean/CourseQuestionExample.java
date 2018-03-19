package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseQuestionExample() {
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

        public Criteria andQuestionidIsNull() {
            addCriterion("questionId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("questionId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Long value) {
            addCriterion("questionId =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Long value) {
            addCriterion("questionId <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Long value) {
            addCriterion("questionId >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Long value) {
            addCriterion("questionId >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Long value) {
            addCriterion("questionId <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Long value) {
            addCriterion("questionId <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Long> values) {
            addCriterion("questionId in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Long> values) {
            addCriterion("questionId not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Long value1, Long value2) {
            addCriterion("questionId between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Long value1, Long value2) {
            addCriterion("questionId not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidIsNull() {
            addCriterion("questioncourseId is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidIsNotNull() {
            addCriterion("questioncourseId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidEqualTo(Long value) {
            addCriterion("questioncourseId =", value, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidNotEqualTo(Long value) {
            addCriterion("questioncourseId <>", value, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidGreaterThan(Long value) {
            addCriterion("questioncourseId >", value, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("questioncourseId >=", value, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidLessThan(Long value) {
            addCriterion("questioncourseId <", value, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidLessThanOrEqualTo(Long value) {
            addCriterion("questioncourseId <=", value, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidIn(List<Long> values) {
            addCriterion("questioncourseId in", values, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidNotIn(List<Long> values) {
            addCriterion("questioncourseId not in", values, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidBetween(Long value1, Long value2) {
            addCriterion("questioncourseId between", value1, value2, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioncourseidNotBetween(Long value1, Long value2) {
            addCriterion("questioncourseId not between", value1, value2, "questioncourseid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidIsNull() {
            addCriterion("questionmenuId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidIsNotNull() {
            addCriterion("questionmenuId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidEqualTo(Long value) {
            addCriterion("questionmenuId =", value, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidNotEqualTo(Long value) {
            addCriterion("questionmenuId <>", value, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidGreaterThan(Long value) {
            addCriterion("questionmenuId >", value, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidGreaterThanOrEqualTo(Long value) {
            addCriterion("questionmenuId >=", value, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidLessThan(Long value) {
            addCriterion("questionmenuId <", value, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidLessThanOrEqualTo(Long value) {
            addCriterion("questionmenuId <=", value, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidIn(List<Long> values) {
            addCriterion("questionmenuId in", values, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidNotIn(List<Long> values) {
            addCriterion("questionmenuId not in", values, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidBetween(Long value1, Long value2) {
            addCriterion("questionmenuId between", value1, value2, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionmenuidNotBetween(Long value1, Long value2) {
            addCriterion("questionmenuId not between", value1, value2, "questionmenuid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridIsNull() {
            addCriterion("questionuserId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridIsNotNull() {
            addCriterion("questionuserId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridEqualTo(Long value) {
            addCriterion("questionuserId =", value, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridNotEqualTo(Long value) {
            addCriterion("questionuserId <>", value, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridGreaterThan(Long value) {
            addCriterion("questionuserId >", value, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("questionuserId >=", value, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridLessThan(Long value) {
            addCriterion("questionuserId <", value, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridLessThanOrEqualTo(Long value) {
            addCriterion("questionuserId <=", value, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridIn(List<Long> values) {
            addCriterion("questionuserId in", values, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridNotIn(List<Long> values) {
            addCriterion("questionuserId not in", values, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridBetween(Long value1, Long value2) {
            addCriterion("questionuserId between", value1, value2, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuseridNotBetween(Long value1, Long value2) {
            addCriterion("questionuserId not between", value1, value2, "questionuserid");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgIsNull() {
            addCriterion("questionuserimg is null");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgIsNotNull() {
            addCriterion("questionuserimg is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgEqualTo(String value) {
            addCriterion("questionuserimg =", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgNotEqualTo(String value) {
            addCriterion("questionuserimg <>", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgGreaterThan(String value) {
            addCriterion("questionuserimg >", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgGreaterThanOrEqualTo(String value) {
            addCriterion("questionuserimg >=", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgLessThan(String value) {
            addCriterion("questionuserimg <", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgLessThanOrEqualTo(String value) {
            addCriterion("questionuserimg <=", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgLike(String value) {
            addCriterion("questionuserimg like", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgNotLike(String value) {
            addCriterion("questionuserimg not like", value, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgIn(List<String> values) {
            addCriterion("questionuserimg in", values, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgNotIn(List<String> values) {
            addCriterion("questionuserimg not in", values, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgBetween(String value1, String value2) {
            addCriterion("questionuserimg between", value1, value2, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestionuserimgNotBetween(String value1, String value2) {
            addCriterion("questionuserimg not between", value1, value2, "questionuserimg");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleIsNull() {
            addCriterion("questiontitle is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleIsNotNull() {
            addCriterion("questiontitle is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleEqualTo(String value) {
            addCriterion("questiontitle =", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotEqualTo(String value) {
            addCriterion("questiontitle <>", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleGreaterThan(String value) {
            addCriterion("questiontitle >", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleGreaterThanOrEqualTo(String value) {
            addCriterion("questiontitle >=", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleLessThan(String value) {
            addCriterion("questiontitle <", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleLessThanOrEqualTo(String value) {
            addCriterion("questiontitle <=", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleLike(String value) {
            addCriterion("questiontitle like", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotLike(String value) {
            addCriterion("questiontitle not like", value, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleIn(List<String> values) {
            addCriterion("questiontitle in", values, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotIn(List<String> values) {
            addCriterion("questiontitle not in", values, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleBetween(String value1, String value2) {
            addCriterion("questiontitle between", value1, value2, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestiontitleNotBetween(String value1, String value2) {
            addCriterion("questiontitle not between", value1, value2, "questiontitle");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeIsNull() {
            addCriterion("questioncreatime is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeIsNotNull() {
            addCriterion("questioncreatime is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeEqualTo(String value) {
            addCriterion("questioncreatime =", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeNotEqualTo(String value) {
            addCriterion("questioncreatime <>", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeGreaterThan(String value) {
            addCriterion("questioncreatime >", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeGreaterThanOrEqualTo(String value) {
            addCriterion("questioncreatime >=", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeLessThan(String value) {
            addCriterion("questioncreatime <", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeLessThanOrEqualTo(String value) {
            addCriterion("questioncreatime <=", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeLike(String value) {
            addCriterion("questioncreatime like", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeNotLike(String value) {
            addCriterion("questioncreatime not like", value, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeIn(List<String> values) {
            addCriterion("questioncreatime in", values, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeNotIn(List<String> values) {
            addCriterion("questioncreatime not in", values, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeBetween(String value1, String value2) {
            addCriterion("questioncreatime between", value1, value2, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestioncreatimeNotBetween(String value1, String value2) {
            addCriterion("questioncreatime not between", value1, value2, "questioncreatime");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowIsNull() {
            addCriterion("questionisshow is null");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowIsNotNull() {
            addCriterion("questionisshow is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowEqualTo(Byte value) {
            addCriterion("questionisshow =", value, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowNotEqualTo(Byte value) {
            addCriterion("questionisshow <>", value, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowGreaterThan(Byte value) {
            addCriterion("questionisshow >", value, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("questionisshow >=", value, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowLessThan(Byte value) {
            addCriterion("questionisshow <", value, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowLessThanOrEqualTo(Byte value) {
            addCriterion("questionisshow <=", value, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowIn(List<Byte> values) {
            addCriterion("questionisshow in", values, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowNotIn(List<Byte> values) {
            addCriterion("questionisshow not in", values, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowBetween(Byte value1, Byte value2) {
            addCriterion("questionisshow between", value1, value2, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("questionisshow not between", value1, value2, "questionisshow");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonIsNull() {
            addCriterion("questionreason is null");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonIsNotNull() {
            addCriterion("questionreason is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonEqualTo(String value) {
            addCriterion("questionreason =", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonNotEqualTo(String value) {
            addCriterion("questionreason <>", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonGreaterThan(String value) {
            addCriterion("questionreason >", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonGreaterThanOrEqualTo(String value) {
            addCriterion("questionreason >=", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonLessThan(String value) {
            addCriterion("questionreason <", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonLessThanOrEqualTo(String value) {
            addCriterion("questionreason <=", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonLike(String value) {
            addCriterion("questionreason like", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonNotLike(String value) {
            addCriterion("questionreason not like", value, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonIn(List<String> values) {
            addCriterion("questionreason in", values, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonNotIn(List<String> values) {
            addCriterion("questionreason not in", values, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonBetween(String value1, String value2) {
            addCriterion("questionreason between", value1, value2, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionreasonNotBetween(String value1, String value2) {
            addCriterion("questionreason not between", value1, value2, "questionreason");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusIsNull() {
            addCriterion("questionstatus is null");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusIsNotNull() {
            addCriterion("questionstatus is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusEqualTo(Byte value) {
            addCriterion("questionstatus =", value, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusNotEqualTo(Byte value) {
            addCriterion("questionstatus <>", value, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusGreaterThan(Byte value) {
            addCriterion("questionstatus >", value, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("questionstatus >=", value, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusLessThan(Byte value) {
            addCriterion("questionstatus <", value, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusLessThanOrEqualTo(Byte value) {
            addCriterion("questionstatus <=", value, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusIn(List<Byte> values) {
            addCriterion("questionstatus in", values, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusNotIn(List<Byte> values) {
            addCriterion("questionstatus not in", values, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusBetween(Byte value1, Byte value2) {
            addCriterion("questionstatus between", value1, value2, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("questionstatus not between", value1, value2, "questionstatus");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberIsNull() {
            addCriterion("questionpreviewnumber is null");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberIsNotNull() {
            addCriterion("questionpreviewnumber is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberEqualTo(Integer value) {
            addCriterion("questionpreviewnumber =", value, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberNotEqualTo(Integer value) {
            addCriterion("questionpreviewnumber <>", value, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberGreaterThan(Integer value) {
            addCriterion("questionpreviewnumber >", value, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionpreviewnumber >=", value, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberLessThan(Integer value) {
            addCriterion("questionpreviewnumber <", value, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberLessThanOrEqualTo(Integer value) {
            addCriterion("questionpreviewnumber <=", value, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberIn(List<Integer> values) {
            addCriterion("questionpreviewnumber in", values, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberNotIn(List<Integer> values) {
            addCriterion("questionpreviewnumber not in", values, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberBetween(Integer value1, Integer value2) {
            addCriterion("questionpreviewnumber between", value1, value2, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionpreviewnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("questionpreviewnumber not between", value1, value2, "questionpreviewnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberIsNull() {
            addCriterion("questionanswernumber is null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberIsNotNull() {
            addCriterion("questionanswernumber is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberEqualTo(Integer value) {
            addCriterion("questionanswernumber =", value, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberNotEqualTo(Integer value) {
            addCriterion("questionanswernumber <>", value, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberGreaterThan(Integer value) {
            addCriterion("questionanswernumber >", value, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionanswernumber >=", value, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberLessThan(Integer value) {
            addCriterion("questionanswernumber <", value, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberLessThanOrEqualTo(Integer value) {
            addCriterion("questionanswernumber <=", value, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberIn(List<Integer> values) {
            addCriterion("questionanswernumber in", values, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberNotIn(List<Integer> values) {
            addCriterion("questionanswernumber not in", values, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberBetween(Integer value1, Integer value2) {
            addCriterion("questionanswernumber between", value1, value2, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionanswernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("questionanswernumber not between", value1, value2, "questionanswernumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberIsNull() {
            addCriterion("praisenumber is null");
            return (Criteria) this;
        }

        public Criteria andPraisenumberIsNotNull() {
            addCriterion("praisenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPraisenumberEqualTo(Integer value) {
            addCriterion("praisenumber =", value, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberNotEqualTo(Integer value) {
            addCriterion("praisenumber <>", value, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberGreaterThan(Integer value) {
            addCriterion("praisenumber >", value, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("praisenumber >=", value, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberLessThan(Integer value) {
            addCriterion("praisenumber <", value, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberLessThanOrEqualTo(Integer value) {
            addCriterion("praisenumber <=", value, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberIn(List<Integer> values) {
            addCriterion("praisenumber in", values, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberNotIn(List<Integer> values) {
            addCriterion("praisenumber not in", values, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberBetween(Integer value1, Integer value2) {
            addCriterion("praisenumber between", value1, value2, "praisenumber");
            return (Criteria) this;
        }

        public Criteria andPraisenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("praisenumber not between", value1, value2, "praisenumber");
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