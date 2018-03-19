package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class WorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExample() {
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

        public Criteria andWorkidIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Long value) {
            addCriterion("workId =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Long value) {
            addCriterion("workId <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Long value) {
            addCriterion("workId >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Long value) {
            addCriterion("workId >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Long value) {
            addCriterion("workId <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Long value) {
            addCriterion("workId <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Long> values) {
            addCriterion("workId in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Long> values) {
            addCriterion("workId not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Long value1, Long value2) {
            addCriterion("workId between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Long value1, Long value2) {
            addCriterion("workId not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidIsNull() {
            addCriterion("workTypeAboutId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidIsNotNull() {
            addCriterion("workTypeAboutId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidEqualTo(Long value) {
            addCriterion("workTypeAboutId =", value, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidNotEqualTo(Long value) {
            addCriterion("workTypeAboutId <>", value, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidGreaterThan(Long value) {
            addCriterion("workTypeAboutId >", value, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeAboutId >=", value, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidLessThan(Long value) {
            addCriterion("workTypeAboutId <", value, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidLessThanOrEqualTo(Long value) {
            addCriterion("workTypeAboutId <=", value, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidIn(List<Long> values) {
            addCriterion("workTypeAboutId in", values, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidNotIn(List<Long> values) {
            addCriterion("workTypeAboutId not in", values, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidBetween(Long value1, Long value2) {
            addCriterion("workTypeAboutId between", value1, value2, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorktypeaboutidNotBetween(Long value1, Long value2) {
            addCriterion("workTypeAboutId not between", value1, value2, "worktypeaboutid");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNull() {
            addCriterion("workName is null");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNotNull() {
            addCriterion("workName is not null");
            return (Criteria) this;
        }

        public Criteria andWorknameEqualTo(String value) {
            addCriterion("workName =", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotEqualTo(String value) {
            addCriterion("workName <>", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThan(String value) {
            addCriterion("workName >", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("workName >=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThan(String value) {
            addCriterion("workName <", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThanOrEqualTo(String value) {
            addCriterion("workName <=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLike(String value) {
            addCriterion("workName like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotLike(String value) {
            addCriterion("workName not like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameIn(List<String> values) {
            addCriterion("workName in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotIn(List<String> values) {
            addCriterion("workName not in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameBetween(String value1, String value2) {
            addCriterion("workName between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotBetween(String value1, String value2) {
            addCriterion("workName not between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathIsNull() {
            addCriterion("workFilePath is null");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathIsNotNull() {
            addCriterion("workFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathEqualTo(String value) {
            addCriterion("workFilePath =", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathNotEqualTo(String value) {
            addCriterion("workFilePath <>", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathGreaterThan(String value) {
            addCriterion("workFilePath >", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("workFilePath >=", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathLessThan(String value) {
            addCriterion("workFilePath <", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathLessThanOrEqualTo(String value) {
            addCriterion("workFilePath <=", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathLike(String value) {
            addCriterion("workFilePath like", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathNotLike(String value) {
            addCriterion("workFilePath not like", value, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathIn(List<String> values) {
            addCriterion("workFilePath in", values, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathNotIn(List<String> values) {
            addCriterion("workFilePath not in", values, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathBetween(String value1, String value2) {
            addCriterion("workFilePath between", value1, value2, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkfilepathNotBetween(String value1, String value2) {
            addCriterion("workFilePath not between", value1, value2, "workfilepath");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1IsNull() {
            addCriterion("workPicture1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1IsNotNull() {
            addCriterion("workPicture1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1EqualTo(String value) {
            addCriterion("workPicture1 =", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1NotEqualTo(String value) {
            addCriterion("workPicture1 <>", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1GreaterThan(String value) {
            addCriterion("workPicture1 >", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1GreaterThanOrEqualTo(String value) {
            addCriterion("workPicture1 >=", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1LessThan(String value) {
            addCriterion("workPicture1 <", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1LessThanOrEqualTo(String value) {
            addCriterion("workPicture1 <=", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1Like(String value) {
            addCriterion("workPicture1 like", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1NotLike(String value) {
            addCriterion("workPicture1 not like", value, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1In(List<String> values) {
            addCriterion("workPicture1 in", values, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1NotIn(List<String> values) {
            addCriterion("workPicture1 not in", values, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1Between(String value1, String value2) {
            addCriterion("workPicture1 between", value1, value2, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture1NotBetween(String value1, String value2) {
            addCriterion("workPicture1 not between", value1, value2, "workpicture1");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2IsNull() {
            addCriterion("workPicture2 is null");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2IsNotNull() {
            addCriterion("workPicture2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2EqualTo(String value) {
            addCriterion("workPicture2 =", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2NotEqualTo(String value) {
            addCriterion("workPicture2 <>", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2GreaterThan(String value) {
            addCriterion("workPicture2 >", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2GreaterThanOrEqualTo(String value) {
            addCriterion("workPicture2 >=", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2LessThan(String value) {
            addCriterion("workPicture2 <", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2LessThanOrEqualTo(String value) {
            addCriterion("workPicture2 <=", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2Like(String value) {
            addCriterion("workPicture2 like", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2NotLike(String value) {
            addCriterion("workPicture2 not like", value, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2In(List<String> values) {
            addCriterion("workPicture2 in", values, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2NotIn(List<String> values) {
            addCriterion("workPicture2 not in", values, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2Between(String value1, String value2) {
            addCriterion("workPicture2 between", value1, value2, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture2NotBetween(String value1, String value2) {
            addCriterion("workPicture2 not between", value1, value2, "workpicture2");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3IsNull() {
            addCriterion("workPicture3 is null");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3IsNotNull() {
            addCriterion("workPicture3 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3EqualTo(String value) {
            addCriterion("workPicture3 =", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3NotEqualTo(String value) {
            addCriterion("workPicture3 <>", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3GreaterThan(String value) {
            addCriterion("workPicture3 >", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3GreaterThanOrEqualTo(String value) {
            addCriterion("workPicture3 >=", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3LessThan(String value) {
            addCriterion("workPicture3 <", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3LessThanOrEqualTo(String value) {
            addCriterion("workPicture3 <=", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3Like(String value) {
            addCriterion("workPicture3 like", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3NotLike(String value) {
            addCriterion("workPicture3 not like", value, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3In(List<String> values) {
            addCriterion("workPicture3 in", values, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3NotIn(List<String> values) {
            addCriterion("workPicture3 not in", values, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3Between(String value1, String value2) {
            addCriterion("workPicture3 between", value1, value2, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkpicture3NotBetween(String value1, String value2) {
            addCriterion("workPicture3 not between", value1, value2, "workpicture3");
            return (Criteria) this;
        }

        public Criteria andWorkauthorIsNull() {
            addCriterion("workAuthor is null");
            return (Criteria) this;
        }

        public Criteria andWorkauthorIsNotNull() {
            addCriterion("workAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andWorkauthorEqualTo(String value) {
            addCriterion("workAuthor =", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorNotEqualTo(String value) {
            addCriterion("workAuthor <>", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorGreaterThan(String value) {
            addCriterion("workAuthor >", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorGreaterThanOrEqualTo(String value) {
            addCriterion("workAuthor >=", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorLessThan(String value) {
            addCriterion("workAuthor <", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorLessThanOrEqualTo(String value) {
            addCriterion("workAuthor <=", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorLike(String value) {
            addCriterion("workAuthor like", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorNotLike(String value) {
            addCriterion("workAuthor not like", value, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorIn(List<String> values) {
            addCriterion("workAuthor in", values, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorNotIn(List<String> values) {
            addCriterion("workAuthor not in", values, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorBetween(String value1, String value2) {
            addCriterion("workAuthor between", value1, value2, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkauthorNotBetween(String value1, String value2) {
            addCriterion("workAuthor not between", value1, value2, "workauthor");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridIsNull() {
            addCriterion("workCreateUserId is null");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridIsNotNull() {
            addCriterion("workCreateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridEqualTo(Long value) {
            addCriterion("workCreateUserId =", value, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridNotEqualTo(Long value) {
            addCriterion("workCreateUserId <>", value, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridGreaterThan(Long value) {
            addCriterion("workCreateUserId >", value, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("workCreateUserId >=", value, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridLessThan(Long value) {
            addCriterion("workCreateUserId <", value, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridLessThanOrEqualTo(Long value) {
            addCriterion("workCreateUserId <=", value, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridIn(List<Long> values) {
            addCriterion("workCreateUserId in", values, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridNotIn(List<Long> values) {
            addCriterion("workCreateUserId not in", values, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridBetween(Long value1, Long value2) {
            addCriterion("workCreateUserId between", value1, value2, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreateuseridNotBetween(Long value1, Long value2) {
            addCriterion("workCreateUserId not between", value1, value2, "workcreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeIsNull() {
            addCriterion("workCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeIsNotNull() {
            addCriterion("workCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeEqualTo(String value) {
            addCriterion("workCreateTime =", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeNotEqualTo(String value) {
            addCriterion("workCreateTime <>", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeGreaterThan(String value) {
            addCriterion("workCreateTime >", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("workCreateTime >=", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeLessThan(String value) {
            addCriterion("workCreateTime <", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("workCreateTime <=", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeLike(String value) {
            addCriterion("workCreateTime like", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeNotLike(String value) {
            addCriterion("workCreateTime not like", value, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeIn(List<String> values) {
            addCriterion("workCreateTime in", values, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeNotIn(List<String> values) {
            addCriterion("workCreateTime not in", values, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeBetween(String value1, String value2) {
            addCriterion("workCreateTime between", value1, value2, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkcreatetimeNotBetween(String value1, String value2) {
            addCriterion("workCreateTime not between", value1, value2, "workcreatetime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeIsNull() {
            addCriterion("workModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeIsNotNull() {
            addCriterion("workModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeEqualTo(String value) {
            addCriterion("workModifyTime =", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeNotEqualTo(String value) {
            addCriterion("workModifyTime <>", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeGreaterThan(String value) {
            addCriterion("workModifyTime >", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("workModifyTime >=", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeLessThan(String value) {
            addCriterion("workModifyTime <", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeLessThanOrEqualTo(String value) {
            addCriterion("workModifyTime <=", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeLike(String value) {
            addCriterion("workModifyTime like", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeNotLike(String value) {
            addCriterion("workModifyTime not like", value, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeIn(List<String> values) {
            addCriterion("workModifyTime in", values, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeNotIn(List<String> values) {
            addCriterion("workModifyTime not in", values, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeBetween(String value1, String value2) {
            addCriterion("workModifyTime between", value1, value2, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkmodifytimeNotBetween(String value1, String value2) {
            addCriterion("workModifyTime not between", value1, value2, "workmodifytime");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberIsNull() {
            addCriterion("workBrowseNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberIsNotNull() {
            addCriterion("workBrowseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberEqualTo(Integer value) {
            addCriterion("workBrowseNumber =", value, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberNotEqualTo(Integer value) {
            addCriterion("workBrowseNumber <>", value, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberGreaterThan(Integer value) {
            addCriterion("workBrowseNumber >", value, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workBrowseNumber >=", value, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberLessThan(Integer value) {
            addCriterion("workBrowseNumber <", value, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberLessThanOrEqualTo(Integer value) {
            addCriterion("workBrowseNumber <=", value, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberIn(List<Integer> values) {
            addCriterion("workBrowseNumber in", values, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberNotIn(List<Integer> values) {
            addCriterion("workBrowseNumber not in", values, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberBetween(Integer value1, Integer value2) {
            addCriterion("workBrowseNumber between", value1, value2, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkbrowsenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workBrowseNumber not between", value1, value2, "workbrowsenumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberIsNull() {
            addCriterion("workCommentsNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberIsNotNull() {
            addCriterion("workCommentsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberEqualTo(Integer value) {
            addCriterion("workCommentsNumber =", value, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberNotEqualTo(Integer value) {
            addCriterion("workCommentsNumber <>", value, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberGreaterThan(Integer value) {
            addCriterion("workCommentsNumber >", value, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workCommentsNumber >=", value, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberLessThan(Integer value) {
            addCriterion("workCommentsNumber <", value, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("workCommentsNumber <=", value, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberIn(List<Integer> values) {
            addCriterion("workCommentsNumber in", values, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberNotIn(List<Integer> values) {
            addCriterion("workCommentsNumber not in", values, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberBetween(Integer value1, Integer value2) {
            addCriterion("workCommentsNumber between", value1, value2, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorkcommentsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workCommentsNumber not between", value1, value2, "workcommentsnumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberIsNull() {
            addCriterion("workShareNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberIsNotNull() {
            addCriterion("workShareNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberEqualTo(Integer value) {
            addCriterion("workShareNumber =", value, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberNotEqualTo(Integer value) {
            addCriterion("workShareNumber <>", value, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberGreaterThan(Integer value) {
            addCriterion("workShareNumber >", value, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workShareNumber >=", value, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberLessThan(Integer value) {
            addCriterion("workShareNumber <", value, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberLessThanOrEqualTo(Integer value) {
            addCriterion("workShareNumber <=", value, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberIn(List<Integer> values) {
            addCriterion("workShareNumber in", values, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberNotIn(List<Integer> values) {
            addCriterion("workShareNumber not in", values, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberBetween(Integer value1, Integer value2) {
            addCriterion("workShareNumber between", value1, value2, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorksharenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workShareNumber not between", value1, value2, "worksharenumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberIsNull() {
            addCriterion("workThumpNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberIsNotNull() {
            addCriterion("workThumpNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberEqualTo(Integer value) {
            addCriterion("workThumpNumber =", value, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberNotEqualTo(Integer value) {
            addCriterion("workThumpNumber <>", value, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberGreaterThan(Integer value) {
            addCriterion("workThumpNumber >", value, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workThumpNumber >=", value, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberLessThan(Integer value) {
            addCriterion("workThumpNumber <", value, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberLessThanOrEqualTo(Integer value) {
            addCriterion("workThumpNumber <=", value, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberIn(List<Integer> values) {
            addCriterion("workThumpNumber in", values, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberNotIn(List<Integer> values) {
            addCriterion("workThumpNumber not in", values, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberBetween(Integer value1, Integer value2) {
            addCriterion("workThumpNumber between", value1, value2, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkthumpnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workThumpNumber not between", value1, value2, "workthumpnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberIsNull() {
            addCriterion("workDownLoadNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberIsNotNull() {
            addCriterion("workDownLoadNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberEqualTo(Integer value) {
            addCriterion("workDownLoadNumber =", value, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberNotEqualTo(Integer value) {
            addCriterion("workDownLoadNumber <>", value, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberGreaterThan(Integer value) {
            addCriterion("workDownLoadNumber >", value, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workDownLoadNumber >=", value, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberLessThan(Integer value) {
            addCriterion("workDownLoadNumber <", value, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberLessThanOrEqualTo(Integer value) {
            addCriterion("workDownLoadNumber <=", value, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberIn(List<Integer> values) {
            addCriterion("workDownLoadNumber in", values, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberNotIn(List<Integer> values) {
            addCriterion("workDownLoadNumber not in", values, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberBetween(Integer value1, Integer value2) {
            addCriterion("workDownLoadNumber between", value1, value2, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorkdownloadnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workDownLoadNumber not between", value1, value2, "workdownloadnumber");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkIsNull() {
            addCriterion("workShareLink is null");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkIsNotNull() {
            addCriterion("workShareLink is not null");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkEqualTo(String value) {
            addCriterion("workShareLink =", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkNotEqualTo(String value) {
            addCriterion("workShareLink <>", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkGreaterThan(String value) {
            addCriterion("workShareLink >", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkGreaterThanOrEqualTo(String value) {
            addCriterion("workShareLink >=", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkLessThan(String value) {
            addCriterion("workShareLink <", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkLessThanOrEqualTo(String value) {
            addCriterion("workShareLink <=", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkLike(String value) {
            addCriterion("workShareLink like", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkNotLike(String value) {
            addCriterion("workShareLink not like", value, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkIn(List<String> values) {
            addCriterion("workShareLink in", values, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkNotIn(List<String> values) {
            addCriterion("workShareLink not in", values, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkBetween(String value1, String value2) {
            addCriterion("workShareLink between", value1, value2, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorksharelinkNotBetween(String value1, String value2) {
            addCriterion("workShareLink not between", value1, value2, "worksharelink");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkIsNull() {
            addCriterion("workAboutWork is null");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkIsNotNull() {
            addCriterion("workAboutWork is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkEqualTo(String value) {
            addCriterion("workAboutWork =", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkNotEqualTo(String value) {
            addCriterion("workAboutWork <>", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkGreaterThan(String value) {
            addCriterion("workAboutWork >", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkGreaterThanOrEqualTo(String value) {
            addCriterion("workAboutWork >=", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkLessThan(String value) {
            addCriterion("workAboutWork <", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkLessThanOrEqualTo(String value) {
            addCriterion("workAboutWork <=", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkLike(String value) {
            addCriterion("workAboutWork like", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkNotLike(String value) {
            addCriterion("workAboutWork not like", value, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkIn(List<String> values) {
            addCriterion("workAboutWork in", values, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkNotIn(List<String> values) {
            addCriterion("workAboutWork not in", values, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkBetween(String value1, String value2) {
            addCriterion("workAboutWork between", value1, value2, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkaboutworkNotBetween(String value1, String value2) {
            addCriterion("workAboutWork not between", value1, value2, "workaboutwork");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridIsNull() {
            addCriterion("workModifyUserId is null");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridIsNotNull() {
            addCriterion("workModifyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridEqualTo(Long value) {
            addCriterion("workModifyUserId =", value, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridNotEqualTo(Long value) {
            addCriterion("workModifyUserId <>", value, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridGreaterThan(Long value) {
            addCriterion("workModifyUserId >", value, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("workModifyUserId >=", value, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridLessThan(Long value) {
            addCriterion("workModifyUserId <", value, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridLessThanOrEqualTo(Long value) {
            addCriterion("workModifyUserId <=", value, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridIn(List<Long> values) {
            addCriterion("workModifyUserId in", values, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridNotIn(List<Long> values) {
            addCriterion("workModifyUserId not in", values, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridBetween(Long value1, Long value2) {
            addCriterion("workModifyUserId between", value1, value2, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkmodifyuseridNotBetween(Long value1, Long value2) {
            addCriterion("workModifyUserId not between", value1, value2, "workmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorkisshowIsNull() {
            addCriterion("workIsShow is null");
            return (Criteria) this;
        }

        public Criteria andWorkisshowIsNotNull() {
            addCriterion("workIsShow is not null");
            return (Criteria) this;
        }

        public Criteria andWorkisshowEqualTo(Byte value) {
            addCriterion("workIsShow =", value, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowNotEqualTo(Byte value) {
            addCriterion("workIsShow <>", value, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowGreaterThan(Byte value) {
            addCriterion("workIsShow >", value, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("workIsShow >=", value, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowLessThan(Byte value) {
            addCriterion("workIsShow <", value, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowLessThanOrEqualTo(Byte value) {
            addCriterion("workIsShow <=", value, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowIn(List<Byte> values) {
            addCriterion("workIsShow in", values, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowNotIn(List<Byte> values) {
            addCriterion("workIsShow not in", values, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowBetween(Byte value1, Byte value2) {
            addCriterion("workIsShow between", value1, value2, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("workIsShow not between", value1, value2, "workisshow");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationIsNull() {
            addCriterion("workHomeRecommendation is null");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationIsNotNull() {
            addCriterion("workHomeRecommendation is not null");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationEqualTo(Byte value) {
            addCriterion("workHomeRecommendation =", value, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationNotEqualTo(Byte value) {
            addCriterion("workHomeRecommendation <>", value, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationGreaterThan(Byte value) {
            addCriterion("workHomeRecommendation >", value, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationGreaterThanOrEqualTo(Byte value) {
            addCriterion("workHomeRecommendation >=", value, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationLessThan(Byte value) {
            addCriterion("workHomeRecommendation <", value, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationLessThanOrEqualTo(Byte value) {
            addCriterion("workHomeRecommendation <=", value, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationIn(List<Byte> values) {
            addCriterion("workHomeRecommendation in", values, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationNotIn(List<Byte> values) {
            addCriterion("workHomeRecommendation not in", values, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationBetween(Byte value1, Byte value2) {
            addCriterion("workHomeRecommendation between", value1, value2, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorkhomerecommendationNotBetween(Byte value1, Byte value2) {
            addCriterion("workHomeRecommendation not between", value1, value2, "workhomerecommendation");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistIsNull() {
            addCriterion("workShareLinkList is null");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistIsNotNull() {
            addCriterion("workShareLinkList is not null");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistEqualTo(String value) {
            addCriterion("workShareLinkList =", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistNotEqualTo(String value) {
            addCriterion("workShareLinkList <>", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistGreaterThan(String value) {
            addCriterion("workShareLinkList >", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistGreaterThanOrEqualTo(String value) {
            addCriterion("workShareLinkList >=", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistLessThan(String value) {
            addCriterion("workShareLinkList <", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistLessThanOrEqualTo(String value) {
            addCriterion("workShareLinkList <=", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistLike(String value) {
            addCriterion("workShareLinkList like", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistNotLike(String value) {
            addCriterion("workShareLinkList not like", value, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistIn(List<String> values) {
            addCriterion("workShareLinkList in", values, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistNotIn(List<String> values) {
            addCriterion("workShareLinkList not in", values, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistBetween(String value1, String value2) {
            addCriterion("workShareLinkList between", value1, value2, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorksharelinklistNotBetween(String value1, String value2) {
            addCriterion("workShareLinkList not between", value1, value2, "worksharelinklist");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathIsNull() {
            addCriterion("workTwoFilePath is null");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathIsNotNull() {
            addCriterion("workTwoFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathEqualTo(String value) {
            addCriterion("workTwoFilePath =", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathNotEqualTo(String value) {
            addCriterion("workTwoFilePath <>", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathGreaterThan(String value) {
            addCriterion("workTwoFilePath >", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathGreaterThanOrEqualTo(String value) {
            addCriterion("workTwoFilePath >=", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathLessThan(String value) {
            addCriterion("workTwoFilePath <", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathLessThanOrEqualTo(String value) {
            addCriterion("workTwoFilePath <=", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathLike(String value) {
            addCriterion("workTwoFilePath like", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathNotLike(String value) {
            addCriterion("workTwoFilePath not like", value, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathIn(List<String> values) {
            addCriterion("workTwoFilePath in", values, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathNotIn(List<String> values) {
            addCriterion("workTwoFilePath not in", values, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathBetween(String value1, String value2) {
            addCriterion("workTwoFilePath between", value1, value2, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorktwofilepathNotBetween(String value1, String value2) {
            addCriterion("workTwoFilePath not between", value1, value2, "worktwofilepath");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusIsNull() {
            addCriterion("workDianZanStatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusIsNotNull() {
            addCriterion("workDianZanStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusEqualTo(Byte value) {
            addCriterion("workDianZanStatus =", value, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusNotEqualTo(Byte value) {
            addCriterion("workDianZanStatus <>", value, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusGreaterThan(Byte value) {
            addCriterion("workDianZanStatus >", value, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("workDianZanStatus >=", value, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusLessThan(Byte value) {
            addCriterion("workDianZanStatus <", value, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusLessThanOrEqualTo(Byte value) {
            addCriterion("workDianZanStatus <=", value, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusIn(List<Byte> values) {
            addCriterion("workDianZanStatus in", values, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusNotIn(List<Byte> values) {
            addCriterion("workDianZanStatus not in", values, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusBetween(Byte value1, Byte value2) {
            addCriterion("workDianZanStatus between", value1, value2, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkdianzanstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("workDianZanStatus not between", value1, value2, "workdianzanstatus");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidIsNull() {
            addCriterion("workAboutCollectionId is null");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidIsNotNull() {
            addCriterion("workAboutCollectionId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidEqualTo(Long value) {
            addCriterion("workAboutCollectionId =", value, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidNotEqualTo(Long value) {
            addCriterion("workAboutCollectionId <>", value, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidGreaterThan(Long value) {
            addCriterion("workAboutCollectionId >", value, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidGreaterThanOrEqualTo(Long value) {
            addCriterion("workAboutCollectionId >=", value, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidLessThan(Long value) {
            addCriterion("workAboutCollectionId <", value, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidLessThanOrEqualTo(Long value) {
            addCriterion("workAboutCollectionId <=", value, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidIn(List<Long> values) {
            addCriterion("workAboutCollectionId in", values, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidNotIn(List<Long> values) {
            addCriterion("workAboutCollectionId not in", values, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidBetween(Long value1, Long value2) {
            addCriterion("workAboutCollectionId between", value1, value2, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andWorkaboutcollectionidNotBetween(Long value1, Long value2) {
            addCriterion("workAboutCollectionId not between", value1, value2, "workaboutcollectionid");
            return (Criteria) this;
        }

        public Criteria andDianzanidIsNull() {
            addCriterion("dianzanId is null");
            return (Criteria) this;
        }

        public Criteria andDianzanidIsNotNull() {
            addCriterion("dianzanId is not null");
            return (Criteria) this;
        }

        public Criteria andDianzanidEqualTo(Long value) {
            addCriterion("dianzanId =", value, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidNotEqualTo(Long value) {
            addCriterion("dianzanId <>", value, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidGreaterThan(Long value) {
            addCriterion("dianzanId >", value, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidGreaterThanOrEqualTo(Long value) {
            addCriterion("dianzanId >=", value, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidLessThan(Long value) {
            addCriterion("dianzanId <", value, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidLessThanOrEqualTo(Long value) {
            addCriterion("dianzanId <=", value, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidIn(List<Long> values) {
            addCriterion("dianzanId in", values, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidNotIn(List<Long> values) {
            addCriterion("dianzanId not in", values, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidBetween(Long value1, Long value2) {
            addCriterion("dianzanId between", value1, value2, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andDianzanidNotBetween(Long value1, Long value2) {
            addCriterion("dianzanId not between", value1, value2, "dianzanid");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberIsNull() {
            addCriterion("workShouCangNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberIsNotNull() {
            addCriterion("workShouCangNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberEqualTo(Integer value) {
            addCriterion("workShouCangNumber =", value, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberNotEqualTo(Integer value) {
            addCriterion("workShouCangNumber <>", value, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberGreaterThan(Integer value) {
            addCriterion("workShouCangNumber >", value, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workShouCangNumber >=", value, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberLessThan(Integer value) {
            addCriterion("workShouCangNumber <", value, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberLessThanOrEqualTo(Integer value) {
            addCriterion("workShouCangNumber <=", value, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberIn(List<Integer> values) {
            addCriterion("workShouCangNumber in", values, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberNotIn(List<Integer> values) {
            addCriterion("workShouCangNumber not in", values, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberBetween(Integer value1, Integer value2) {
            addCriterion("workShouCangNumber between", value1, value2, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andWorkshoucangnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workShouCangNumber not between", value1, value2, "workshoucangnumber");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(Integer value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(Integer value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(Integer value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(Integer value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(Integer value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<Integer> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<Integer> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(Integer value1, Integer value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(Integer value1, Integer value2) {
            addCriterion("mode not between", value1, value2, "mode");
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