package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class WorkTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkTypeExample() {
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

        public Criteria andWorktypeidIsNull() {
            addCriterion("workTypeId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeidIsNotNull() {
            addCriterion("workTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeidEqualTo(Long value) {
            addCriterion("workTypeId =", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidNotEqualTo(Long value) {
            addCriterion("workTypeId <>", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidGreaterThan(Long value) {
            addCriterion("workTypeId >", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeId >=", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidLessThan(Long value) {
            addCriterion("workTypeId <", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidLessThanOrEqualTo(Long value) {
            addCriterion("workTypeId <=", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidIn(List<Long> values) {
            addCriterion("workTypeId in", values, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidNotIn(List<Long> values) {
            addCriterion("workTypeId not in", values, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidBetween(Long value1, Long value2) {
            addCriterion("workTypeId between", value1, value2, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidNotBetween(Long value1, Long value2) {
            addCriterion("workTypeId not between", value1, value2, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelIsNull() {
            addCriterion("workTypeLevel is null");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelIsNotNull() {
            addCriterion("workTypeLevel is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelEqualTo(Byte value) {
            addCriterion("workTypeLevel =", value, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelNotEqualTo(Byte value) {
            addCriterion("workTypeLevel <>", value, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelGreaterThan(Byte value) {
            addCriterion("workTypeLevel >", value, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("workTypeLevel >=", value, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelLessThan(Byte value) {
            addCriterion("workTypeLevel <", value, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelLessThanOrEqualTo(Byte value) {
            addCriterion("workTypeLevel <=", value, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelIn(List<Byte> values) {
            addCriterion("workTypeLevel in", values, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelNotIn(List<Byte> values) {
            addCriterion("workTypeLevel not in", values, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelBetween(Byte value1, Byte value2) {
            addCriterion("workTypeLevel between", value1, value2, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypelevelNotBetween(Byte value1, Byte value2) {
            addCriterion("workTypeLevel not between", value1, value2, "worktypelevel");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidIsNull() {
            addCriterion("workTypeTopId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidIsNotNull() {
            addCriterion("workTypeTopId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidEqualTo(Long value) {
            addCriterion("workTypeTopId =", value, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidNotEqualTo(Long value) {
            addCriterion("workTypeTopId <>", value, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidGreaterThan(Long value) {
            addCriterion("workTypeTopId >", value, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeTopId >=", value, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidLessThan(Long value) {
            addCriterion("workTypeTopId <", value, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidLessThanOrEqualTo(Long value) {
            addCriterion("workTypeTopId <=", value, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidIn(List<Long> values) {
            addCriterion("workTypeTopId in", values, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidNotIn(List<Long> values) {
            addCriterion("workTypeTopId not in", values, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidBetween(Long value1, Long value2) {
            addCriterion("workTypeTopId between", value1, value2, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypetopidNotBetween(Long value1, Long value2) {
            addCriterion("workTypeTopId not between", value1, value2, "worktypetopid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidIsNull() {
            addCriterion("workTypeFirstId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidIsNotNull() {
            addCriterion("workTypeFirstId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidEqualTo(Long value) {
            addCriterion("workTypeFirstId =", value, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidNotEqualTo(Long value) {
            addCriterion("workTypeFirstId <>", value, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidGreaterThan(Long value) {
            addCriterion("workTypeFirstId >", value, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeFirstId >=", value, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidLessThan(Long value) {
            addCriterion("workTypeFirstId <", value, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidLessThanOrEqualTo(Long value) {
            addCriterion("workTypeFirstId <=", value, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidIn(List<Long> values) {
            addCriterion("workTypeFirstId in", values, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidNotIn(List<Long> values) {
            addCriterion("workTypeFirstId not in", values, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidBetween(Long value1, Long value2) {
            addCriterion("workTypeFirstId between", value1, value2, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypefirstidNotBetween(Long value1, Long value2) {
            addCriterion("workTypeFirstId not between", value1, value2, "worktypefirstid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidIsNull() {
            addCriterion("workTypeSecondId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidIsNotNull() {
            addCriterion("workTypeSecondId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidEqualTo(Long value) {
            addCriterion("workTypeSecondId =", value, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidNotEqualTo(Long value) {
            addCriterion("workTypeSecondId <>", value, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidGreaterThan(Long value) {
            addCriterion("workTypeSecondId >", value, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeSecondId >=", value, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidLessThan(Long value) {
            addCriterion("workTypeSecondId <", value, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidLessThanOrEqualTo(Long value) {
            addCriterion("workTypeSecondId <=", value, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidIn(List<Long> values) {
            addCriterion("workTypeSecondId in", values, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidNotIn(List<Long> values) {
            addCriterion("workTypeSecondId not in", values, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidBetween(Long value1, Long value2) {
            addCriterion("workTypeSecondId between", value1, value2, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypesecondidNotBetween(Long value1, Long value2) {
            addCriterion("workTypeSecondId not between", value1, value2, "worktypesecondid");
            return (Criteria) this;
        }

        public Criteria andWorktypenameIsNull() {
            addCriterion("workTypeName is null");
            return (Criteria) this;
        }

        public Criteria andWorktypenameIsNotNull() {
            addCriterion("workTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypenameEqualTo(String value) {
            addCriterion("workTypeName =", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameNotEqualTo(String value) {
            addCriterion("workTypeName <>", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameGreaterThan(String value) {
            addCriterion("workTypeName >", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameGreaterThanOrEqualTo(String value) {
            addCriterion("workTypeName >=", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameLessThan(String value) {
            addCriterion("workTypeName <", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameLessThanOrEqualTo(String value) {
            addCriterion("workTypeName <=", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameLike(String value) {
            addCriterion("workTypeName like", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameNotLike(String value) {
            addCriterion("workTypeName not like", value, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameIn(List<String> values) {
            addCriterion("workTypeName in", values, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameNotIn(List<String> values) {
            addCriterion("workTypeName not in", values, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameBetween(String value1, String value2) {
            addCriterion("workTypeName between", value1, value2, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypenameNotBetween(String value1, String value2) {
            addCriterion("workTypeName not between", value1, value2, "worktypename");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridIsNull() {
            addCriterion("workTypeCreateUserId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridIsNotNull() {
            addCriterion("workTypeCreateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridEqualTo(Long value) {
            addCriterion("workTypeCreateUserId =", value, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridNotEqualTo(Long value) {
            addCriterion("workTypeCreateUserId <>", value, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridGreaterThan(Long value) {
            addCriterion("workTypeCreateUserId >", value, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeCreateUserId >=", value, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridLessThan(Long value) {
            addCriterion("workTypeCreateUserId <", value, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridLessThanOrEqualTo(Long value) {
            addCriterion("workTypeCreateUserId <=", value, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridIn(List<Long> values) {
            addCriterion("workTypeCreateUserId in", values, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridNotIn(List<Long> values) {
            addCriterion("workTypeCreateUserId not in", values, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridBetween(Long value1, Long value2) {
            addCriterion("workTypeCreateUserId between", value1, value2, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreateuseridNotBetween(Long value1, Long value2) {
            addCriterion("workTypeCreateUserId not between", value1, value2, "worktypecreateuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridIsNull() {
            addCriterion("workTypeModifyUserId is null");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridIsNotNull() {
            addCriterion("workTypeModifyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridEqualTo(Long value) {
            addCriterion("workTypeModifyUserId =", value, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridNotEqualTo(Long value) {
            addCriterion("workTypeModifyUserId <>", value, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridGreaterThan(Long value) {
            addCriterion("workTypeModifyUserId >", value, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("workTypeModifyUserId >=", value, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridLessThan(Long value) {
            addCriterion("workTypeModifyUserId <", value, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridLessThanOrEqualTo(Long value) {
            addCriterion("workTypeModifyUserId <=", value, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridIn(List<Long> values) {
            addCriterion("workTypeModifyUserId in", values, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridNotIn(List<Long> values) {
            addCriterion("workTypeModifyUserId not in", values, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridBetween(Long value1, Long value2) {
            addCriterion("workTypeModifyUserId between", value1, value2, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifyuseridNotBetween(Long value1, Long value2) {
            addCriterion("workTypeModifyUserId not between", value1, value2, "worktypemodifyuserid");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeIsNull() {
            addCriterion("workTypeCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeIsNotNull() {
            addCriterion("workTypeCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeEqualTo(String value) {
            addCriterion("workTypeCreateTime =", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeNotEqualTo(String value) {
            addCriterion("workTypeCreateTime <>", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeGreaterThan(String value) {
            addCriterion("workTypeCreateTime >", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("workTypeCreateTime >=", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeLessThan(String value) {
            addCriterion("workTypeCreateTime <", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("workTypeCreateTime <=", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeLike(String value) {
            addCriterion("workTypeCreateTime like", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeNotLike(String value) {
            addCriterion("workTypeCreateTime not like", value, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeIn(List<String> values) {
            addCriterion("workTypeCreateTime in", values, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeNotIn(List<String> values) {
            addCriterion("workTypeCreateTime not in", values, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeBetween(String value1, String value2) {
            addCriterion("workTypeCreateTime between", value1, value2, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypecreatetimeNotBetween(String value1, String value2) {
            addCriterion("workTypeCreateTime not between", value1, value2, "worktypecreatetime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeIsNull() {
            addCriterion("workTypeModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeIsNotNull() {
            addCriterion("workTypeModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeEqualTo(String value) {
            addCriterion("workTypeModifyTime =", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeNotEqualTo(String value) {
            addCriterion("workTypeModifyTime <>", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeGreaterThan(String value) {
            addCriterion("workTypeModifyTime >", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("workTypeModifyTime >=", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeLessThan(String value) {
            addCriterion("workTypeModifyTime <", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeLessThanOrEqualTo(String value) {
            addCriterion("workTypeModifyTime <=", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeLike(String value) {
            addCriterion("workTypeModifyTime like", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeNotLike(String value) {
            addCriterion("workTypeModifyTime not like", value, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeIn(List<String> values) {
            addCriterion("workTypeModifyTime in", values, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeNotIn(List<String> values) {
            addCriterion("workTypeModifyTime not in", values, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeBetween(String value1, String value2) {
            addCriterion("workTypeModifyTime between", value1, value2, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypemodifytimeNotBetween(String value1, String value2) {
            addCriterion("workTypeModifyTime not between", value1, value2, "worktypemodifytime");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowIsNull() {
            addCriterion("workTypeIsShow is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowIsNotNull() {
            addCriterion("workTypeIsShow is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowEqualTo(Byte value) {
            addCriterion("workTypeIsShow =", value, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowNotEqualTo(Byte value) {
            addCriterion("workTypeIsShow <>", value, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowGreaterThan(Byte value) {
            addCriterion("workTypeIsShow >", value, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("workTypeIsShow >=", value, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowLessThan(Byte value) {
            addCriterion("workTypeIsShow <", value, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowLessThanOrEqualTo(Byte value) {
            addCriterion("workTypeIsShow <=", value, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowIn(List<Byte> values) {
            addCriterion("workTypeIsShow in", values, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowNotIn(List<Byte> values) {
            addCriterion("workTypeIsShow not in", values, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowBetween(Byte value1, Byte value2) {
            addCriterion("workTypeIsShow between", value1, value2, "worktypeisshow");
            return (Criteria) this;
        }

        public Criteria andWorktypeisshowNotBetween(Byte value1, Byte value2) {
            addCriterion("workTypeIsShow not between", value1, value2, "worktypeisshow");
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