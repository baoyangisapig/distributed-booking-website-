package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.TicketMapper;
import com.usst.pojo.Ticket;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

public class TicketDao {
    public ArrayList<Ticket> SelectAll() throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketMapper ticketMapper=session.getMapper(TicketMapper.class);
        ArrayList<Ticket> list=ticketMapper.SelectAll();
        return list;
    }
    public Ticket SelectBySome(String level,String start,String end,String time)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketMapper ticketMapper=session.getMapper(TicketMapper.class);
        try {
            return ticketMapper.SelectBySome(level, start, end, time);
        }
        catch (Exception e)
        {
            System.out.print(e);
            return null;
        }

    }

    public void UpdateAmount(int id)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketMapper ticketMapper=session.getMapper(TicketMapper.class);
        ticketMapper.UpdateAmount(id);
        session.commit();
        session.close();
    }

    public void UpdateById(String money,int amount,int id)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketMapper ticketMapper=session.getMapper(TicketMapper.class);
        ticketMapper.UpdateById(money,amount,id);
        session.commit();
        session.close();
    }
}
