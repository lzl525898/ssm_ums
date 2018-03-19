package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseSCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseSCExample() {
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

        public Criteria andCoursescidIsNull() {
            addCriterion("coursescId is null");
            return (Criteria) this;
        }

        public Criteria andCoursescidIsNotNull() {
            addCriterion("coursescId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursescidEqualTo(Long value) {
            addCriterion("coursescId =", value, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidNotEqualTo(Long value) {
            addCriterion("coursescId <>", value, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidGreaterThan(Long value) {
            addCriterion("coursescId >", value, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidGreaterThanOrEqualTo(Long value) {
            addCriterion("coursescId >=", value, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidLessThan(Long value) {
            addCriterion("coursescId <", value, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidLessThanOrEqualTo(Long value) {
            addCriterion("coursescId <=", value, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidIn(List<Long> values) {
            addCriterion("coursescId in", values, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidNotIn(List<Long> values) {
            addCriterion("coursescId not in", values, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidBetween(Long value1, Long value2) {
            addCriterion("coursescId between", value1, value2, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCoursescidNotBetween(Long value1, Long value2) {
            addCriterion("coursescId not between", value1, value2, "coursescid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidIsNull() {
            addCriterion("courseaboutId is null");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidIsNotNull() {
            addCriterion("courseaboutId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidEqualTo(Long value) {
            addCriterion("courseaboutId =", value, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidNotEqualTo(Long value) {
            addCriterion("courseaboutId <>", value, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidGreaterThan(Long value) {
            addCriterion("courseaboutId >", value, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidGreaterThanOrEqualTo(Long value) {
            addCriterion("courseaboutId >=", value, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidLessThan(Long value) {
            addCriterion("courseaboutId <", value, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidLessThanOrEqualTo(Long value) {
            addCriterion("courseaboutId <=", value, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidIn(List<Long> values) {
            addCriterion("courseaboutId in", values, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidNotIn(List<Long> values) {
            addCriterion("courseaboutId not in", values, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidBetween(Long value1, Long value2) {
            addCriterion("courseaboutId between", value1, value2, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCourseaboutidNotBetween(Long value1, Long value2) {
            addCriterion("courseaboutId not between", value1, value2, "courseaboutid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridIsNull() {
            addCriterion("coursescuserId is null");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridIsNotNull() {
            addCriterion("coursescuserId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridEqualTo(Long value) {
            addCriterion("coursescuserId =", value, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridNotEqualTo(Long value) {
            addCriterion("coursescuserId <>", value, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridGreaterThan(Long value) {
            addCriterion("coursescuserId >", value, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("coursescuserId >=", value, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridLessThan(Long value) {
            addCriterion("coursescuserId <", value, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridLessThanOrEqualTo(Long value) {
            addCriterion("coursescuserId <=", value, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridIn(List<Long> values) {
            addCriterion("coursescuserId in", values, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridNotIn(List<Long> values) {
            addCriterion("coursescuserId not in", values, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridBetween(Long value1, Long value2) {
            addCriterion("coursescuserId between", value1, value2, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursescuseridNotBetween(Long value1, Long value2) {
            addCriterion("coursescuserId not between", value1, value2, "coursescuserid");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeIsNull() {
            addCriterion("coursesctime is null");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeIsNotNull() {
            addCriterion("coursesctime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeEqualTo(String value) {
            addCriterion("coursesctime =", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeNotEqualTo(String value) {
            addCriterion("coursesctime <>", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeGreaterThan(String value) {
            addCriterion("coursesctime >", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeGreaterThanOrEqualTo(String value) {
            addCriterion("coursesctime >=", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeLessThan(String value) {
            addCriterion("coursesctime <", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeLessThanOrEqualTo(String value) {
            addCriterion("coursesctime <=", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeLike(String value) {
            addCriterion("coursesctime like", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeNotLike(String value) {
            addCriterion("coursesctime not like", value, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeIn(List<String> values) {
            addCriterion("coursesctime in", values, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeNotIn(List<String> values) {
            addCriterion("coursesctime not in", values, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeBetween(String value1, String value2) {
            addCriterion("coursesctime between", value1, value2, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursesctimeNotBetween(String value1, String value2) {
            addCriterion("coursesctime not between", value1, value2, "coursesctime");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusIsNull() {
            addCriterion("coursescstatus is null");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusIsNotNull() {
            addCriterion("coursescstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusEqualTo(Byte value) {
            addCriterion("coursescstatus =", value, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusNotEqualTo(Byte value) {
            addCriterion("coursescstatus <>", value, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusGreaterThan(Byte value) {
            addCriterion("coursescstatus >", value, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("coursescstatus >=", value, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusLessThan(Byte value) {
            addCriterion("coursescstatus <", value, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusLessThanOrEqualTo(Byte value) {
            addCriterion("coursescstatus <=", value, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusIn(List<Byte> values) {
            addCriterion("coursescstatus in", values, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusNotIn(List<Byte> values) {
            addCriterion("coursescstatus not in", values, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusBetween(Byte value1, Byte value2) {
            addCriterion("coursescstatus between", value1, value2, "coursescstatus");
            return (Criteria) this;
        }

        public Criteria andCoursescstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("coursescstatus not between", value1, value2, "coursescstatus");
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