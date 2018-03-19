package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class LogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogsExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("log_type like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("log_type not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTitleIsNull() {
            addCriterion("log_title is null");
            return (Criteria) this;
        }

        public Criteria andLogTitleIsNotNull() {
            addCriterion("log_title is not null");
            return (Criteria) this;
        }

        public Criteria andLogTitleEqualTo(String value) {
            addCriterion("log_title =", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotEqualTo(String value) {
            addCriterion("log_title <>", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleGreaterThan(String value) {
            addCriterion("log_title >", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("log_title >=", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleLessThan(String value) {
            addCriterion("log_title <", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleLessThanOrEqualTo(String value) {
            addCriterion("log_title <=", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleLike(String value) {
            addCriterion("log_title like", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotLike(String value) {
            addCriterion("log_title not like", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleIn(List<String> values) {
            addCriterion("log_title in", values, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotIn(List<String> values) {
            addCriterion("log_title not in", values, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleBetween(String value1, String value2) {
            addCriterion("log_title between", value1, value2, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotBetween(String value1, String value2) {
            addCriterion("log_title not between", value1, value2, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(String value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(String value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(String value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(String value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(String value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(String value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLike(String value) {
            addCriterion("log_date like", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotLike(String value) {
            addCriterion("log_date not like", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<String> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<String> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(String value1, String value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(String value1, String value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogStatusIsNull() {
            addCriterion("log_status is null");
            return (Criteria) this;
        }

        public Criteria andLogStatusIsNotNull() {
            addCriterion("log_status is not null");
            return (Criteria) this;
        }

        public Criteria andLogStatusEqualTo(String value) {
            addCriterion("log_status =", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotEqualTo(String value) {
            addCriterion("log_status <>", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusGreaterThan(String value) {
            addCriterion("log_status >", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusGreaterThanOrEqualTo(String value) {
            addCriterion("log_status >=", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLessThan(String value) {
            addCriterion("log_status <", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLessThanOrEqualTo(String value) {
            addCriterion("log_status <=", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLike(String value) {
            addCriterion("log_status like", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotLike(String value) {
            addCriterion("log_status not like", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusIn(List<String> values) {
            addCriterion("log_status in", values, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotIn(List<String> values) {
            addCriterion("log_status not in", values, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusBetween(String value1, String value2) {
            addCriterion("log_status between", value1, value2, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotBetween(String value1, String value2) {
            addCriterion("log_status not between", value1, value2, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogCategoryIsNull() {
            addCriterion("log_category is null");
            return (Criteria) this;
        }

        public Criteria andLogCategoryIsNotNull() {
            addCriterion("log_category is not null");
            return (Criteria) this;
        }

        public Criteria andLogCategoryEqualTo(String value) {
            addCriterion("log_category =", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryNotEqualTo(String value) {
            addCriterion("log_category <>", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryGreaterThan(String value) {
            addCriterion("log_category >", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("log_category >=", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryLessThan(String value) {
            addCriterion("log_category <", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryLessThanOrEqualTo(String value) {
            addCriterion("log_category <=", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryLike(String value) {
            addCriterion("log_category like", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryNotLike(String value) {
            addCriterion("log_category not like", value, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryIn(List<String> values) {
            addCriterion("log_category in", values, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryNotIn(List<String> values) {
            addCriterion("log_category not in", values, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryBetween(String value1, String value2) {
            addCriterion("log_category between", value1, value2, "logCategory");
            return (Criteria) this;
        }

        public Criteria andLogCategoryNotBetween(String value1, String value2) {
            addCriterion("log_category not between", value1, value2, "logCategory");
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