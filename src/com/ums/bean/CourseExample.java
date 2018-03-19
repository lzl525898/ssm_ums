package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCtypeIsNull() {
            addCriterion("cType is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("cType is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(Long value) {
            addCriterion("cType =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(Long value) {
            addCriterion("cType <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(Long value) {
            addCriterion("cType >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(Long value) {
            addCriterion("cType >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(Long value) {
            addCriterion("cType <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(Long value) {
            addCriterion("cType <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<Long> values) {
            addCriterion("cType in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<Long> values) {
            addCriterion("cType not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(Long value1, Long value2) {
            addCriterion("cType between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(Long value1, Long value2) {
            addCriterion("cType not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCkeywordsIsNull() {
            addCriterion("cKeyWords is null");
            return (Criteria) this;
        }

        public Criteria andCkeywordsIsNotNull() {
            addCriterion("cKeyWords is not null");
            return (Criteria) this;
        }

        public Criteria andCkeywordsEqualTo(String value) {
            addCriterion("cKeyWords =", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsNotEqualTo(String value) {
            addCriterion("cKeyWords <>", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsGreaterThan(String value) {
            addCriterion("cKeyWords >", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("cKeyWords >=", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsLessThan(String value) {
            addCriterion("cKeyWords <", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsLessThanOrEqualTo(String value) {
            addCriterion("cKeyWords <=", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsLike(String value) {
            addCriterion("cKeyWords like", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsNotLike(String value) {
            addCriterion("cKeyWords not like", value, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsIn(List<String> values) {
            addCriterion("cKeyWords in", values, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsNotIn(List<String> values) {
            addCriterion("cKeyWords not in", values, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsBetween(String value1, String value2) {
            addCriterion("cKeyWords between", value1, value2, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andCkeywordsNotBetween(String value1, String value2) {
            addCriterion("cKeyWords not between", value1, value2, "ckeywords");
            return (Criteria) this;
        }

        public Criteria andClvlIsNull() {
            addCriterion("clvl is null");
            return (Criteria) this;
        }

        public Criteria andClvlIsNotNull() {
            addCriterion("clvl is not null");
            return (Criteria) this;
        }

        public Criteria andClvlEqualTo(Byte value) {
            addCriterion("clvl =", value, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlNotEqualTo(Byte value) {
            addCriterion("clvl <>", value, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlGreaterThan(Byte value) {
            addCriterion("clvl >", value, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlGreaterThanOrEqualTo(Byte value) {
            addCriterion("clvl >=", value, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlLessThan(Byte value) {
            addCriterion("clvl <", value, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlLessThanOrEqualTo(Byte value) {
            addCriterion("clvl <=", value, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlIn(List<Byte> values) {
            addCriterion("clvl in", values, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlNotIn(List<Byte> values) {
            addCriterion("clvl not in", values, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlBetween(Byte value1, Byte value2) {
            addCriterion("clvl between", value1, value2, "clvl");
            return (Criteria) this;
        }

        public Criteria andClvlNotBetween(Byte value1, Byte value2) {
            addCriterion("clvl not between", value1, value2, "clvl");
            return (Criteria) this;
        }

        public Criteria andCbegintimeIsNull() {
            addCriterion("cBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andCbegintimeIsNotNull() {
            addCriterion("cBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andCbegintimeEqualTo(String value) {
            addCriterion("cBeginTime =", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotEqualTo(String value) {
            addCriterion("cBeginTime <>", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeGreaterThan(String value) {
            addCriterion("cBeginTime >", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("cBeginTime >=", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeLessThan(String value) {
            addCriterion("cBeginTime <", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeLessThanOrEqualTo(String value) {
            addCriterion("cBeginTime <=", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeLike(String value) {
            addCriterion("cBeginTime like", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotLike(String value) {
            addCriterion("cBeginTime not like", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeIn(List<String> values) {
            addCriterion("cBeginTime in", values, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotIn(List<String> values) {
            addCriterion("cBeginTime not in", values, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeBetween(String value1, String value2) {
            addCriterion("cBeginTime between", value1, value2, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotBetween(String value1, String value2) {
            addCriterion("cBeginTime not between", value1, value2, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNull() {
            addCriterion("cEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNotNull() {
            addCriterion("cEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCendtimeEqualTo(String value) {
            addCriterion("cEndTime =", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotEqualTo(String value) {
            addCriterion("cEndTime <>", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThan(String value) {
            addCriterion("cEndTime >", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("cEndTime >=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThan(String value) {
            addCriterion("cEndTime <", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThanOrEqualTo(String value) {
            addCriterion("cEndTime <=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLike(String value) {
            addCriterion("cEndTime like", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotLike(String value) {
            addCriterion("cEndTime not like", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIn(List<String> values) {
            addCriterion("cEndTime in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotIn(List<String> values) {
            addCriterion("cEndTime not in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeBetween(String value1, String value2) {
            addCriterion("cEndTime between", value1, value2, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotBetween(String value1, String value2) {
            addCriterion("cEndTime not between", value1, value2, "cendtime");
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

        public Criteria andChourIsNull() {
            addCriterion("cHour is null");
            return (Criteria) this;
        }

        public Criteria andChourIsNotNull() {
            addCriterion("cHour is not null");
            return (Criteria) this;
        }

        public Criteria andChourEqualTo(Integer value) {
            addCriterion("cHour =", value, "chour");
            return (Criteria) this;
        }

        public Criteria andChourNotEqualTo(Integer value) {
            addCriterion("cHour <>", value, "chour");
            return (Criteria) this;
        }

        public Criteria andChourGreaterThan(Integer value) {
            addCriterion("cHour >", value, "chour");
            return (Criteria) this;
        }

        public Criteria andChourGreaterThanOrEqualTo(Integer value) {
            addCriterion("cHour >=", value, "chour");
            return (Criteria) this;
        }

        public Criteria andChourLessThan(Integer value) {
            addCriterion("cHour <", value, "chour");
            return (Criteria) this;
        }

        public Criteria andChourLessThanOrEqualTo(Integer value) {
            addCriterion("cHour <=", value, "chour");
            return (Criteria) this;
        }

        public Criteria andChourIn(List<Integer> values) {
            addCriterion("cHour in", values, "chour");
            return (Criteria) this;
        }

        public Criteria andChourNotIn(List<Integer> values) {
            addCriterion("cHour not in", values, "chour");
            return (Criteria) this;
        }

        public Criteria andChourBetween(Integer value1, Integer value2) {
            addCriterion("cHour between", value1, value2, "chour");
            return (Criteria) this;
        }

        public Criteria andChourNotBetween(Integer value1, Integer value2) {
            addCriterion("cHour not between", value1, value2, "chour");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathIsNull() {
            addCriterion("cVideoFilePath is null");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathIsNotNull() {
            addCriterion("cVideoFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathEqualTo(String value) {
            addCriterion("cVideoFilePath =", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathNotEqualTo(String value) {
            addCriterion("cVideoFilePath <>", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathGreaterThan(String value) {
            addCriterion("cVideoFilePath >", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathGreaterThanOrEqualTo(String value) {
            addCriterion("cVideoFilePath >=", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathLessThan(String value) {
            addCriterion("cVideoFilePath <", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathLessThanOrEqualTo(String value) {
            addCriterion("cVideoFilePath <=", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathLike(String value) {
            addCriterion("cVideoFilePath like", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathNotLike(String value) {
            addCriterion("cVideoFilePath not like", value, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathIn(List<String> values) {
            addCriterion("cVideoFilePath in", values, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathNotIn(List<String> values) {
            addCriterion("cVideoFilePath not in", values, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathBetween(String value1, String value2) {
            addCriterion("cVideoFilePath between", value1, value2, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCvideofilepathNotBetween(String value1, String value2) {
            addCriterion("cVideoFilePath not between", value1, value2, "cvideofilepath");
            return (Criteria) this;
        }

        public Criteria andCpictureIsNull() {
            addCriterion("cPicture is null");
            return (Criteria) this;
        }

        public Criteria andCpictureIsNotNull() {
            addCriterion("cPicture is not null");
            return (Criteria) this;
        }

        public Criteria andCpictureEqualTo(String value) {
            addCriterion("cPicture =", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotEqualTo(String value) {
            addCriterion("cPicture <>", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureGreaterThan(String value) {
            addCriterion("cPicture >", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureGreaterThanOrEqualTo(String value) {
            addCriterion("cPicture >=", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLessThan(String value) {
            addCriterion("cPicture <", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLessThanOrEqualTo(String value) {
            addCriterion("cPicture <=", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLike(String value) {
            addCriterion("cPicture like", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotLike(String value) {
            addCriterion("cPicture not like", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureIn(List<String> values) {
            addCriterion("cPicture in", values, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotIn(List<String> values) {
            addCriterion("cPicture not in", values, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureBetween(String value1, String value2) {
            addCriterion("cPicture between", value1, value2, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotBetween(String value1, String value2) {
            addCriterion("cPicture not between", value1, value2, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCdescIsNull() {
            addCriterion("cdesc is null");
            return (Criteria) this;
        }

        public Criteria andCdescIsNotNull() {
            addCriterion("cdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCdescEqualTo(String value) {
            addCriterion("cdesc =", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotEqualTo(String value) {
            addCriterion("cdesc <>", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescGreaterThan(String value) {
            addCriterion("cdesc >", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescGreaterThanOrEqualTo(String value) {
            addCriterion("cdesc >=", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLessThan(String value) {
            addCriterion("cdesc <", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLessThanOrEqualTo(String value) {
            addCriterion("cdesc <=", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLike(String value) {
            addCriterion("cdesc like", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotLike(String value) {
            addCriterion("cdesc not like", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescIn(List<String> values) {
            addCriterion("cdesc in", values, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotIn(List<String> values) {
            addCriterion("cdesc not in", values, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescBetween(String value1, String value2) {
            addCriterion("cdesc between", value1, value2, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotBetween(String value1, String value2) {
            addCriterion("cdesc not between", value1, value2, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCuseridIsNull() {
            addCriterion("cUserId is null");
            return (Criteria) this;
        }

        public Criteria andCuseridIsNotNull() {
            addCriterion("cUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCuseridEqualTo(Long value) {
            addCriterion("cUserId =", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotEqualTo(Long value) {
            addCriterion("cUserId <>", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridGreaterThan(Long value) {
            addCriterion("cUserId >", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("cUserId >=", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLessThan(Long value) {
            addCriterion("cUserId <", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLessThanOrEqualTo(Long value) {
            addCriterion("cUserId <=", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridIn(List<Long> values) {
            addCriterion("cUserId in", values, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotIn(List<Long> values) {
            addCriterion("cUserId not in", values, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridBetween(Long value1, Long value2) {
            addCriterion("cUserId between", value1, value2, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotBetween(Long value1, Long value2) {
            addCriterion("cUserId not between", value1, value2, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCteachnameIsNull() {
            addCriterion("cTeachName is null");
            return (Criteria) this;
        }

        public Criteria andCteachnameIsNotNull() {
            addCriterion("cTeachName is not null");
            return (Criteria) this;
        }

        public Criteria andCteachnameEqualTo(String value) {
            addCriterion("cTeachName =", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameNotEqualTo(String value) {
            addCriterion("cTeachName <>", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameGreaterThan(String value) {
            addCriterion("cTeachName >", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameGreaterThanOrEqualTo(String value) {
            addCriterion("cTeachName >=", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameLessThan(String value) {
            addCriterion("cTeachName <", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameLessThanOrEqualTo(String value) {
            addCriterion("cTeachName <=", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameLike(String value) {
            addCriterion("cTeachName like", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameNotLike(String value) {
            addCriterion("cTeachName not like", value, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameIn(List<String> values) {
            addCriterion("cTeachName in", values, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameNotIn(List<String> values) {
            addCriterion("cTeachName not in", values, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameBetween(String value1, String value2) {
            addCriterion("cTeachName between", value1, value2, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCteachnameNotBetween(String value1, String value2) {
            addCriterion("cTeachName not between", value1, value2, "cteachname");
            return (Criteria) this;
        }

        public Criteria andCflagIsNull() {
            addCriterion("cFlag is null");
            return (Criteria) this;
        }

        public Criteria andCflagIsNotNull() {
            addCriterion("cFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCflagEqualTo(Byte value) {
            addCriterion("cFlag =", value, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagNotEqualTo(Byte value) {
            addCriterion("cFlag <>", value, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagGreaterThan(Byte value) {
            addCriterion("cFlag >", value, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("cFlag >=", value, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagLessThan(Byte value) {
            addCriterion("cFlag <", value, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagLessThanOrEqualTo(Byte value) {
            addCriterion("cFlag <=", value, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagIn(List<Byte> values) {
            addCriterion("cFlag in", values, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagNotIn(List<Byte> values) {
            addCriterion("cFlag not in", values, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagBetween(Byte value1, Byte value2) {
            addCriterion("cFlag between", value1, value2, "cflag");
            return (Criteria) this;
        }

        public Criteria andCflagNotBetween(Byte value1, Byte value2) {
            addCriterion("cFlag not between", value1, value2, "cflag");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberIsNull() {
            addCriterion("cCourseNumber is null");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberIsNotNull() {
            addCriterion("cCourseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberEqualTo(Integer value) {
            addCriterion("cCourseNumber =", value, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberNotEqualTo(Integer value) {
            addCriterion("cCourseNumber <>", value, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberGreaterThan(Integer value) {
            addCriterion("cCourseNumber >", value, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cCourseNumber >=", value, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberLessThan(Integer value) {
            addCriterion("cCourseNumber <", value, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberLessThanOrEqualTo(Integer value) {
            addCriterion("cCourseNumber <=", value, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberIn(List<Integer> values) {
            addCriterion("cCourseNumber in", values, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberNotIn(List<Integer> values) {
            addCriterion("cCourseNumber not in", values, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberBetween(Integer value1, Integer value2) {
            addCriterion("cCourseNumber between", value1, value2, "ccoursenumber");
            return (Criteria) this;
        }

        public Criteria andCcoursenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cCourseNumber not between", value1, value2, "ccoursenumber");
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

        public Criteria andCstatusEqualTo(Byte value) {
            addCriterion("cStatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(Byte value) {
            addCriterion("cStatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(Byte value) {
            addCriterion("cStatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cStatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(Byte value) {
            addCriterion("cStatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(Byte value) {
            addCriterion("cStatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<Byte> values) {
            addCriterion("cStatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<Byte> values) {
            addCriterion("cStatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(Byte value1, Byte value2) {
            addCriterion("cStatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cStatus not between", value1, value2, "cstatus");
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

        public Criteria andCprefpriceIsNull() {
            addCriterion("cPrefPrice is null");
            return (Criteria) this;
        }

        public Criteria andCprefpriceIsNotNull() {
            addCriterion("cPrefPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCprefpriceEqualTo(String value) {
            addCriterion("cPrefPrice =", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceNotEqualTo(String value) {
            addCriterion("cPrefPrice <>", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceGreaterThan(String value) {
            addCriterion("cPrefPrice >", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceGreaterThanOrEqualTo(String value) {
            addCriterion("cPrefPrice >=", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceLessThan(String value) {
            addCriterion("cPrefPrice <", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceLessThanOrEqualTo(String value) {
            addCriterion("cPrefPrice <=", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceLike(String value) {
            addCriterion("cPrefPrice like", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceNotLike(String value) {
            addCriterion("cPrefPrice not like", value, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceIn(List<String> values) {
            addCriterion("cPrefPrice in", values, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceNotIn(List<String> values) {
            addCriterion("cPrefPrice not in", values, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceBetween(String value1, String value2) {
            addCriterion("cPrefPrice between", value1, value2, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCprefpriceNotBetween(String value1, String value2) {
            addCriterion("cPrefPrice not between", value1, value2, "cprefprice");
            return (Criteria) this;
        }

        public Criteria andCrecommendIsNull() {
            addCriterion("cRecommend is null");
            return (Criteria) this;
        }

        public Criteria andCrecommendIsNotNull() {
            addCriterion("cRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andCrecommendEqualTo(Byte value) {
            addCriterion("cRecommend =", value, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendNotEqualTo(Byte value) {
            addCriterion("cRecommend <>", value, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendGreaterThan(Byte value) {
            addCriterion("cRecommend >", value, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("cRecommend >=", value, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendLessThan(Byte value) {
            addCriterion("cRecommend <", value, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendLessThanOrEqualTo(Byte value) {
            addCriterion("cRecommend <=", value, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendIn(List<Byte> values) {
            addCriterion("cRecommend in", values, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendNotIn(List<Byte> values) {
            addCriterion("cRecommend not in", values, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendBetween(Byte value1, Byte value2) {
            addCriterion("cRecommend between", value1, value2, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCrecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("cRecommend not between", value1, value2, "crecommend");
            return (Criteria) this;
        }

        public Criteria andCourseisshowIsNull() {
            addCriterion("courseIsShow is null");
            return (Criteria) this;
        }

        public Criteria andCourseisshowIsNotNull() {
            addCriterion("courseIsShow is not null");
            return (Criteria) this;
        }

        public Criteria andCourseisshowEqualTo(Byte value) {
            addCriterion("courseIsShow =", value, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowNotEqualTo(Byte value) {
            addCriterion("courseIsShow <>", value, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowGreaterThan(Byte value) {
            addCriterion("courseIsShow >", value, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("courseIsShow >=", value, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowLessThan(Byte value) {
            addCriterion("courseIsShow <", value, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowLessThanOrEqualTo(Byte value) {
            addCriterion("courseIsShow <=", value, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowIn(List<Byte> values) {
            addCriterion("courseIsShow in", values, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowNotIn(List<Byte> values) {
            addCriterion("courseIsShow not in", values, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowBetween(Byte value1, Byte value2) {
            addCriterion("courseIsShow between", value1, value2, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCourseisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("courseIsShow not between", value1, value2, "courseisshow");
            return (Criteria) this;
        }

        public Criteria andCisdisplayIsNull() {
            addCriterion("cIsDisplay is null");
            return (Criteria) this;
        }

        public Criteria andCisdisplayIsNotNull() {
            addCriterion("cIsDisplay is not null");
            return (Criteria) this;
        }

        public Criteria andCisdisplayEqualTo(Byte value) {
            addCriterion("cIsDisplay =", value, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayNotEqualTo(Byte value) {
            addCriterion("cIsDisplay <>", value, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayGreaterThan(Byte value) {
            addCriterion("cIsDisplay >", value, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayGreaterThanOrEqualTo(Byte value) {
            addCriterion("cIsDisplay >=", value, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayLessThan(Byte value) {
            addCriterion("cIsDisplay <", value, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayLessThanOrEqualTo(Byte value) {
            addCriterion("cIsDisplay <=", value, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayIn(List<Byte> values) {
            addCriterion("cIsDisplay in", values, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayNotIn(List<Byte> values) {
            addCriterion("cIsDisplay not in", values, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayBetween(Byte value1, Byte value2) {
            addCriterion("cIsDisplay between", value1, value2, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCisdisplayNotBetween(Byte value1, Byte value2) {
            addCriterion("cIsDisplay not between", value1, value2, "cisdisplay");
            return (Criteria) this;
        }

        public Criteria andCscnumbersIsNull() {
            addCriterion("cScnumbers is null");
            return (Criteria) this;
        }

        public Criteria andCscnumbersIsNotNull() {
            addCriterion("cScnumbers is not null");
            return (Criteria) this;
        }

        public Criteria andCscnumbersEqualTo(Integer value) {
            addCriterion("cScnumbers =", value, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersNotEqualTo(Integer value) {
            addCriterion("cScnumbers <>", value, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersGreaterThan(Integer value) {
            addCriterion("cScnumbers >", value, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("cScnumbers >=", value, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersLessThan(Integer value) {
            addCriterion("cScnumbers <", value, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersLessThanOrEqualTo(Integer value) {
            addCriterion("cScnumbers <=", value, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersIn(List<Integer> values) {
            addCriterion("cScnumbers in", values, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersNotIn(List<Integer> values) {
            addCriterion("cScnumbers not in", values, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersBetween(Integer value1, Integer value2) {
            addCriterion("cScnumbers between", value1, value2, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andCscnumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("cScnumbers not between", value1, value2, "cscnumbers");
            return (Criteria) this;
        }

        public Criteria andClistidIsNull() {
            addCriterion("cListId is null");
            return (Criteria) this;
        }

        public Criteria andClistidIsNotNull() {
            addCriterion("cListId is not null");
            return (Criteria) this;
        }

        public Criteria andClistidEqualTo(Long value) {
            addCriterion("cListId =", value, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidNotEqualTo(Long value) {
            addCriterion("cListId <>", value, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidGreaterThan(Long value) {
            addCriterion("cListId >", value, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidGreaterThanOrEqualTo(Long value) {
            addCriterion("cListId >=", value, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidLessThan(Long value) {
            addCriterion("cListId <", value, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidLessThanOrEqualTo(Long value) {
            addCriterion("cListId <=", value, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidIn(List<Long> values) {
            addCriterion("cListId in", values, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidNotIn(List<Long> values) {
            addCriterion("cListId not in", values, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidBetween(Long value1, Long value2) {
            addCriterion("cListId between", value1, value2, "clistid");
            return (Criteria) this;
        }

        public Criteria andClistidNotBetween(Long value1, Long value2) {
            addCriterion("cListId not between", value1, value2, "clistid");
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

        public Criteria andCmodifytimeIsNull() {
            addCriterion("cModifytime is null");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeIsNotNull() {
            addCriterion("cModifytime is not null");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeEqualTo(String value) {
            addCriterion("cModifytime =", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeNotEqualTo(String value) {
            addCriterion("cModifytime <>", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeGreaterThan(String value) {
            addCriterion("cModifytime >", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("cModifytime >=", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeLessThan(String value) {
            addCriterion("cModifytime <", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeLessThanOrEqualTo(String value) {
            addCriterion("cModifytime <=", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeLike(String value) {
            addCriterion("cModifytime like", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeNotLike(String value) {
            addCriterion("cModifytime not like", value, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeIn(List<String> values) {
            addCriterion("cModifytime in", values, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeNotIn(List<String> values) {
            addCriterion("cModifytime not in", values, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeBetween(String value1, String value2) {
            addCriterion("cModifytime between", value1, value2, "cmodifytime");
            return (Criteria) this;
        }

        public Criteria andCmodifytimeNotBetween(String value1, String value2) {
            addCriterion("cModifytime not between", value1, value2, "cmodifytime");
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

        public Criteria andConlymapIsNull() {
            addCriterion("cOnlyMap is null");
            return (Criteria) this;
        }

        public Criteria andConlymapIsNotNull() {
            addCriterion("cOnlyMap is not null");
            return (Criteria) this;
        }

        public Criteria andConlymapEqualTo(String value) {
            addCriterion("cOnlyMap =", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapNotEqualTo(String value) {
            addCriterion("cOnlyMap <>", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapGreaterThan(String value) {
            addCriterion("cOnlyMap >", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapGreaterThanOrEqualTo(String value) {
            addCriterion("cOnlyMap >=", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapLessThan(String value) {
            addCriterion("cOnlyMap <", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapLessThanOrEqualTo(String value) {
            addCriterion("cOnlyMap <=", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapLike(String value) {
            addCriterion("cOnlyMap like", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapNotLike(String value) {
            addCriterion("cOnlyMap not like", value, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapIn(List<String> values) {
            addCriterion("cOnlyMap in", values, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapNotIn(List<String> values) {
            addCriterion("cOnlyMap not in", values, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapBetween(String value1, String value2) {
            addCriterion("cOnlyMap between", value1, value2, "conlymap");
            return (Criteria) this;
        }

        public Criteria andConlymapNotBetween(String value1, String value2) {
            addCriterion("cOnlyMap not between", value1, value2, "conlymap");
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