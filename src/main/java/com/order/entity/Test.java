package com.order.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Test {
    private Integer a;

    private Byte e;

    private BigDecimal c;

    private String b;

    private Date d;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Byte getE() {
        return e;
    }

    public void setE(Byte e) {
        this.e = e;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }
}