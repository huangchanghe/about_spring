package com.hch.service.impl;

import com.hch.dao.BankDao;
import com.hch.service.BankService;
import org.springframework.transaction.annotation.Transactional;


public class BankServiceImpl implements BankService {

    private BankDao bankDao;

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    @Override
    public void transferAccounts(int count, int userIdA, int userIdB) {
        bankDao.outMoney(count,userIdA);
        bankDao.inMoney(count,userIdB);
    }
}
