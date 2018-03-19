package com.ums.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenupathIsNull() {
            addCriterion("menuPath is null");
            return (Criteria) this;
        }

        public Criteria andMenupathIsNotNull() {
            addCriterion("menuPath is not null");
            return (Criteria) this;
        }

        public Criteria andMenupathEqualTo(String value) {
            addCriterion("menuPath =", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotEqualTo(String value) {
            addCriterion("menuPath <>", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathGreaterThan(String value) {
            addCriterion("menuPath >", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathGreaterThanOrEqualTo(String value) {
            addCriterion("menuPath >=", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathLessThan(String value) {
            addCriterion("menuPath <", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathLessThanOrEqualTo(String value) {
            addCriterion("menuPath <=", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathLike(String value) {
            addCriterion("menuPath like", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotLike(String value) {
            addCriterion("menuPath not like", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathIn(List<String> values) {
            addCriterion("menuPath in", values, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotIn(List<String> values) {
            addCriterion("menuPath not in", values, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathBetween(String value1, String value2) {
            addCriterion("menuPath between", value1, value2, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotBetween(String value1, String value2) {
            addCriterion("menuPath not between", value1, value2, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenuimageIsNull() {
            addCriterion("menuImage is null");
            return (Criteria) this;
        }

        public Criteria andMenuimageIsNotNull() {
            addCriterion("menuImage is not null");
            return (Criteria) this;
        }

        public Criteria andMenuimageEqualTo(String value) {
            addCriterion("menuImage =", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotEqualTo(String value) {
            addCriterion("menuImage <>", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageGreaterThan(String value) {
            addCriterion("menuImage >", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageGreaterThanOrEqualTo(String value) {
            addCriterion("menuImage >=", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageLessThan(String value) {
            addCriterion("menuImage <", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageLessThanOrEqualTo(String value) {
            addCriterion("menuImage <=", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageLike(String value) {
            addCriterion("menuImage like", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotLike(String value) {
            addCriterion("menuImage not like", value, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageIn(List<String> values) {
            addCriterion("menuImage in", values, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotIn(List<String> values) {
            addCriterion("menuImage not in", values, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageBetween(String value1, String value2) {
            addCriterion("menuImage between", value1, value2, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenuimageNotBetween(String value1, String value2) {
            addCriterion("menuImage not between", value1, value2, "menuimage");
            return (Criteria) this;
        }

        public Criteria andMenulvlIsNull() {
            addCriterion("menuLvl is null");
            return (Criteria) this;
        }

        public Criteria andMenulvlIsNotNull() {
            addCriterion("menuLvl is not null");
            return (Criteria) this;
        }

        public Criteria andMenulvlEqualTo(Integer value) {
            addCriterion("menuLvl =", value, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlNotEqualTo(Integer value) {
            addCriterion("menuLvl <>", value, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlGreaterThan(Integer value) {
            addCriterion("menuLvl >", value, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuLvl >=", value, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlLessThan(Integer value) {
            addCriterion("menuLvl <", value, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlLessThanOrEqualTo(Integer value) {
            addCriterion("menuLvl <=", value, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlIn(List<Integer> values) {
            addCriterion("menuLvl in", values, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlNotIn(List<Integer> values) {
            addCriterion("menuLvl not in", values, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlBetween(Integer value1, Integer value2) {
            addCriterion("menuLvl between", value1, value2, "menulvl");
            return (Criteria) this;
        }

        public Criteria andMenulvlNotBetween(Integer value1, Integer value2) {
            addCriterion("menuLvl not between", value1, value2, "menulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenuidIsNull() {
            addCriterion("parentMenuId is null");
            return (Criteria) this;
        }

        public Criteria andParentmenuidIsNotNull() {
            addCriterion("parentMenuId is not null");
            return (Criteria) this;
        }

        public Criteria andParentmenuidEqualTo(Integer value) {
            addCriterion("parentMenuId =", value, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidNotEqualTo(Integer value) {
            addCriterion("parentMenuId <>", value, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidGreaterThan(Integer value) {
            addCriterion("parentMenuId >", value, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentMenuId >=", value, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidLessThan(Integer value) {
            addCriterion("parentMenuId <", value, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidLessThanOrEqualTo(Integer value) {
            addCriterion("parentMenuId <=", value, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidIn(List<Integer> values) {
            addCriterion("parentMenuId in", values, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidNotIn(List<Integer> values) {
            addCriterion("parentMenuId not in", values, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidBetween(Integer value1, Integer value2) {
            addCriterion("parentMenuId between", value1, value2, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andParentmenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentMenuId not between", value1, value2, "parentmenuid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("createUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(Integer value) {
            addCriterion("createUserId =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(Integer value) {
            addCriterion("createUserId <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(Integer value) {
            addCriterion("createUserId >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createUserId >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(Integer value) {
            addCriterion("createUserId <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("createUserId <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<Integer> values) {
            addCriterion("createUserId in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<Integer> values) {
            addCriterion("createUserId not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(Integer value1, Integer value2) {
            addCriterion("createUserId between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("createUserId not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNull() {
            addCriterion("isDisPlay is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNotNull() {
            addCriterion("isDisPlay is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayEqualTo(Integer value) {
            addCriterion("isDisPlay =", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotEqualTo(Integer value) {
            addCriterion("isDisPlay <>", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThan(Integer value) {
            addCriterion("isDisPlay >", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDisPlay >=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThan(Integer value) {
            addCriterion("isDisPlay <", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThanOrEqualTo(Integer value) {
            addCriterion("isDisPlay <=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIn(List<Integer> values) {
            addCriterion("isDisPlay in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotIn(List<Integer> values) {
            addCriterion("isDisPlay not in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayBetween(Integer value1, Integer value2) {
            addCriterion("isDisPlay between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotBetween(Integer value1, Integer value2) {
            addCriterion("isDisPlay not between", value1, value2, "isdisplay");
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