package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class IntegrationdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegrationdetailExample() {
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

        public Criteria andDetailidIsNull() {
            addCriterion("detailId is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("detailId is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(Long value) {
            addCriterion("detailId =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(Long value) {
            addCriterion("detailId <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(Long value) {
            addCriterion("detailId >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(Long value) {
            addCriterion("detailId >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(Long value) {
            addCriterion("detailId <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(Long value) {
            addCriterion("detailId <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<Long> values) {
            addCriterion("detailId in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<Long> values) {
            addCriterion("detailId not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(Long value1, Long value2) {
            addCriterion("detailId between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(Long value1, Long value2) {
            addCriterion("detailId not between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDuseridIsNull() {
            addCriterion("duserId is null");
            return (Criteria) this;
        }

        public Criteria andDuseridIsNotNull() {
            addCriterion("duserId is not null");
            return (Criteria) this;
        }

        public Criteria andDuseridEqualTo(Long value) {
            addCriterion("duserId =", value, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridNotEqualTo(Long value) {
            addCriterion("duserId <>", value, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridGreaterThan(Long value) {
            addCriterion("duserId >", value, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("duserId >=", value, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridLessThan(Long value) {
            addCriterion("duserId <", value, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridLessThanOrEqualTo(Long value) {
            addCriterion("duserId <=", value, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridIn(List<Long> values) {
            addCriterion("duserId in", values, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridNotIn(List<Long> values) {
            addCriterion("duserId not in", values, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridBetween(Long value1, Long value2) {
            addCriterion("duserId between", value1, value2, "duserid");
            return (Criteria) this;
        }

        public Criteria andDuseridNotBetween(Long value1, Long value2) {
            addCriterion("duserId not between", value1, value2, "duserid");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumIsNull() {
            addCriterion("integrationNum is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumIsNotNull() {
            addCriterion("integrationNum is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumEqualTo(Integer value) {
            addCriterion("integrationNum =", value, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumNotEqualTo(Integer value) {
            addCriterion("integrationNum <>", value, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumGreaterThan(Integer value) {
            addCriterion("integrationNum >", value, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("integrationNum >=", value, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumLessThan(Integer value) {
            addCriterion("integrationNum <", value, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumLessThanOrEqualTo(Integer value) {
            addCriterion("integrationNum <=", value, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumIn(List<Integer> values) {
            addCriterion("integrationNum in", values, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumNotIn(List<Integer> values) {
            addCriterion("integrationNum not in", values, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumBetween(Integer value1, Integer value2) {
            addCriterion("integrationNum between", value1, value2, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationnumNotBetween(Integer value1, Integer value2) {
            addCriterion("integrationNum not between", value1, value2, "integrationnum");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeIsNull() {
            addCriterion("integrationType is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeIsNotNull() {
            addCriterion("integrationType is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeEqualTo(String value) {
            addCriterion("integrationType =", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeNotEqualTo(String value) {
            addCriterion("integrationType <>", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeGreaterThan(String value) {
            addCriterion("integrationType >", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("integrationType >=", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeLessThan(String value) {
            addCriterion("integrationType <", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeLessThanOrEqualTo(String value) {
            addCriterion("integrationType <=", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeLike(String value) {
            addCriterion("integrationType like", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeNotLike(String value) {
            addCriterion("integrationType not like", value, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeIn(List<String> values) {
            addCriterion("integrationType in", values, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeNotIn(List<String> values) {
            addCriterion("integrationType not in", values, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeBetween(String value1, String value2) {
            addCriterion("integrationType between", value1, value2, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andIntegrationtypeNotBetween(String value1, String value2) {
            addCriterion("integrationType not between", value1, value2, "integrationtype");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeIsNull() {
            addCriterion("dcreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeIsNotNull() {
            addCriterion("dcreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeEqualTo(String value) {
            addCriterion("dcreateTime =", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotEqualTo(String value) {
            addCriterion("dcreateTime <>", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeGreaterThan(String value) {
            addCriterion("dcreateTime >", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("dcreateTime >=", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeLessThan(String value) {
            addCriterion("dcreateTime <", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("dcreateTime <=", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeLike(String value) {
            addCriterion("dcreateTime like", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotLike(String value) {
            addCriterion("dcreateTime not like", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeIn(List<String> values) {
            addCriterion("dcreateTime in", values, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotIn(List<String> values) {
            addCriterion("dcreateTime not in", values, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeBetween(String value1, String value2) {
            addCriterion("dcreateTime between", value1, value2, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotBetween(String value1, String value2) {
            addCriterion("dcreateTime not between", value1, value2, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatemanIsNull() {
            addCriterion("dcreateMan is null");
            return (Criteria) this;
        }

        public Criteria andDcreatemanIsNotNull() {
            addCriterion("dcreateMan is not null");
            return (Criteria) this;
        }

        public Criteria andDcreatemanEqualTo(Long value) {
            addCriterion("dcreateMan =", value, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanNotEqualTo(Long value) {
            addCriterion("dcreateMan <>", value, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanGreaterThan(Long value) {
            addCriterion("dcreateMan >", value, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanGreaterThanOrEqualTo(Long value) {
            addCriterion("dcreateMan >=", value, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanLessThan(Long value) {
            addCriterion("dcreateMan <", value, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanLessThanOrEqualTo(Long value) {
            addCriterion("dcreateMan <=", value, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanIn(List<Long> values) {
            addCriterion("dcreateMan in", values, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanNotIn(List<Long> values) {
            addCriterion("dcreateMan not in", values, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanBetween(Long value1, Long value2) {
            addCriterion("dcreateMan between", value1, value2, "dcreateman");
            return (Criteria) this;
        }

        public Criteria andDcreatemanNotBetween(Long value1, Long value2) {
            addCriterion("dcreateMan not between", value1, value2, "dcreateman");
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