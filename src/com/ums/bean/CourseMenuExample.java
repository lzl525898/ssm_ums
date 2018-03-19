package com.ums.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseMenuExample() {
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

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseId like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseId not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videoUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videoUrl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videoUrl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videoUrl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videoUrl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videoUrl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videoUrl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videoUrl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videoUrl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videoUrl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videoUrl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videoUrl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videoUrl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andCourseimageIsNull() {
            addCriterion("courseImage is null");
            return (Criteria) this;
        }

        public Criteria andCourseimageIsNotNull() {
            addCriterion("courseImage is not null");
            return (Criteria) this;
        }

        public Criteria andCourseimageEqualTo(String value) {
            addCriterion("courseImage =", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageNotEqualTo(String value) {
            addCriterion("courseImage <>", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageGreaterThan(String value) {
            addCriterion("courseImage >", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageGreaterThanOrEqualTo(String value) {
            addCriterion("courseImage >=", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageLessThan(String value) {
            addCriterion("courseImage <", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageLessThanOrEqualTo(String value) {
            addCriterion("courseImage <=", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageLike(String value) {
            addCriterion("courseImage like", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageNotLike(String value) {
            addCriterion("courseImage not like", value, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageIn(List<String> values) {
            addCriterion("courseImage in", values, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageNotIn(List<String> values) {
            addCriterion("courseImage not in", values, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageBetween(String value1, String value2) {
            addCriterion("courseImage between", value1, value2, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCourseimageNotBetween(String value1, String value2) {
            addCriterion("courseImage not between", value1, value2, "courseimage");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNull() {
            addCriterion("coursetime is null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNotNull() {
            addCriterion("coursetime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeEqualTo(String value) {
            addCriterion("coursetime =", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotEqualTo(String value) {
            addCriterion("coursetime <>", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThan(String value) {
            addCriterion("coursetime >", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThanOrEqualTo(String value) {
            addCriterion("coursetime >=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThan(String value) {
            addCriterion("coursetime <", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThanOrEqualTo(String value) {
            addCriterion("coursetime <=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLike(String value) {
            addCriterion("coursetime like", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotLike(String value) {
            addCriterion("coursetime not like", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIn(List<String> values) {
            addCriterion("coursetime in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotIn(List<String> values) {
            addCriterion("coursetime not in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeBetween(String value1, String value2) {
            addCriterion("coursetime between", value1, value2, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotBetween(String value1, String value2) {
            addCriterion("coursetime not between", value1, value2, "coursetime");
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

        public Criteria andParentmenulvlIsNull() {
            addCriterion("parentMenuLvl is null");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlIsNotNull() {
            addCriterion("parentMenuLvl is not null");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlEqualTo(Long value) {
            addCriterion("parentMenuLvl =", value, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlNotEqualTo(Long value) {
            addCriterion("parentMenuLvl <>", value, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlGreaterThan(Long value) {
            addCriterion("parentMenuLvl >", value, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlGreaterThanOrEqualTo(Long value) {
            addCriterion("parentMenuLvl >=", value, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlLessThan(Long value) {
            addCriterion("parentMenuLvl <", value, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlLessThanOrEqualTo(Long value) {
            addCriterion("parentMenuLvl <=", value, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlIn(List<Long> values) {
            addCriterion("parentMenuLvl in", values, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlNotIn(List<Long> values) {
            addCriterion("parentMenuLvl not in", values, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlBetween(Long value1, Long value2) {
            addCriterion("parentMenuLvl between", value1, value2, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andParentmenulvlNotBetween(Long value1, Long value2) {
            addCriterion("parentMenuLvl not between", value1, value2, "parentmenulvl");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("createId is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Integer value) {
            addCriterion("createId =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Integer value) {
            addCriterion("createId <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Integer value) {
            addCriterion("createId >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createId >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Integer value) {
            addCriterion("createId <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Integer value) {
            addCriterion("createId <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Integer> values) {
            addCriterion("createId in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Integer> values) {
            addCriterion("createId not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Integer value1, Integer value2) {
            addCriterion("createId between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("createId not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNull() {
            addCriterion("isDisplay is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNotNull() {
            addCriterion("isDisplay is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayEqualTo(Integer value) {
            addCriterion("isDisplay =", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotEqualTo(Integer value) {
            addCriterion("isDisplay <>", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThan(Integer value) {
            addCriterion("isDisplay >", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDisplay >=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThan(Integer value) {
            addCriterion("isDisplay <", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThanOrEqualTo(Integer value) {
            addCriterion("isDisplay <=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIn(List<Integer> values) {
            addCriterion("isDisplay in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotIn(List<Integer> values) {
            addCriterion("isDisplay not in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayBetween(Integer value1, Integer value2) {
            addCriterion("isDisplay between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotBetween(Integer value1, Integer value2) {
            addCriterion("isDisplay not between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNull() {
            addCriterion("isMain is null");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNotNull() {
            addCriterion("isMain is not null");
            return (Criteria) this;
        }

        public Criteria andIsmainEqualTo(Integer value) {
            addCriterion("isMain =", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotEqualTo(Integer value) {
            addCriterion("isMain <>", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThan(Integer value) {
            addCriterion("isMain >", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThanOrEqualTo(Integer value) {
            addCriterion("isMain >=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThan(Integer value) {
            addCriterion("isMain <", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThanOrEqualTo(Integer value) {
            addCriterion("isMain <=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainIn(List<Integer> values) {
            addCriterion("isMain in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotIn(List<Integer> values) {
            addCriterion("isMain not in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainBetween(Integer value1, Integer value2) {
            addCriterion("isMain between", value1, value2, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotBetween(Integer value1, Integer value2) {
            addCriterion("isMain not between", value1, value2, "ismain");
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