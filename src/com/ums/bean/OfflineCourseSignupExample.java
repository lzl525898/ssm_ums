package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class OfflineCourseSignupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfflineCourseSignupExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andSchooltimeIsNull() {
            addCriterion("schooltime is null");
            return (Criteria) this;
        }

        public Criteria andSchooltimeIsNotNull() {
            addCriterion("schooltime is not null");
            return (Criteria) this;
        }

        public Criteria andSchooltimeEqualTo(String value) {
            addCriterion("schooltime =", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotEqualTo(String value) {
            addCriterion("schooltime <>", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeGreaterThan(String value) {
            addCriterion("schooltime >", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeGreaterThanOrEqualTo(String value) {
            addCriterion("schooltime >=", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeLessThan(String value) {
            addCriterion("schooltime <", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeLessThanOrEqualTo(String value) {
            addCriterion("schooltime <=", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeLike(String value) {
            addCriterion("schooltime like", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotLike(String value) {
            addCriterion("schooltime not like", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeIn(List<String> values) {
            addCriterion("schooltime in", values, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotIn(List<String> values) {
            addCriterion("schooltime not in", values, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeBetween(String value1, String value2) {
            addCriterion("schooltime between", value1, value2, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotBetween(String value1, String value2) {
            addCriterion("schooltime not between", value1, value2, "schooltime");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuName is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuName is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuName =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuName <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuName >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuName >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuName <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuName <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuName like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuName not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuName in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuName not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuName between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuName not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdIsNull() {
            addCriterion("olCourse_id is null");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdIsNotNull() {
            addCriterion("olCourse_id is not null");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdEqualTo(Long value) {
            addCriterion("olCourse_id =", value, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdNotEqualTo(Long value) {
            addCriterion("olCourse_id <>", value, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdGreaterThan(Long value) {
            addCriterion("olCourse_id >", value, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("olCourse_id >=", value, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdLessThan(Long value) {
            addCriterion("olCourse_id <", value, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdLessThanOrEqualTo(Long value) {
            addCriterion("olCourse_id <=", value, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdIn(List<Long> values) {
            addCriterion("olCourse_id in", values, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdNotIn(List<Long> values) {
            addCriterion("olCourse_id not in", values, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdBetween(Long value1, Long value2) {
            addCriterion("olCourse_id between", value1, value2, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andOlcourseIdNotBetween(Long value1, Long value2) {
            addCriterion("olCourse_id not between", value1, value2, "olcourseId");
            return (Criteria) this;
        }

        public Criteria andStugradeIsNull() {
            addCriterion("stuGrade is null");
            return (Criteria) this;
        }

        public Criteria andStugradeIsNotNull() {
            addCriterion("stuGrade is not null");
            return (Criteria) this;
        }

        public Criteria andStugradeEqualTo(String value) {
            addCriterion("stuGrade =", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotEqualTo(String value) {
            addCriterion("stuGrade <>", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeGreaterThan(String value) {
            addCriterion("stuGrade >", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeGreaterThanOrEqualTo(String value) {
            addCriterion("stuGrade >=", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLessThan(String value) {
            addCriterion("stuGrade <", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLessThanOrEqualTo(String value) {
            addCriterion("stuGrade <=", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLike(String value) {
            addCriterion("stuGrade like", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotLike(String value) {
            addCriterion("stuGrade not like", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeIn(List<String> values) {
            addCriterion("stuGrade in", values, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotIn(List<String> values) {
            addCriterion("stuGrade not in", values, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeBetween(String value1, String value2) {
            addCriterion("stuGrade between", value1, value2, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotBetween(String value1, String value2) {
            addCriterion("stuGrade not between", value1, value2, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNull() {
            addCriterion("stuPhone is null");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNotNull() {
            addCriterion("stuPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStuphoneEqualTo(String value) {
            addCriterion("stuPhone =", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotEqualTo(String value) {
            addCriterion("stuPhone <>", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThan(String value) {
            addCriterion("stuPhone >", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stuPhone >=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThan(String value) {
            addCriterion("stuPhone <", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThanOrEqualTo(String value) {
            addCriterion("stuPhone <=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLike(String value) {
            addCriterion("stuPhone like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotLike(String value) {
            addCriterion("stuPhone not like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneIn(List<String> values) {
            addCriterion("stuPhone in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotIn(List<String> values) {
            addCriterion("stuPhone not in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneBetween(String value1, String value2) {
            addCriterion("stuPhone between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotBetween(String value1, String value2) {
            addCriterion("stuPhone not between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuaddressIsNull() {
            addCriterion("stuAddress is null");
            return (Criteria) this;
        }

        public Criteria andStuaddressIsNotNull() {
            addCriterion("stuAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStuaddressEqualTo(String value) {
            addCriterion("stuAddress =", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotEqualTo(String value) {
            addCriterion("stuAddress <>", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressGreaterThan(String value) {
            addCriterion("stuAddress >", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("stuAddress >=", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressLessThan(String value) {
            addCriterion("stuAddress <", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressLessThanOrEqualTo(String value) {
            addCriterion("stuAddress <=", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressLike(String value) {
            addCriterion("stuAddress like", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotLike(String value) {
            addCriterion("stuAddress not like", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressIn(List<String> values) {
            addCriterion("stuAddress in", values, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotIn(List<String> values) {
            addCriterion("stuAddress not in", values, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressBetween(String value1, String value2) {
            addCriterion("stuAddress between", value1, value2, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotBetween(String value1, String value2) {
            addCriterion("stuAddress not between", value1, value2, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("isPay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("isPay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Integer value) {
            addCriterion("isPay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Integer value) {
            addCriterion("isPay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Integer value) {
            addCriterion("isPay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Integer value) {
            addCriterion("isPay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Integer value) {
            addCriterion("isPay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Integer> values) {
            addCriterion("isPay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Integer> values) {
            addCriterion("isPay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Integer value1, Integer value2) {
            addCriterion("isPay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Integer value1, Integer value2) {
            addCriterion("isPay not between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIsNull() {
            addCriterion("outTradeNo is null");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIsNotNull() {
            addCriterion("outTradeNo is not null");
            return (Criteria) this;
        }

        public Criteria andOuttradenoEqualTo(String value) {
            addCriterion("outTradeNo =", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotEqualTo(String value) {
            addCriterion("outTradeNo <>", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoGreaterThan(String value) {
            addCriterion("outTradeNo >", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoGreaterThanOrEqualTo(String value) {
            addCriterion("outTradeNo >=", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLessThan(String value) {
            addCriterion("outTradeNo <", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLessThanOrEqualTo(String value) {
            addCriterion("outTradeNo <=", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLike(String value) {
            addCriterion("outTradeNo like", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotLike(String value) {
            addCriterion("outTradeNo not like", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIn(List<String> values) {
            addCriterion("outTradeNo in", values, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotIn(List<String> values) {
            addCriterion("outTradeNo not in", values, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoBetween(String value1, String value2) {
            addCriterion("outTradeNo between", value1, value2, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotBetween(String value1, String value2) {
            addCriterion("outTradeNo not between", value1, value2, "outtradeno");
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