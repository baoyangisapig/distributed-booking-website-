package com.usst.mapper;

import com.usst.pojo.Ticket;
import com.usst.pojo.TicketGj;

import java.util.ArrayList;

public interface TicketGjMapper {
    public ArrayList<TicketGj> SelectAll();
    public TicketGj SelectBySome(String level, String start, String end, String time);
    public  void UpdateAmount(int id);
}
