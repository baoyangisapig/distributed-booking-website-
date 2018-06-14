package com.usst.mapper;

import com.usst.pojo.Ticket;

import java.util.ArrayList;

public interface TicketMapper {
    public ArrayList<Ticket> SelectAll();
    public Ticket SelectBySome(String level,String start,String end,String time);
    public  void UpdateAmount(int id);
    public  void UpdateById(String money,int amount,int id);
}
