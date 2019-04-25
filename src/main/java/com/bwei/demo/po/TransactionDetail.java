package com.bwei.demo.po;

import java.math.BigInteger;

public class TransactionDetail extends TransactionDetailKey {


    private Byte type;

    private Double amount;


    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}