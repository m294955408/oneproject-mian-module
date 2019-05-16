package com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.model;

import java.util.ArrayList;
import java.util.List;

public class AccountDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public AccountDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
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
            addCriterion("a.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("a.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("a.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("a.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("a.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("a.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("a.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("a.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("a.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("a.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("a.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("a.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordIsNull() {
            addCriterion("a.encrypted_password is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordIsNotNull() {
            addCriterion("a.encrypted_password is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordEqualTo(String value) {
            addCriterion("a.encrypted_password =", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotEqualTo(String value) {
            addCriterion("a.encrypted_password <>", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordGreaterThan(String value) {
            addCriterion("a.encrypted_password >", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("a.encrypted_password >=", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordLessThan(String value) {
            addCriterion("a.encrypted_password <", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordLessThanOrEqualTo(String value) {
            addCriterion("a.encrypted_password <=", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordLike(String value) {
            addCriterion("a.encrypted_password like", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotLike(String value) {
            addCriterion("a.encrypted_password not like", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordIn(List<String> values) {
            addCriterion("a.encrypted_password in", values, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotIn(List<String> values) {
            addCriterion("a.encrypted_password not in", values, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordBetween(String value1, String value2) {
            addCriterion("a.encrypted_password between", value1, value2, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotBetween(String value1, String value2) {
            addCriterion("a.encrypted_password not between", value1, value2, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNull() {
            addCriterion("a.password_salt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNotNull() {
            addCriterion("a.password_salt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltEqualTo(String value) {
            addCriterion("a.password_salt =", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotEqualTo(String value) {
            addCriterion("a.password_salt <>", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThan(String value) {
            addCriterion("a.password_salt >", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThanOrEqualTo(String value) {
            addCriterion("a.password_salt >=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThan(String value) {
            addCriterion("a.password_salt <", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThanOrEqualTo(String value) {
            addCriterion("a.password_salt <=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLike(String value) {
            addCriterion("a.password_salt like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotLike(String value) {
            addCriterion("a.password_salt not like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIn(List<String> values) {
            addCriterion("a.password_salt in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotIn(List<String> values) {
            addCriterion("a.password_salt not in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltBetween(String value1, String value2) {
            addCriterion("a.password_salt between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotBetween(String value1, String value2) {
            addCriterion("a.password_salt not between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_account
     *
     * @mbg.generated do_not_delete_during_merge Fri May 10 18:34:58 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
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