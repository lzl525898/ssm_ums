package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class OfflineCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfflineCourseExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("cName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCtypeIdIsNull() {
            addCriterion("cType_id is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIdIsNotNull() {
            addCriterion("cType_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeIdEqualTo(Long value) {
            addCriterion("cType_id =", value, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdNotEqualTo(Long value) {
            addCriterion("cType_id <>", value, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdGreaterThan(Long value) {
            addCriterion("cType_id >", value, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cType_id >=", value, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdLessThan(Long value) {
            addCriterion("cType_id <", value, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdLessThanOrEqualTo(Long value) {
            addCriterion("cType_id <=", value, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdIn(List<Long> values) {
            addCriterion("cType_id in", values, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdNotIn(List<Long> values) {
            addCriterion("cType_id not in", values, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdBetween(Long value1, Long value2) {
            addCriterion("cType_id between", value1, value2, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtypeIdNotBetween(Long value1, Long value2) {
            addCriterion("cType_id not between", value1, value2, "ctypeId");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("cTime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("cTime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("cTime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("cTime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("cTime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("cTime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("cTime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("cTime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("cTime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("cTime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("cTime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("cTime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("cTime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("cTime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNull() {
            addCriterion("cPrice is null");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNotNull() {
            addCriterion("cPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceEqualTo(String value) {
            addCriterion("cPrice =", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotEqualTo(String value) {
            addCriterion("cPrice <>", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThan(String value) {
            addCriterion("cPrice >", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThanOrEqualTo(String value) {
            addCriterion("cPrice >=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThan(String value) {
            addCriterion("cPrice <", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThanOrEqualTo(String value) {
            addCriterion("cPrice <=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLike(String value) {
            addCriterion("cPrice like", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotLike(String value) {
            addCriterion("cPrice not like", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceIn(List<String> values) {
            addCriterion("cPrice in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotIn(List<String> values) {
            addCriterion("cPrice not in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceBetween(String value1, String value2) {
            addCriterion("cPrice between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotBetween(String value1, String value2) {
            addCriterion("cPrice not between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceafterIsNull() {
            addCriterion("cPriceAfter is null");
            return (Criteria) this;
        }

        public Criteria andCpriceafterIsNotNull() {
            addCriterion("cPriceAfter is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceafterEqualTo(String value) {
            addCriterion("cPriceAfter =", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterNotEqualTo(String value) {
            addCriterion("cPriceAfter <>", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterGreaterThan(String value) {
            addCriterion("cPriceAfter >", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterGreaterThanOrEqualTo(String value) {
            addCriterion("cPriceAfter >=", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterLessThan(String value) {
            addCriterion("cPriceAfter <", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterLessThanOrEqualTo(String value) {
            addCriterion("cPriceAfter <=", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterLike(String value) {
            addCriterion("cPriceAfter like", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterNotLike(String value) {
            addCriterion("cPriceAfter not like", value, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterIn(List<String> values) {
            addCriterion("cPriceAfter in", values, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterNotIn(List<String> values) {
            addCriterion("cPriceAfter not in", values, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterBetween(String value1, String value2) {
            addCriterion("cPriceAfter between", value1, value2, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpriceafterNotBetween(String value1, String value2) {
            addCriterion("cPriceAfter not between", value1, value2, "cpriceafter");
            return (Criteria) this;
        }

        public Criteria andCpicpathIsNull() {
            addCriterion("cPicPath is null");
            return (Criteria) this;
        }

        public Criteria andCpicpathIsNotNull() {
            addCriterion("cPicPath is not null");
            return (Criteria) this;
        }

        public Criteria andCpicpathEqualTo(String value) {
            addCriterion("cPicPath =", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathNotEqualTo(String value) {
            addCriterion("cPicPath <>", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathGreaterThan(String value) {
            addCriterion("cPicPath >", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathGreaterThanOrEqualTo(String value) {
            addCriterion("cPicPath >=", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathLessThan(String value) {
            addCriterion("cPicPath <", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathLessThanOrEqualTo(String value) {
            addCriterion("cPicPath <=", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathLike(String value) {
            addCriterion("cPicPath like", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathNotLike(String value) {
            addCriterion("cPicPath not like", value, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathIn(List<String> values) {
            addCriterion("cPicPath in", values, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathNotIn(List<String> values) {
            addCriterion("cPicPath not in", values, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathBetween(String value1, String value2) {
            addCriterion("cPicPath between", value1, value2, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCpicpathNotBetween(String value1, String value2) {
            addCriterion("cPicPath not between", value1, value2, "cpicpath");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNull() {
            addCriterion("cCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNotNull() {
            addCriterion("cCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeEqualTo(String value) {
            addCriterion("cCreateTime =", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotEqualTo(String value) {
            addCriterion("cCreateTime <>", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThan(String value) {
            addCriterion("cCreateTime >", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cCreateTime >=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThan(String value) {
            addCriterion("cCreateTime <", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("cCreateTime <=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLike(String value) {
            addCriterion("cCreateTime like", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotLike(String value) {
            addCriterion("cCreateTime not like", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIn(List<String> values) {
            addCriterion("cCreateTime in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotIn(List<String> values) {
            addCriterion("cCreateTime not in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeBetween(String value1, String value2) {
            addCriterion("cCreateTime between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotBetween(String value1, String value2) {
            addCriterion("cCreateTime not between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcityIsNull() {
            addCriterion("cCity is null");
            return (Criteria) this;
        }

        public Criteria andCcityIsNotNull() {
            addCriterion("cCity is not null");
            return (Criteria) this;
        }

        public Criteria andCcityEqualTo(String value) {
            addCriterion("cCity =", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityNotEqualTo(String value) {
            addCriterion("cCity <>", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityGreaterThan(String value) {
            addCriterion("cCity >", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityGreaterThanOrEqualTo(String value) {
            addCriterion("cCity >=", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityLessThan(String value) {
            addCriterion("cCity <", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityLessThanOrEqualTo(String value) {
            addCriterion("cCity <=", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityLike(String value) {
            addCriterion("cCity like", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityNotLike(String value) {
            addCriterion("cCity not like", value, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityIn(List<String> values) {
            addCriterion("cCity in", values, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityNotIn(List<String> values) {
            addCriterion("cCity not in", values, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityBetween(String value1, String value2) {
            addCriterion("cCity between", value1, value2, "ccity");
            return (Criteria) this;
        }

        public Criteria andCcityNotBetween(String value1, String value2) {
            addCriterion("cCity not between", value1, value2, "ccity");
            return (Criteria) this;
        }

        public Criteria andCintroIsNull() {
            addCriterion("cIntro is null");
            return (Criteria) this;
        }

        public Criteria andCintroIsNotNull() {
            addCriterion("cIntro is not null");
            return (Criteria) this;
        }

        public Criteria andCintroEqualTo(String value) {
            addCriterion("cIntro =", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroNotEqualTo(String value) {
            addCriterion("cIntro <>", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroGreaterThan(String value) {
            addCriterion("cIntro >", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroGreaterThanOrEqualTo(String value) {
            addCriterion("cIntro >=", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroLessThan(String value) {
            addCriterion("cIntro <", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroLessThanOrEqualTo(String value) {
            addCriterion("cIntro <=", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroLike(String value) {
            addCriterion("cIntro like", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroNotLike(String value) {
            addCriterion("cIntro not like", value, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroIn(List<String> values) {
            addCriterion("cIntro in", values, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroNotIn(List<String> values) {
            addCriterion("cIntro not in", values, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroBetween(String value1, String value2) {
            addCriterion("cIntro between", value1, value2, "cintro");
            return (Criteria) this;
        }

        public Criteria andCintroNotBetween(String value1, String value2) {
            addCriterion("cIntro not between", value1, value2, "cintro");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIsNull() {
            addCriterion("fitPeople is null");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIsNotNull() {
            addCriterion("fitPeople is not null");
            return (Criteria) this;
        }

        public Criteria andFitpeopleEqualTo(String value) {
            addCriterion("fitPeople =", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotEqualTo(String value) {
            addCriterion("fitPeople <>", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleGreaterThan(String value) {
            addCriterion("fitPeople >", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("fitPeople >=", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLessThan(String value) {
            addCriterion("fitPeople <", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLessThanOrEqualTo(String value) {
            addCriterion("fitPeople <=", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLike(String value) {
            addCriterion("fitPeople like", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotLike(String value) {
            addCriterion("fitPeople not like", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIn(List<String> values) {
            addCriterion("fitPeople in", values, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotIn(List<String> values) {
            addCriterion("fitPeople not in", values, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleBetween(String value1, String value2) {
            addCriterion("fitPeople between", value1, value2, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotBetween(String value1, String value2) {
            addCriterion("fitPeople not between", value1, value2, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cStatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(Integer value) {
            addCriterion("cStatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(Integer value) {
            addCriterion("cStatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(Integer value) {
            addCriterion("cStatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cStatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(Integer value) {
            addCriterion("cStatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(Integer value) {
            addCriterion("cStatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<Integer> values) {
            addCriterion("cStatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<Integer> values) {
            addCriterion("cStatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(Integer value1, Integer value2) {
            addCriterion("cStatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cStatus not between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andNexttimeIsNull() {
            addCriterion("nextTime is null");
            return (Criteria) this;
        }

        public Criteria andNexttimeIsNotNull() {
            addCriterion("nextTime is not null");
            return (Criteria) this;
        }

        public Criteria andNexttimeEqualTo(String value) {
            addCriterion("nextTime =", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotEqualTo(String value) {
            addCriterion("nextTime <>", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeGreaterThan(String value) {
            addCriterion("nextTime >", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeGreaterThanOrEqualTo(String value) {
            addCriterion("nextTime >=", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLessThan(String value) {
            addCriterion("nextTime <", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLessThanOrEqualTo(String value) {
            addCriterion("nextTime <=", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLike(String value) {
            addCriterion("nextTime like", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotLike(String value) {
            addCriterion("nextTime not like", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeIn(List<String> values) {
            addCriterion("nextTime in", values, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotIn(List<String> values) {
            addCriterion("nextTime not in", values, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeBetween(String value1, String value2) {
            addCriterion("nextTime between", value1, value2, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotBetween(String value1, String value2) {
            addCriterion("nextTime not between", value1, value2, "nexttime");
            return (Criteria) this;
        }

        public Criteria andClassplaceIsNull() {
            addCriterion("classPlace is null");
            return (Criteria) this;
        }

        public Criteria andClassplaceIsNotNull() {
            addCriterion("classPlace is not null");
            return (Criteria) this;
        }

        public Criteria andClassplaceEqualTo(String value) {
            addCriterion("classPlace =", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceNotEqualTo(String value) {
            addCriterion("classPlace <>", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceGreaterThan(String value) {
            addCriterion("classPlace >", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceGreaterThanOrEqualTo(String value) {
            addCriterion("classPlace >=", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceLessThan(String value) {
            addCriterion("classPlace <", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceLessThanOrEqualTo(String value) {
            addCriterion("classPlace <=", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceLike(String value) {
            addCriterion("classPlace like", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceNotLike(String value) {
            addCriterion("classPlace not like", value, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceIn(List<String> values) {
            addCriterion("classPlace in", values, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceNotIn(List<String> values) {
            addCriterion("classPlace not in", values, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceBetween(String value1, String value2) {
            addCriterion("classPlace between", value1, value2, "classplace");
            return (Criteria) this;
        }

        public Criteria andClassplaceNotBetween(String value1, String value2) {
            addCriterion("classPlace not between", value1, value2, "classplace");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Integer value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Integer value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Integer value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Integer value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Integer value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Integer> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Integer> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Integer value1, Integer value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursIsNull() {
            addCriterion("learnHours is null");
            return (Criteria) this;
        }

        public Criteria andLearnhoursIsNotNull() {
            addCriterion("learnHours is not null");
            return (Criteria) this;
        }

        public Criteria andLearnhoursEqualTo(Integer value) {
            addCriterion("learnHours =", value, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursNotEqualTo(Integer value) {
            addCriterion("learnHours <>", value, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursGreaterThan(Integer value) {
            addCriterion("learnHours >", value, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnHours >=", value, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursLessThan(Integer value) {
            addCriterion("learnHours <", value, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursLessThanOrEqualTo(Integer value) {
            addCriterion("learnHours <=", value, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursIn(List<Integer> values) {
            addCriterion("learnHours in", values, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursNotIn(List<Integer> values) {
            addCriterion("learnHours not in", values, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursBetween(Integer value1, Integer value2) {
            addCriterion("learnHours between", value1, value2, "learnhours");
            return (Criteria) this;
        }

        public Criteria andLearnhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("learnHours not between", value1, value2, "learnhours");
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