package com.bwei.demo.dao;

import com.bwei.demo.po.Transaction;

public interface TransactionMapper {
    int deleteByPrimaryKey(String txid);

  

    int insertSelective(Transaction record);

    Transaction selectByPrimaryKey(String txid);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);

    int truncate();

    int insert(Transaction transaction);
}