package com.po;

import java.util.ArrayList;
import java.util.List;

public class ErYgdzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErYgdzExample() {
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

        public Criteria andTxdzIsNull() {
            addCriterion("txdz is null");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNotNull() {
            addCriterion("txdz is not null");
            return (Criteria) this;
        }

        public Criteria andTxdzEqualTo(String value) {
            addCriterion("txdz =", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotEqualTo(String value) {
            addCriterion("txdz <>", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThan(String value) {
            addCriterion("txdz >", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThanOrEqualTo(String value) {
            addCriterion("txdz >=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThan(String value) {
            addCriterion("txdz <", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThanOrEqualTo(String value) {
            addCriterion("txdz <=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLike(String value) {
            addCriterion("txdz like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotLike(String value) {
            addCriterion("txdz not like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzIn(List<String> values) {
            addCriterion("txdz in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotIn(List<String> values) {
            addCriterion("txdz not in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzBetween(String value1, String value2) {
            addCriterion("txdz between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotBetween(String value1, String value2) {
            addCriterion("txdz not between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andYbIsNull() {
            addCriterion("yb is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("yb is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(String value) {
            addCriterion("yb =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(String value) {
            addCriterion("yb <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(String value) {
            addCriterion("yb >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(String value) {
            addCriterion("yb >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(String value) {
            addCriterion("yb <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(String value) {
            addCriterion("yb <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLike(String value) {
            addCriterion("yb like", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotLike(String value) {
            addCriterion("yb not like", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<String> values) {
            addCriterion("yb in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<String> values) {
            addCriterion("yb not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(String value1, String value2) {
            addCriterion("yb between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(String value1, String value2) {
            addCriterion("yb not between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andXzdzIsNull() {
            addCriterion("xzdz is null");
            return (Criteria) this;
        }

        public Criteria andXzdzIsNotNull() {
            addCriterion("xzdz is not null");
            return (Criteria) this;
        }

        public Criteria andXzdzEqualTo(String value) {
            addCriterion("xzdz =", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzNotEqualTo(String value) {
            addCriterion("xzdz <>", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzGreaterThan(String value) {
            addCriterion("xzdz >", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzGreaterThanOrEqualTo(String value) {
            addCriterion("xzdz >=", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzLessThan(String value) {
            addCriterion("xzdz <", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzLessThanOrEqualTo(String value) {
            addCriterion("xzdz <=", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzLike(String value) {
            addCriterion("xzdz like", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzNotLike(String value) {
            addCriterion("xzdz not like", value, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzIn(List<String> values) {
            addCriterion("xzdz in", values, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzNotIn(List<String> values) {
            addCriterion("xzdz not in", values, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzBetween(String value1, String value2) {
            addCriterion("xzdz between", value1, value2, "xzdz");
            return (Criteria) this;
        }

        public Criteria andXzdzNotBetween(String value1, String value2) {
            addCriterion("xzdz not between", value1, value2, "xzdz");
            return (Criteria) this;
        }

        public Criteria andZzdhIsNull() {
            addCriterion("zzdh is null");
            return (Criteria) this;
        }

        public Criteria andZzdhIsNotNull() {
            addCriterion("zzdh is not null");
            return (Criteria) this;
        }

        public Criteria andZzdhEqualTo(String value) {
            addCriterion("zzdh =", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotEqualTo(String value) {
            addCriterion("zzdh <>", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhGreaterThan(String value) {
            addCriterion("zzdh >", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhGreaterThanOrEqualTo(String value) {
            addCriterion("zzdh >=", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhLessThan(String value) {
            addCriterion("zzdh <", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhLessThanOrEqualTo(String value) {
            addCriterion("zzdh <=", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhLike(String value) {
            addCriterion("zzdh like", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotLike(String value) {
            addCriterion("zzdh not like", value, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhIn(List<String> values) {
            addCriterion("zzdh in", values, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotIn(List<String> values) {
            addCriterion("zzdh not in", values, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhBetween(String value1, String value2) {
            addCriterion("zzdh between", value1, value2, "zzdh");
            return (Criteria) this;
        }

        public Criteria andZzdhNotBetween(String value1, String value2) {
            addCriterion("zzdh not between", value1, value2, "zzdh");
            return (Criteria) this;
        }

        public Criteria andYddhIsNull() {
            addCriterion("yddh is null");
            return (Criteria) this;
        }

        public Criteria andYddhIsNotNull() {
            addCriterion("yddh is not null");
            return (Criteria) this;
        }

        public Criteria andYddhEqualTo(String value) {
            addCriterion("yddh =", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotEqualTo(String value) {
            addCriterion("yddh <>", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhGreaterThan(String value) {
            addCriterion("yddh >", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhGreaterThanOrEqualTo(String value) {
            addCriterion("yddh >=", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhLessThan(String value) {
            addCriterion("yddh <", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhLessThanOrEqualTo(String value) {
            addCriterion("yddh <=", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhLike(String value) {
            addCriterion("yddh like", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotLike(String value) {
            addCriterion("yddh not like", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhIn(List<String> values) {
            addCriterion("yddh in", values, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotIn(List<String> values) {
            addCriterion("yddh not in", values, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhBetween(String value1, String value2) {
            addCriterion("yddh between", value1, value2, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotBetween(String value1, String value2) {
            addCriterion("yddh not between", value1, value2, "yddh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhIsNull() {
            addCriterion("jjlxrdh is null");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhIsNotNull() {
            addCriterion("jjlxrdh is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhEqualTo(String value) {
            addCriterion("jjlxrdh =", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotEqualTo(String value) {
            addCriterion("jjlxrdh <>", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhGreaterThan(String value) {
            addCriterion("jjlxrdh >", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhGreaterThanOrEqualTo(String value) {
            addCriterion("jjlxrdh >=", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhLessThan(String value) {
            addCriterion("jjlxrdh <", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhLessThanOrEqualTo(String value) {
            addCriterion("jjlxrdh <=", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhLike(String value) {
            addCriterion("jjlxrdh like", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotLike(String value) {
            addCriterion("jjlxrdh not like", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhIn(List<String> values) {
            addCriterion("jjlxrdh in", values, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotIn(List<String> values) {
            addCriterion("jjlxrdh not in", values, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhBetween(String value1, String value2) {
            addCriterion("jjlxrdh between", value1, value2, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotBetween(String value1, String value2) {
            addCriterion("jjlxrdh not between", value1, value2, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andGrdzyjIsNull() {
            addCriterion("grdzyj is null");
            return (Criteria) this;
        }

        public Criteria andGrdzyjIsNotNull() {
            addCriterion("grdzyj is not null");
            return (Criteria) this;
        }

        public Criteria andGrdzyjEqualTo(String value) {
            addCriterion("grdzyj =", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjNotEqualTo(String value) {
            addCriterion("grdzyj <>", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjGreaterThan(String value) {
            addCriterion("grdzyj >", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjGreaterThanOrEqualTo(String value) {
            addCriterion("grdzyj >=", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjLessThan(String value) {
            addCriterion("grdzyj <", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjLessThanOrEqualTo(String value) {
            addCriterion("grdzyj <=", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjLike(String value) {
            addCriterion("grdzyj like", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjNotLike(String value) {
            addCriterion("grdzyj not like", value, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjIn(List<String> values) {
            addCriterion("grdzyj in", values, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjNotIn(List<String> values) {
            addCriterion("grdzyj not in", values, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjBetween(String value1, String value2) {
            addCriterion("grdzyj between", value1, value2, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGrdzyjNotBetween(String value1, String value2) {
            addCriterion("grdzyj not between", value1, value2, "grdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjIsNull() {
            addCriterion("gsdzyj is null");
            return (Criteria) this;
        }

        public Criteria andGsdzyjIsNotNull() {
            addCriterion("gsdzyj is not null");
            return (Criteria) this;
        }

        public Criteria andGsdzyjEqualTo(String value) {
            addCriterion("gsdzyj =", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjNotEqualTo(String value) {
            addCriterion("gsdzyj <>", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjGreaterThan(String value) {
            addCriterion("gsdzyj >", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjGreaterThanOrEqualTo(String value) {
            addCriterion("gsdzyj >=", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjLessThan(String value) {
            addCriterion("gsdzyj <", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjLessThanOrEqualTo(String value) {
            addCriterion("gsdzyj <=", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjLike(String value) {
            addCriterion("gsdzyj like", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjNotLike(String value) {
            addCriterion("gsdzyj not like", value, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjIn(List<String> values) {
            addCriterion("gsdzyj in", values, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjNotIn(List<String> values) {
            addCriterion("gsdzyj not in", values, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjBetween(String value1, String value2) {
            addCriterion("gsdzyj between", value1, value2, "gsdzyj");
            return (Criteria) this;
        }

        public Criteria andGsdzyjNotBetween(String value1, String value2) {
            addCriterion("gsdzyj not between", value1, value2, "gsdzyj");
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