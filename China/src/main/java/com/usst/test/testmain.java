package com.usst.test;

import com.usst.dao.ChinaDao;

public class testmain {
    public static void main(String[] args) throws Exception{
        new ChinaDao().UpdateMoney(300,"user1");
    }
}
