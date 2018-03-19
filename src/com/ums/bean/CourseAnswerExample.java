package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseAnswerExample() {
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

        public Criteria andAnwseridIsNull() {
            addCriterion("anwserId is null");
            return (Criteria) this;
        }

        public Criteria andAnwseridIsNotNull() {
            addCriterion("anwserId is not null");
            return (Criteria) this;
        }

        public Criteria andAnwseridEqualTo(Long value) {
            addCriterion("anwserId =", value, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridNotEqualTo(Long value) {
            addCriterion("anwserId <>", value, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridGreaterThan(Long value) {
            addCriterion("anwserId >", value, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridGreaterThanOrEqualTo(Long value) {
            addCriterion("anwserId >=", value, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridLessThan(Long value) {
            addCriterion("anwserId <", value, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridLessThanOrEqualTo(Long value) {
            addCriterion("anwserId <=", value, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridIn(List<Long> values) {
            addCriterion("anwserId in", values, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridNotIn(List<Long> values) {
            addCriterion("anwserId not in", values, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridBetween(Long value1, Long value2) {
            addCriterion("anwserId between", value1, value2, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwseridNotBetween(Long value1, Long value2) {
            addCriterion("anwserId not between", value1, value2, "anwserid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidIsNull() {
            addCriterion("anwserreplyId is null");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidIsNotNull() {
            addCriterion("anwserreplyId is not null");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidEqualTo(Long value) {
            addCriterion("anwserreplyId =", value, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidNotEqualTo(Long value) {
            addCriterion("anwserreplyId <>", value, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidGreaterThan(Long value) {
            addCriterion("anwserreplyId >", value, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidGreaterThanOrEqualTo(Long value) {
            addCriterion("anwserreplyId >=", value, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidLessThan(Long value) {
            addCriterion("anwserreplyId <", value, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidLessThanOrEqualTo(Long value) {
            addCriterion("anwserreplyId <=", value, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidIn(List<Long> values) {
            addCriterion("anwserreplyId in", values, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidNotIn(List<Long> values) {
            addCriterion("anwserreplyId not in", values, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidBetween(Long value1, Long value2) {
            addCriterion("anwserreplyId between", value1, value2, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserreplyidNotBetween(Long value1, Long value2) {
            addCriterion("anwserreplyId not between", value1, value2, "anwserreplyid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidIsNull() {
            addCriterion("anwserquestionId is null");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidIsNotNull() {
            addCriterion("anwserquestionId is not null");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidEqualTo(Long value) {
            addCriterion("anwserquestionId =", value, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidNotEqualTo(Long value) {
            addCriterion("anwserquestionId <>", value, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidGreaterThan(Long value) {
            addCriterion("anwserquestionId >", value, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidGreaterThanOrEqualTo(Long value) {
            addCriterion("anwserquestionId >=", value, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidLessThan(Long value) {
            addCriterion("anwserquestionId <", value, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidLessThanOrEqualTo(Long value) {
            addCriterion("anwserquestionId <=", value, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidIn(List<Long> values) {
            addCriterion("anwserquestionId in", values, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidNotIn(List<Long> values) {
            addCriterion("anwserquestionId not in", values, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidBetween(Long value1, Long value2) {
            addCriterion("anwserquestionId between", value1, value2, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnwserquestionidNotBetween(Long value1, Long value2) {
            addCriterion("anwserquestionId not between", value1, value2, "anwserquestionid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidIsNull() {
            addCriterion("answercourseId is null");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidIsNotNull() {
            addCriterion("answercourseId is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidEqualTo(Long value) {
            addCriterion("answercourseId =", value, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidNotEqualTo(Long value) {
            addCriterion("answercourseId <>", value, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidGreaterThan(Long value) {
            addCriterion("answercourseId >", value, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("answercourseId >=", value, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidLessThan(Long value) {
            addCriterion("answercourseId <", value, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidLessThanOrEqualTo(Long value) {
            addCriterion("answercourseId <=", value, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidIn(List<Long> values) {
            addCriterion("answercourseId in", values, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidNotIn(List<Long> values) {
            addCriterion("answercourseId not in", values, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidBetween(Long value1, Long value2) {
            addCriterion("answercourseId between", value1, value2, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andAnswercourseidNotBetween(Long value1, Long value2) {
            addCriterion("answercourseId not between", value1, value2, "answercourseid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridIsNull() {
            addCriterion("questioneruserId is null");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridIsNotNull() {
            addCriterion("questioneruserId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridEqualTo(Long value) {
            addCriterion("questioneruserId =", value, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridNotEqualTo(Long value) {
            addCriterion("questioneruserId <>", value, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridGreaterThan(Long value) {
            addCriterion("questioneruserId >", value, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("questioneruserId >=", value, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridLessThan(Long value) {
            addCriterion("questioneruserId <", value, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridLessThanOrEqualTo(Long value) {
            addCriterion("questioneruserId <=", value, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridIn(List<Long> values) {
            addCriterion("questioneruserId in", values, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridNotIn(List<Long> values) {
            addCriterion("questioneruserId not in", values, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridBetween(Long value1, Long value2) {
            addCriterion("questioneruserId between", value1, value2, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andQuestioneruseridNotBetween(Long value1, Long value2) {
            addCriterion("questioneruserId not between", value1, value2, "questioneruserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridIsNull() {
            addCriterion("respondentsuserId is null");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridIsNotNull() {
            addCriterion("respondentsuserId is not null");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridEqualTo(Long value) {
            addCriterion("respondentsuserId =", value, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridNotEqualTo(Long value) {
            addCriterion("respondentsuserId <>", value, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridGreaterThan(Long value) {
            addCriterion("respondentsuserId >", value, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("respondentsuserId >=", value, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridLessThan(Long value) {
            addCriterion("respondentsuserId <", value, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridLessThanOrEqualTo(Long value) {
            addCriterion("respondentsuserId <=", value, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridIn(List<Long> values) {
            addCriterion("respondentsuserId in", values, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridNotIn(List<Long> values) {
            addCriterion("respondentsuserId not in", values, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridBetween(Long value1, Long value2) {
            addCriterion("respondentsuserId between", value1, value2, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andRespondentsuseridNotBetween(Long value1, Long value2) {
            addCriterion("respondentsuserId not between", value1, value2, "respondentsuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeIsNull() {
            addCriterion("anwsercreatime is null");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeIsNotNull() {
            addCriterion("anwsercreatime is not null");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeEqualTo(String value) {
            addCriterion("anwsercreatime =", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeNotEqualTo(String value) {
            addCriterion("anwsercreatime <>", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeGreaterThan(String value) {
            addCriterion("anwsercreatime >", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeGreaterThanOrEqualTo(String value) {
            addCriterion("anwsercreatime >=", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeLessThan(String value) {
            addCriterion("anwsercreatime <", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeLessThanOrEqualTo(String value) {
            addCriterion("anwsercreatime <=", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeLike(String value) {
            addCriterion("anwsercreatime like", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeNotLike(String value) {
            addCriterion("anwsercreatime not like", value, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeIn(List<String> values) {
            addCriterion("anwsercreatime in", values, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeNotIn(List<String> values) {
            addCriterion("anwsercreatime not in", values, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeBetween(String value1, String value2) {
            addCriterion("anwsercreatime between", value1, value2, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwsercreatimeNotBetween(String value1, String value2) {
            addCriterion("anwsercreatime not between", value1, value2, "anwsercreatime");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowIsNull() {
            addCriterion("anwserisshow is null");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowIsNotNull() {
            addCriterion("anwserisshow is not null");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowEqualTo(Byte value) {
            addCriterion("anwserisshow =", value, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowNotEqualTo(Byte value) {
            addCriterion("anwserisshow <>", value, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowGreaterThan(Byte value) {
            addCriterion("anwserisshow >", value, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("anwserisshow >=", value, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowLessThan(Byte value) {
            addCriterion("anwserisshow <", value, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowLessThanOrEqualTo(Byte value) {
            addCriterion("anwserisshow <=", value, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowIn(List<Byte> values) {
            addCriterion("anwserisshow in", values, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowNotIn(List<Byte> values) {
            addCriterion("anwserisshow not in", values, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowBetween(Byte value1, Byte value2) {
            addCriterion("anwserisshow between", value1, value2, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwserisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("anwserisshow not between", value1, value2, "anwserisshow");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonIsNull() {
            addCriterion("anwsereason is null");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonIsNotNull() {
            addCriterion("anwsereason is not null");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonEqualTo(String value) {
            addCriterion("anwsereason =", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonNotEqualTo(String value) {
            addCriterion("anwsereason <>", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonGreaterThan(String value) {
            addCriterion("anwsereason >", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonGreaterThanOrEqualTo(String value) {
            addCriterion("anwsereason >=", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonLessThan(String value) {
            addCriterion("anwsereason <", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonLessThanOrEqualTo(String value) {
            addCriterion("anwsereason <=", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonLike(String value) {
            addCriterion("anwsereason like", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonNotLike(String value) {
            addCriterion("anwsereason not like", value, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonIn(List<String> values) {
            addCriterion("anwsereason in", values, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonNotIn(List<String> values) {
            addCriterion("anwsereason not in", values, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonBetween(String value1, String value2) {
            addCriterion("anwsereason between", value1, value2, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsereasonNotBetween(String value1, String value2) {
            addCriterion("anwsereason not between", value1, value2, "anwsereason");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeIsNull() {
            addCriterion("anwsermodifytime is null");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeIsNotNull() {
            addCriterion("anwsermodifytime is not null");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeEqualTo(String value) {
            addCriterion("anwsermodifytime =", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeNotEqualTo(String value) {
            addCriterion("anwsermodifytime <>", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeGreaterThan(String value) {
            addCriterion("anwsermodifytime >", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("anwsermodifytime >=", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeLessThan(String value) {
            addCriterion("anwsermodifytime <", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeLessThanOrEqualTo(String value) {
            addCriterion("anwsermodifytime <=", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeLike(String value) {
            addCriterion("anwsermodifytime like", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeNotLike(String value) {
            addCriterion("anwsermodifytime not like", value, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeIn(List<String> values) {
            addCriterion("anwsermodifytime in", values, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeNotIn(List<String> values) {
            addCriterion("anwsermodifytime not in", values, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeBetween(String value1, String value2) {
            addCriterion("anwsermodifytime between", value1, value2, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifytimeNotBetween(String value1, String value2) {
            addCriterion("anwsermodifytime not between", value1, value2, "anwsermodifytime");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridIsNull() {
            addCriterion("anwsermodifyuserId is null");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridIsNotNull() {
            addCriterion("anwsermodifyuserId is not null");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridEqualTo(Long value) {
            addCriterion("anwsermodifyuserId =", value, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridNotEqualTo(Long value) {
            addCriterion("anwsermodifyuserId <>", value, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridGreaterThan(Long value) {
            addCriterion("anwsermodifyuserId >", value, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("anwsermodifyuserId >=", value, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridLessThan(Long value) {
            addCriterion("anwsermodifyuserId <", value, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridLessThanOrEqualTo(Long value) {
            addCriterion("anwsermodifyuserId <=", value, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridIn(List<Long> values) {
            addCriterion("anwsermodifyuserId in", values, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridNotIn(List<Long> values) {
            addCriterion("anwsermodifyuserId not in", values, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridBetween(Long value1, Long value2) {
            addCriterion("anwsermodifyuserId between", value1, value2, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andAnwsermodifyuseridNotBetween(Long value1, Long value2) {
            addCriterion("anwsermodifyuserId not between", value1, value2, "anwsermodifyuserid");
            return (Criteria) this;
        }

        public Criteria andPraisenumIsNull() {
            addCriterion("praisenum is null");
            return (Criteria) this;
        }

        public Criteria andPraisenumIsNotNull() {
            addCriterion("praisenum is not null");
            return (Criteria) this;
        }

        public Criteria andPraisenumEqualTo(Integer value) {
            addCriterion("praisenum =", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotEqualTo(Integer value) {
            addCriterion("praisenum <>", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumGreaterThan(Integer value) {
            addCriterion("praisenum >", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("praisenum >=", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumLessThan(Integer value) {
            addCriterion("praisenum <", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumLessThanOrEqualTo(Integer value) {
            addCriterion("praisenum <=", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumIn(List<Integer> values) {
            addCriterion("praisenum in", values, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotIn(List<Integer> values) {
            addCriterion("praisenum not in", values, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumBetween(Integer value1, Integer value2) {
            addCriterion("praisenum between", value1, value2, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotBetween(Integer value1, Integer value2) {
            addCriterion("praisenum not between", value1, value2, "praisenum");
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