package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class ScworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScworkExample() {
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

        public Criteria andScidIsNull() {
            addCriterion("scId is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scId is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Long value) {
            addCriterion("scId =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Long value) {
            addCriterion("scId <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Long value) {
            addCriterion("scId >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Long value) {
            addCriterion("scId >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Long value) {
            addCriterion("scId <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Long value) {
            addCriterion("scId <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Long> values) {
            addCriterion("scId in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Long> values) {
            addCriterion("scId not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Long value1, Long value2) {
            addCriterion("scId between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Long value1, Long value2) {
            addCriterion("scId not between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScworkidIsNull() {
            addCriterion("scworkId is null");
            return (Criteria) this;
        }

        public Criteria andScworkidIsNotNull() {
            addCriterion("scworkId is not null");
            return (Criteria) this;
        }

        public Criteria andScworkidEqualTo(Long value) {
            addCriterion("scworkId =", value, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidNotEqualTo(Long value) {
            addCriterion("scworkId <>", value, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidGreaterThan(Long value) {
            addCriterion("scworkId >", value, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidGreaterThanOrEqualTo(Long value) {
            addCriterion("scworkId >=", value, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidLessThan(Long value) {
            addCriterion("scworkId <", value, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidLessThanOrEqualTo(Long value) {
            addCriterion("scworkId <=", value, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidIn(List<Long> values) {
            addCriterion("scworkId in", values, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidNotIn(List<Long> values) {
            addCriterion("scworkId not in", values, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidBetween(Long value1, Long value2) {
            addCriterion("scworkId between", value1, value2, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScworkidNotBetween(Long value1, Long value2) {
            addCriterion("scworkId not between", value1, value2, "scworkid");
            return (Criteria) this;
        }

        public Criteria andScuseridIsNull() {
            addCriterion("scuserId is null");
            return (Criteria) this;
        }

        public Criteria andScuseridIsNotNull() {
            addCriterion("scuserId is not null");
            return (Criteria) this;
        }

        public Criteria andScuseridEqualTo(Long value) {
            addCriterion("scuserId =", value, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridNotEqualTo(Long value) {
            addCriterion("scuserId <>", value, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridGreaterThan(Long value) {
            addCriterion("scuserId >", value, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("scuserId >=", value, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridLessThan(Long value) {
            addCriterion("scuserId <", value, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridLessThanOrEqualTo(Long value) {
            addCriterion("scuserId <=", value, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridIn(List<Long> values) {
            addCriterion("scuserId in", values, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridNotIn(List<Long> values) {
            addCriterion("scuserId not in", values, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridBetween(Long value1, Long value2) {
            addCriterion("scuserId between", value1, value2, "scuserid");
            return (Criteria) this;
        }

        public Criteria andScuseridNotBetween(Long value1, Long value2) {
            addCriterion("scuserId not between", value1, value2, "scuserid");
            return (Criteria) this;
        }

        public Criteria andSctimeIsNull() {
            addCriterion("sctime is null");
            return (Criteria) this;
        }

        public Criteria andSctimeIsNotNull() {
            addCriterion("sctime is not null");
            return (Criteria) this;
        }

        public Criteria andSctimeEqualTo(String value) {
            addCriterion("sctime =", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotEqualTo(String value) {
            addCriterion("sctime <>", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeGreaterThan(String value) {
            addCriterion("sctime >", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeGreaterThanOrEqualTo(String value) {
            addCriterion("sctime >=", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeLessThan(String value) {
            addCriterion("sctime <", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeLessThanOrEqualTo(String value) {
            addCriterion("sctime <=", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeLike(String value) {
            addCriterion("sctime like", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotLike(String value) {
            addCriterion("sctime not like", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeIn(List<String> values) {
            addCriterion("sctime in", values, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotIn(List<String> values) {
            addCriterion("sctime not in", values, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeBetween(String value1, String value2) {
            addCriterion("sctime between", value1, value2, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotBetween(String value1, String value2) {
            addCriterion("sctime not between", value1, value2, "sctime");
            return (Criteria) this;
        }

        public Criteria andScstatusIsNull() {
            addCriterion("scstatus is null");
            return (Criteria) this;
        }

        public Criteria andScstatusIsNotNull() {
            addCriterion("scstatus is not null");
            return (Criteria) this;
        }

        public Criteria andScstatusEqualTo(Byte value) {
            addCriterion("scstatus =", value, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusNotEqualTo(Byte value) {
            addCriterion("scstatus <>", value, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusGreaterThan(Byte value) {
            addCriterion("scstatus >", value, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("scstatus >=", value, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusLessThan(Byte value) {
            addCriterion("scstatus <", value, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusLessThanOrEqualTo(Byte value) {
            addCriterion("scstatus <=", value, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusIn(List<Byte> values) {
            addCriterion("scstatus in", values, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusNotIn(List<Byte> values) {
            addCriterion("scstatus not in", values, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusBetween(Byte value1, Byte value2) {
            addCriterion("scstatus between", value1, value2, "scstatus");
            return (Criteria) this;
        }

        public Criteria andScstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("scstatus not between", value1, value2, "scstatus");
            return (Criteria) this;
        }

        public Criteria andSctypeIsNull() {
            addCriterion("sctype is null");
            return (Criteria) this;
        }

        public Criteria andSctypeIsNotNull() {
            addCriterion("sctype is not null");
            return (Criteria) this;
        }

        public Criteria andSctypeEqualTo(Byte value) {
            addCriterion("sctype =", value, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeNotEqualTo(Byte value) {
            addCriterion("sctype <>", value, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeGreaterThan(Byte value) {
            addCriterion("sctype >", value, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sctype >=", value, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeLessThan(Byte value) {
            addCriterion("sctype <", value, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeLessThanOrEqualTo(Byte value) {
            addCriterion("sctype <=", value, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeIn(List<Byte> values) {
            addCriterion("sctype in", values, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeNotIn(List<Byte> values) {
            addCriterion("sctype not in", values, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeBetween(Byte value1, Byte value2) {
            addCriterion("sctype between", value1, value2, "sctype");
            return (Criteria) this;
        }

        public Criteria andSctypeNotBetween(Byte value1, Byte value2) {
            addCriterion("sctype not between", value1, value2, "sctype");
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