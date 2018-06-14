package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.TicketGjMapper;
import com.usst.mapper.TicketMapper;
import com.usst.pojo.Ticket;
import com.usst.pojo.TicketGj;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

public class TicketGjDao {
    public ArrayList<TicketGj> SelectAll() throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketGjMapper ticketGjMapper=session.getMapper(TicketGjMapper.class);
        return  ticketGjMapper.SelectAll();
    }
    public TicketGj SelectBySome(String level, String start, String end, String time)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketGjMapper ticketMapper=session.getMapper(TicketGjMapper.class);
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
        TicketGjMapper ticketMapper=session.getMapper(TicketGjMapper.class);
        ticketMapper.UpdateAmount(id);
        session.commit();
        session.close();
    }
}
