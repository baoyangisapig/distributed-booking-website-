package com.usst.mapper;

import com.usst.pojo.TicketSc;

import java.util.ArrayList;

public interface TicketScMapper {
    public ArrayList<TicketSc> SelectAll();
    public TicketSc SelectBySome(String level,String start,String end,String time);
    public  void UpdateAmount(int id);
}
