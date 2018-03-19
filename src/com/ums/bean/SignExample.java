package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class SignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignExample() {
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

        public Criteria andSignidIsNull() {
            addCriterion("signId is null");
            return (Criteria) this;
        }

        public Criteria andSignidIsNotNull() {
            addCriterion("signId is not null");
            return (Criteria) this;
        }

        public Criteria andSignidEqualTo(Long value) {
            addCriterion("signId =", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotEqualTo(Long value) {
            addCriterion("signId <>", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThan(Long value) {
            addCriterion("signId >", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThanOrEqualTo(Long value) {
            addCriterion("signId >=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThan(Long value) {
            addCriterion("signId <", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThanOrEqualTo(Long value) {
            addCriterion("signId <=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidIn(List<Long> values) {
            addCriterion("signId in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotIn(List<Long> values) {
            addCriterion("signId not in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidBetween(Long value1, Long value2) {
            addCriterion("signId between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotBetween(Long value1, Long value2) {
            addCriterion("signId not between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignuseridIsNull() {
            addCriterion("signUserId is null");
            return (Criteria) this;
        }

        public Criteria andSignuseridIsNotNull() {
            addCriterion("signUserId is not null");
            return (Criteria) this;
        }

        public Criteria andSignuseridEqualTo(Long value) {
            addCriterion("signUserId =", value, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridNotEqualTo(Long value) {
            addCriterion("signUserId <>", value, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridGreaterThan(Long value) {
            addCriterion("signUserId >", value, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("signUserId >=", value, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridLessThan(Long value) {
            addCriterion("signUserId <", value, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridLessThanOrEqualTo(Long value) {
            addCriterion("signUserId <=", value, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridIn(List<Long> values) {
            addCriterion("signUserId in", values, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridNotIn(List<Long> values) {
            addCriterion("signUserId not in", values, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridBetween(Long value1, Long value2) {
            addCriterion("signUserId between", value1, value2, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSignuseridNotBetween(Long value1, Long value2) {
            addCriterion("signUserId not between", value1, value2, "signuserid");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(String value) {
            addCriterion("signTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(String value) {
            addCriterion("signTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(String value) {
            addCriterion("signTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(String value) {
            addCriterion("signTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(String value) {
            addCriterion("signTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(String value) {
            addCriterion("signTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLike(String value) {
            addCriterion("signTime like", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotLike(String value) {
            addCriterion("signTime not like", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<String> values) {
            addCriterion("signTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<String> values) {
            addCriterion("signTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(String value1, String value2) {
            addCriterion("signTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(String value1, String value2) {
            addCriterion("signTime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSignstatusIsNull() {
            addCriterion("signStatus is null");
            return (Criteria) this;
        }

        public Criteria andSignstatusIsNotNull() {
            addCriterion("signStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSignstatusEqualTo(Byte value) {
            addCriterion("signStatus =", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotEqualTo(Byte value) {
            addCriterion("signStatus <>", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusGreaterThan(Byte value) {
            addCriterion("signStatus >", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("signStatus >=", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLessThan(Byte value) {
            addCriterion("signStatus <", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLessThanOrEqualTo(Byte value) {
            addCriterion("signStatus <=", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusIn(List<Byte> values) {
            addCriterion("signStatus in", values, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotIn(List<Byte> values) {
            addCriterion("signStatus not in", values, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusBetween(Byte value1, Byte value2) {
            addCriterion("signStatus between", value1, value2, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("signStatus not between", value1, value2, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSigngodaysIsNull() {
            addCriterion("signGoDays is null");
            return (Criteria) this;
        }

        public Criteria andSigngodaysIsNotNull() {
            addCriterion("signGoDays is not null");
            return (Criteria) this;
        }

        public Criteria andSigngodaysEqualTo(Integer value) {
            addCriterion("signGoDays =", value, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysNotEqualTo(Integer value) {
            addCriterion("signGoDays <>", value, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysGreaterThan(Integer value) {
            addCriterion("signGoDays >", value, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("signGoDays >=", value, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysLessThan(Integer value) {
            addCriterion("signGoDays <", value, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysLessThanOrEqualTo(Integer value) {
            addCriterion("signGoDays <=", value, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysIn(List<Integer> values) {
            addCriterion("signGoDays in", values, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysNotIn(List<Integer> values) {
            addCriterion("signGoDays not in", values, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysBetween(Integer value1, Integer value2) {
            addCriterion("signGoDays between", value1, value2, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSigngodaysNotBetween(Integer value1, Integer value2) {
            addCriterion("signGoDays not between", value1, value2, "signgodays");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersIsNull() {
            addCriterion("signShareNumbers is null");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersIsNotNull() {
            addCriterion("signShareNumbers is not null");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersEqualTo(Integer value) {
            addCriterion("signShareNumbers =", value, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersNotEqualTo(Integer value) {
            addCriterion("signShareNumbers <>", value, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersGreaterThan(Integer value) {
            addCriterion("signShareNumbers >", value, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("signShareNumbers >=", value, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersLessThan(Integer value) {
            addCriterion("signShareNumbers <", value, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersLessThanOrEqualTo(Integer value) {
            addCriterion("signShareNumbers <=", value, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersIn(List<Integer> values) {
            addCriterion("signShareNumbers in", values, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersNotIn(List<Integer> values) {
            addCriterion("signShareNumbers not in", values, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersBetween(Integer value1, Integer value2) {
            addCriterion("signShareNumbers between", value1, value2, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSignsharenumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("signShareNumbers not between", value1, value2, "signsharenumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersIsNull() {
            addCriterion("signCommentNumbers is null");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersIsNotNull() {
            addCriterion("signCommentNumbers is not null");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersEqualTo(Integer value) {
            addCriterion("signCommentNumbers =", value, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersNotEqualTo(Integer value) {
            addCriterion("signCommentNumbers <>", value, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersGreaterThan(Integer value) {
            addCriterion("signCommentNumbers >", value, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("signCommentNumbers >=", value, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersLessThan(Integer value) {
            addCriterion("signCommentNumbers <", value, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersLessThanOrEqualTo(Integer value) {
            addCriterion("signCommentNumbers <=", value, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersIn(List<Integer> values) {
            addCriterion("signCommentNumbers in", values, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersNotIn(List<Integer> values) {
            addCriterion("signCommentNumbers not in", values, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersBetween(Integer value1, Integer value2) {
            addCriterion("signCommentNumbers between", value1, value2, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSigncommentnumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("signCommentNumbers not between", value1, value2, "signcommentnumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersIsNull() {
            addCriterion("signuploadfileNumbers is null");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersIsNotNull() {
            addCriterion("signuploadfileNumbers is not null");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersEqualTo(Integer value) {
            addCriterion("signuploadfileNumbers =", value, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersNotEqualTo(Integer value) {
            addCriterion("signuploadfileNumbers <>", value, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersGreaterThan(Integer value) {
            addCriterion("signuploadfileNumbers >", value, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("signuploadfileNumbers >=", value, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersLessThan(Integer value) {
            addCriterion("signuploadfileNumbers <", value, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersLessThanOrEqualTo(Integer value) {
            addCriterion("signuploadfileNumbers <=", value, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersIn(List<Integer> values) {
            addCriterion("signuploadfileNumbers in", values, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersNotIn(List<Integer> values) {
            addCriterion("signuploadfileNumbers not in", values, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersBetween(Integer value1, Integer value2) {
            addCriterion("signuploadfileNumbers between", value1, value2, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignuploadfilenumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("signuploadfileNumbers not between", value1, value2, "signuploadfilenumbers");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalIsNull() {
            addCriterion("signNextIntergal is null");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalIsNotNull() {
            addCriterion("signNextIntergal is not null");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalEqualTo(Integer value) {
            addCriterion("signNextIntergal =", value, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalNotEqualTo(Integer value) {
            addCriterion("signNextIntergal <>", value, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalGreaterThan(Integer value) {
            addCriterion("signNextIntergal >", value, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalGreaterThanOrEqualTo(Integer value) {
            addCriterion("signNextIntergal >=", value, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalLessThan(Integer value) {
            addCriterion("signNextIntergal <", value, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalLessThanOrEqualTo(Integer value) {
            addCriterion("signNextIntergal <=", value, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalIn(List<Integer> values) {
            addCriterion("signNextIntergal in", values, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalNotIn(List<Integer> values) {
            addCriterion("signNextIntergal not in", values, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalBetween(Integer value1, Integer value2) {
            addCriterion("signNextIntergal between", value1, value2, "signnextintergal");
            return (Criteria) this;
        }

        public Criteria andSignnextintergalNotBetween(Integer value1, Integer value2) {
            addCriterion("signNextIntergal not between", value1, value2, "signnextintergal");
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