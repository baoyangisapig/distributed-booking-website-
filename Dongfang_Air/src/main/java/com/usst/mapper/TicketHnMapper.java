package com.usst.mapper;

import com.usst.pojo.Ticket;
import com.usst.pojo.TicketHn;

import java.util.ArrayList;

public interface TicketHnMapper {
    public ArrayList<TicketHn> SelectAll();
    public TicketHn SelectBySome(String level, String start, String end, String time);
    public  void UpdateAmount(int id);
}
