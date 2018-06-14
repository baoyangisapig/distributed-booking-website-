package com.usst.test;

import com.usst.dao.TicketDao;
import com.usst.dao.TicketGjDao;
import com.usst.dao.TicketScDao;
import com.usst.pojo.TicketGj;
import com.usst.pojo.TicketSc;

import java.util.ArrayList;

public class testmain {
    public static void main(String[] args) throws Exception {

     /*   System.out.println(new TicketGjDao().SelectAll().get(0).getFlightnumber());*/
        new TicketDao().UpdateById("1900",190,1);
    }
}
