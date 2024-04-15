package com.comp208.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserState implements Serializable {
    private Integer id;

    private Integer credit;

    private BigDecimal balance;

    private Date modified;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Date getModified() {
        return modified == null ? null : (Date) modified.clone();
    }

    public void setModified(Date modified) {
        this.modified = modified == null ? null : (Date) modified.clone();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}