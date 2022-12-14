package com.shop.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticetableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticetableExample() {
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

        public Criteria andNtitleIsNull() {
            addCriterion("ntitle is null");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNotNull() {
            addCriterion("ntitle is not null");
            return (Criteria) this;
        }

        public Criteria andNtitleEqualTo(String value) {
            addCriterion("ntitle =", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotEqualTo(String value) {
            addCriterion("ntitle <>", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThan(String value) {
            addCriterion("ntitle >", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ntitle >=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThan(String value) {
            addCriterion("ntitle <", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThanOrEqualTo(String value) {
            addCriterion("ntitle <=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLike(String value) {
            addCriterion("ntitle like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotLike(String value) {
            addCriterion("ntitle not like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleIn(List<String> values) {
            addCriterion("ntitle in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotIn(List<String> values) {
            addCriterion("ntitle not in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleBetween(String value1, String value2) {
            addCriterion("ntitle between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotBetween(String value1, String value2) {
            addCriterion("ntitle not between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNcontentIsNull() {
            addCriterion("ncontent is null");
            return (Criteria) this;
        }

        public Criteria andNcontentIsNotNull() {
            addCriterion("ncontent is not null");
            return (Criteria) this;
        }

        public Criteria andNcontentEqualTo(String value) {
            addCriterion("ncontent =", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentNotEqualTo(String value) {
            addCriterion("ncontent <>", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentGreaterThan(String value) {
            addCriterion("ncontent >", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ncontent >=", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentLessThan(String value) {
            addCriterion("ncontent <", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentLessThanOrEqualTo(String value) {
            addCriterion("ncontent <=", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentLike(String value) {
            addCriterion("ncontent like", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentNotLike(String value) {
            addCriterion("ncontent not like", value, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentIn(List<String> values) {
            addCriterion("ncontent in", values, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentNotIn(List<String> values) {
            addCriterion("ncontent not in", values, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentBetween(String value1, String value2) {
            addCriterion("ncontent between", value1, value2, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNcontentNotBetween(String value1, String value2) {
            addCriterion("ncontent not between", value1, value2, "ncontent");
            return (Criteria) this;
        }

        public Criteria andNtimeIsNull() {
            addCriterion("ntime is null");
            return (Criteria) this;
        }

        public Criteria andNtimeIsNotNull() {
            addCriterion("ntime is not null");
            return (Criteria) this;
        }

        public Criteria andNtimeEqualTo(Date value) {
            addCriterion("ntime =", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotEqualTo(Date value) {
            addCriterion("ntime <>", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeGreaterThan(Date value) {
            addCriterion("ntime >", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ntime >=", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLessThan(Date value) {
            addCriterion("ntime <", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLessThanOrEqualTo(Date value) {
            addCriterion("ntime <=", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeIn(List<Date> values) {
            addCriterion("ntime in", values, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotIn(List<Date> values) {
            addCriterion("ntime not in", values, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeBetween(Date value1, Date value2) {
            addCriterion("ntime between", value1, value2, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotBetween(Date value1, Date value2) {
            addCriterion("ntime not between", value1, value2, "ntime");
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