package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErYgxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErYgxxExample() {
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

        public Criteria andYgmcIsNull() {
            addCriterion("ygmc is null");
            return (Criteria) this;
        }

        public Criteria andYgmcIsNotNull() {
            addCriterion("ygmc is not null");
            return (Criteria) this;
        }

        public Criteria andYgmcEqualTo(String value) {
            addCriterion("ygmc =", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotEqualTo(String value) {
            addCriterion("ygmc <>", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcGreaterThan(String value) {
            addCriterion("ygmc >", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcGreaterThanOrEqualTo(String value) {
            addCriterion("ygmc >=", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcLessThan(String value) {
            addCriterion("ygmc <", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcLessThanOrEqualTo(String value) {
            addCriterion("ygmc <=", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcLike(String value) {
            addCriterion("ygmc like", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotLike(String value) {
            addCriterion("ygmc not like", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcIn(List<String> values) {
            addCriterion("ygmc in", values, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotIn(List<String> values) {
            addCriterion("ygmc not in", values, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcBetween(String value1, String value2) {
            addCriterion("ygmc between", value1, value2, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotBetween(String value1, String value2) {
            addCriterion("ygmc not between", value1, value2, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgghIsNull() {
            addCriterion("yggh is null");
            return (Criteria) this;
        }

        public Criteria andYgghIsNotNull() {
            addCriterion("yggh is not null");
            return (Criteria) this;
        }

        public Criteria andYgghEqualTo(String value) {
            addCriterion("yggh =", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghNotEqualTo(String value) {
            addCriterion("yggh <>", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghGreaterThan(String value) {
            addCriterion("yggh >", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghGreaterThanOrEqualTo(String value) {
            addCriterion("yggh >=", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghLessThan(String value) {
            addCriterion("yggh <", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghLessThanOrEqualTo(String value) {
            addCriterion("yggh <=", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghLike(String value) {
            addCriterion("yggh like", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghNotLike(String value) {
            addCriterion("yggh not like", value, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghIn(List<String> values) {
            addCriterion("yggh in", values, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghNotIn(List<String> values) {
            addCriterion("yggh not in", values, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghBetween(String value1, String value2) {
            addCriterion("yggh between", value1, value2, "yggh");
            return (Criteria) this;
        }

        public Criteria andYgghNotBetween(String value1, String value2) {
            addCriterion("yggh not between", value1, value2, "yggh");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("jg like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("jg not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("jg not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterion("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterion("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterion("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterion("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterion("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterion("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterion("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterion("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterion("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("hyzk is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("hyzk is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(Integer value) {
            addCriterion("hyzk =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(Integer value) {
            addCriterion("hyzk <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(Integer value) {
            addCriterion("hyzk >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(Integer value) {
            addCriterion("hyzk >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(Integer value) {
            addCriterion("hyzk <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(Integer value) {
            addCriterion("hyzk <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<Integer> values) {
            addCriterion("hyzk in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<Integer> values) {
            addCriterion("hyzk not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(Integer value1, Integer value2) {
            addCriterion("hyzk between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(Integer value1, Integer value2) {
            addCriterion("hyzk not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andSfsyIsNull() {
            addCriterion("sfsy is null");
            return (Criteria) this;
        }

        public Criteria andSfsyIsNotNull() {
            addCriterion("sfsy is not null");
            return (Criteria) this;
        }

        public Criteria andSfsyEqualTo(Integer value) {
            addCriterion("sfsy =", value, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyNotEqualTo(Integer value) {
            addCriterion("sfsy <>", value, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyGreaterThan(Integer value) {
            addCriterion("sfsy >", value, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sfsy >=", value, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyLessThan(Integer value) {
            addCriterion("sfsy <", value, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyLessThanOrEqualTo(Integer value) {
            addCriterion("sfsy <=", value, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyIn(List<Integer> values) {
            addCriterion("sfsy in", values, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyNotIn(List<Integer> values) {
            addCriterion("sfsy not in", values, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyBetween(Integer value1, Integer value2) {
            addCriterion("sfsy between", value1, value2, "sfsy");
            return (Criteria) this;
        }

        public Criteria andSfsyNotBetween(Integer value1, Integer value2) {
            addCriterion("sfsy not between", value1, value2, "sfsy");
            return (Criteria) this;
        }

        public Criteria andRzbmIsNull() {
            addCriterion("rzbm is null");
            return (Criteria) this;
        }

        public Criteria andRzbmIsNotNull() {
            addCriterion("rzbm is not null");
            return (Criteria) this;
        }

        public Criteria andRzbmEqualTo(String value) {
            addCriterion("rzbm =", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmNotEqualTo(String value) {
            addCriterion("rzbm <>", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmGreaterThan(String value) {
            addCriterion("rzbm >", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmGreaterThanOrEqualTo(String value) {
            addCriterion("rzbm >=", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmLessThan(String value) {
            addCriterion("rzbm <", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmLessThanOrEqualTo(String value) {
            addCriterion("rzbm <=", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmLike(String value) {
            addCriterion("rzbm like", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmNotLike(String value) {
            addCriterion("rzbm not like", value, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmIn(List<String> values) {
            addCriterion("rzbm in", values, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmNotIn(List<String> values) {
            addCriterion("rzbm not in", values, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmBetween(String value1, String value2) {
            addCriterion("rzbm between", value1, value2, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzbmNotBetween(String value1, String value2) {
            addCriterion("rzbm not between", value1, value2, "rzbm");
            return (Criteria) this;
        }

        public Criteria andRzgwIsNull() {
            addCriterion("rzgw is null");
            return (Criteria) this;
        }

        public Criteria andRzgwIsNotNull() {
            addCriterion("rzgw is not null");
            return (Criteria) this;
        }

        public Criteria andRzgwEqualTo(String value) {
            addCriterion("rzgw =", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwNotEqualTo(String value) {
            addCriterion("rzgw <>", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwGreaterThan(String value) {
            addCriterion("rzgw >", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwGreaterThanOrEqualTo(String value) {
            addCriterion("rzgw >=", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwLessThan(String value) {
            addCriterion("rzgw <", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwLessThanOrEqualTo(String value) {
            addCriterion("rzgw <=", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwLike(String value) {
            addCriterion("rzgw like", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwNotLike(String value) {
            addCriterion("rzgw not like", value, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwIn(List<String> values) {
            addCriterion("rzgw in", values, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwNotIn(List<String> values) {
            addCriterion("rzgw not in", values, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwBetween(String value1, String value2) {
            addCriterion("rzgw between", value1, value2, "rzgw");
            return (Criteria) this;
        }

        public Criteria andRzgwNotBetween(String value1, String value2) {
            addCriterion("rzgw not between", value1, value2, "rzgw");
            return (Criteria) this;
        }

        public Criteria andXzIsNull() {
            addCriterion("xz is null");
            return (Criteria) this;
        }

        public Criteria andXzIsNotNull() {
            addCriterion("xz is not null");
            return (Criteria) this;
        }

        public Criteria andXzEqualTo(String value) {
            addCriterion("xz =", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotEqualTo(String value) {
            addCriterion("xz <>", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThan(String value) {
            addCriterion("xz >", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThanOrEqualTo(String value) {
            addCriterion("xz >=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThan(String value) {
            addCriterion("xz <", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThanOrEqualTo(String value) {
            addCriterion("xz <=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLike(String value) {
            addCriterion("xz like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotLike(String value) {
            addCriterion("xz not like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzIn(List<String> values) {
            addCriterion("xz in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotIn(List<String> values) {
            addCriterion("xz not in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzBetween(String value1, String value2) {
            addCriterion("xz between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotBetween(String value1, String value2) {
            addCriterion("xz not between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andGzxzIsNull() {
            addCriterion("gzxz is null");
            return (Criteria) this;
        }

        public Criteria andGzxzIsNotNull() {
            addCriterion("gzxz is not null");
            return (Criteria) this;
        }

        public Criteria andGzxzEqualTo(String value) {
            addCriterion("gzxz =", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotEqualTo(String value) {
            addCriterion("gzxz <>", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzGreaterThan(String value) {
            addCriterion("gzxz >", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzGreaterThanOrEqualTo(String value) {
            addCriterion("gzxz >=", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzLessThan(String value) {
            addCriterion("gzxz <", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzLessThanOrEqualTo(String value) {
            addCriterion("gzxz <=", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzLike(String value) {
            addCriterion("gzxz like", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotLike(String value) {
            addCriterion("gzxz not like", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzIn(List<String> values) {
            addCriterion("gzxz in", values, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotIn(List<String> values) {
            addCriterion("gzxz not in", values, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzBetween(String value1, String value2) {
            addCriterion("gzxz between", value1, value2, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotBetween(String value1, String value2) {
            addCriterion("gzxz not between", value1, value2, "gzxz");
            return (Criteria) this;
        }

        public Criteria andByxxIsNull() {
            addCriterion("byxx is null");
            return (Criteria) this;
        }

        public Criteria andByxxIsNotNull() {
            addCriterion("byxx is not null");
            return (Criteria) this;
        }

        public Criteria andByxxEqualTo(String value) {
            addCriterion("byxx =", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotEqualTo(String value) {
            addCriterion("byxx <>", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxGreaterThan(String value) {
            addCriterion("byxx >", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxGreaterThanOrEqualTo(String value) {
            addCriterion("byxx >=", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxLessThan(String value) {
            addCriterion("byxx <", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxLessThanOrEqualTo(String value) {
            addCriterion("byxx <=", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxLike(String value) {
            addCriterion("byxx like", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotLike(String value) {
            addCriterion("byxx not like", value, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxIn(List<String> values) {
            addCriterion("byxx in", values, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotIn(List<String> values) {
            addCriterion("byxx not in", values, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxBetween(String value1, String value2) {
            addCriterion("byxx between", value1, value2, "byxx");
            return (Criteria) this;
        }

        public Criteria andByxxNotBetween(String value1, String value2) {
            addCriterion("byxx not between", value1, value2, "byxx");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andBysjIsNull() {
            addCriterion("bysj is null");
            return (Criteria) this;
        }

        public Criteria andBysjIsNotNull() {
            addCriterion("bysj is not null");
            return (Criteria) this;
        }

        public Criteria andBysjEqualTo(Date value) {
            addCriterion("bysj =", value, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjNotEqualTo(Date value) {
            addCriterion("bysj <>", value, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjGreaterThan(Date value) {
            addCriterion("bysj >", value, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjGreaterThanOrEqualTo(Date value) {
            addCriterion("bysj >=", value, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjLessThan(Date value) {
            addCriterion("bysj <", value, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjLessThanOrEqualTo(Date value) {
            addCriterion("bysj <=", value, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjIn(List<Date> values) {
            addCriterion("bysj in", values, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjNotIn(List<Date> values) {
            addCriterion("bysj not in", values, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjBetween(Date value1, Date value2) {
            addCriterion("bysj between", value1, value2, "bysj");
            return (Criteria) this;
        }

        public Criteria andBysjNotBetween(Date value1, Date value2) {
            addCriterion("bysj not between", value1, value2, "bysj");
            return (Criteria) this;
        }

        public Criteria andZgxlIsNull() {
            addCriterion("zgxl is null");
            return (Criteria) this;
        }

        public Criteria andZgxlIsNotNull() {
            addCriterion("zgxl is not null");
            return (Criteria) this;
        }

        public Criteria andZgxlEqualTo(String value) {
            addCriterion("zgxl =", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlNotEqualTo(String value) {
            addCriterion("zgxl <>", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlGreaterThan(String value) {
            addCriterion("zgxl >", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlGreaterThanOrEqualTo(String value) {
            addCriterion("zgxl >=", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlLessThan(String value) {
            addCriterion("zgxl <", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlLessThanOrEqualTo(String value) {
            addCriterion("zgxl <=", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlLike(String value) {
            addCriterion("zgxl like", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlNotLike(String value) {
            addCriterion("zgxl not like", value, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlIn(List<String> values) {
            addCriterion("zgxl in", values, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlNotIn(List<String> values) {
            addCriterion("zgxl not in", values, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlBetween(String value1, String value2) {
            addCriterion("zgxl between", value1, value2, "zgxl");
            return (Criteria) this;
        }

        public Criteria andZgxlNotBetween(String value1, String value2) {
            addCriterion("zgxl not between", value1, value2, "zgxl");
            return (Criteria) this;
        }

        public Criteria andXwmcIsNull() {
            addCriterion("xwmc is null");
            return (Criteria) this;
        }

        public Criteria andXwmcIsNotNull() {
            addCriterion("xwmc is not null");
            return (Criteria) this;
        }

        public Criteria andXwmcEqualTo(String value) {
            addCriterion("xwmc =", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcNotEqualTo(String value) {
            addCriterion("xwmc <>", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcGreaterThan(String value) {
            addCriterion("xwmc >", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcGreaterThanOrEqualTo(String value) {
            addCriterion("xwmc >=", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcLessThan(String value) {
            addCriterion("xwmc <", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcLessThanOrEqualTo(String value) {
            addCriterion("xwmc <=", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcLike(String value) {
            addCriterion("xwmc like", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcNotLike(String value) {
            addCriterion("xwmc not like", value, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcIn(List<String> values) {
            addCriterion("xwmc in", values, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcNotIn(List<String> values) {
            addCriterion("xwmc not in", values, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcBetween(String value1, String value2) {
            addCriterion("xwmc between", value1, value2, "xwmc");
            return (Criteria) this;
        }

        public Criteria andXwmcNotBetween(String value1, String value2) {
            addCriterion("xwmc not between", value1, value2, "xwmc");
            return (Criteria) this;
        }

        public Criteria andCjgzsjIsNull() {
            addCriterion("cjgzsj is null");
            return (Criteria) this;
        }

        public Criteria andCjgzsjIsNotNull() {
            addCriterion("cjgzsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjgzsjEqualTo(Date value) {
            addCriterion("cjgzsj =", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjNotEqualTo(Date value) {
            addCriterion("cjgzsj <>", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjGreaterThan(Date value) {
            addCriterion("cjgzsj >", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjgzsj >=", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjLessThan(Date value) {
            addCriterion("cjgzsj <", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjLessThanOrEqualTo(Date value) {
            addCriterion("cjgzsj <=", value, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjIn(List<Date> values) {
            addCriterion("cjgzsj in", values, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjNotIn(List<Date> values) {
            addCriterion("cjgzsj not in", values, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjBetween(Date value1, Date value2) {
            addCriterion("cjgzsj between", value1, value2, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andCjgzsjNotBetween(Date value1, Date value2) {
            addCriterion("cjgzsj not between", value1, value2, "cjgzsj");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andRdsjIsNull() {
            addCriterion("rdsj is null");
            return (Criteria) this;
        }

        public Criteria andRdsjIsNotNull() {
            addCriterion("rdsj is not null");
            return (Criteria) this;
        }

        public Criteria andRdsjEqualTo(Date value) {
            addCriterion("rdsj =", value, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjNotEqualTo(Date value) {
            addCriterion("rdsj <>", value, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjGreaterThan(Date value) {
            addCriterion("rdsj >", value, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjGreaterThanOrEqualTo(Date value) {
            addCriterion("rdsj >=", value, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjLessThan(Date value) {
            addCriterion("rdsj <", value, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjLessThanOrEqualTo(Date value) {
            addCriterion("rdsj <=", value, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjIn(List<Date> values) {
            addCriterion("rdsj in", values, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjNotIn(List<Date> values) {
            addCriterion("rdsj not in", values, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjBetween(Date value1, Date value2) {
            addCriterion("rdsj between", value1, value2, "rdsj");
            return (Criteria) this;
        }

        public Criteria andRdsjNotBetween(Date value1, Date value2) {
            addCriterion("rdsj not between", value1, value2, "rdsj");
            return (Criteria) this;
        }

        public Criteria andDzzgxIsNull() {
            addCriterion("dzzgx is null");
            return (Criteria) this;
        }

        public Criteria andDzzgxIsNotNull() {
            addCriterion("dzzgx is not null");
            return (Criteria) this;
        }

        public Criteria andDzzgxEqualTo(String value) {
            addCriterion("dzzgx =", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxNotEqualTo(String value) {
            addCriterion("dzzgx <>", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxGreaterThan(String value) {
            addCriterion("dzzgx >", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxGreaterThanOrEqualTo(String value) {
            addCriterion("dzzgx >=", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxLessThan(String value) {
            addCriterion("dzzgx <", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxLessThanOrEqualTo(String value) {
            addCriterion("dzzgx <=", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxLike(String value) {
            addCriterion("dzzgx like", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxNotLike(String value) {
            addCriterion("dzzgx not like", value, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxIn(List<String> values) {
            addCriterion("dzzgx in", values, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxNotIn(List<String> values) {
            addCriterion("dzzgx not in", values, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxBetween(String value1, String value2) {
            addCriterion("dzzgx between", value1, value2, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andDzzgxNotBetween(String value1, String value2) {
            addCriterion("dzzgx not between", value1, value2, "dzzgx");
            return (Criteria) this;
        }

        public Criteria andGrtcIsNull() {
            addCriterion("grtc is null");
            return (Criteria) this;
        }

        public Criteria andGrtcIsNotNull() {
            addCriterion("grtc is not null");
            return (Criteria) this;
        }

        public Criteria andGrtcEqualTo(String value) {
            addCriterion("grtc =", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcNotEqualTo(String value) {
            addCriterion("grtc <>", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcGreaterThan(String value) {
            addCriterion("grtc >", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcGreaterThanOrEqualTo(String value) {
            addCriterion("grtc >=", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcLessThan(String value) {
            addCriterion("grtc <", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcLessThanOrEqualTo(String value) {
            addCriterion("grtc <=", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcLike(String value) {
            addCriterion("grtc like", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcNotLike(String value) {
            addCriterion("grtc not like", value, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcIn(List<String> values) {
            addCriterion("grtc in", values, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcNotIn(List<String> values) {
            addCriterion("grtc not in", values, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcBetween(String value1, String value2) {
            addCriterion("grtc between", value1, value2, "grtc");
            return (Criteria) this;
        }

        public Criteria andGrtcNotBetween(String value1, String value2) {
            addCriterion("grtc not between", value1, value2, "grtc");
            return (Criteria) this;
        }

        public Criteria andQxjbIsNull() {
            addCriterion("qxjb is null");
            return (Criteria) this;
        }

        public Criteria andQxjbIsNotNull() {
            addCriterion("qxjb is not null");
            return (Criteria) this;
        }

        public Criteria andQxjbEqualTo(Integer value) {
            addCriterion("qxjb =", value, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbNotEqualTo(Integer value) {
            addCriterion("qxjb <>", value, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbGreaterThan(Integer value) {
            addCriterion("qxjb >", value, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbGreaterThanOrEqualTo(Integer value) {
            addCriterion("qxjb >=", value, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbLessThan(Integer value) {
            addCriterion("qxjb <", value, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbLessThanOrEqualTo(Integer value) {
            addCriterion("qxjb <=", value, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbIn(List<Integer> values) {
            addCriterion("qxjb in", values, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbNotIn(List<Integer> values) {
            addCriterion("qxjb not in", values, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbBetween(Integer value1, Integer value2) {
            addCriterion("qxjb between", value1, value2, "qxjb");
            return (Criteria) this;
        }

        public Criteria andQxjbNotBetween(Integer value1, Integer value2) {
            addCriterion("qxjb not between", value1, value2, "qxjb");
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