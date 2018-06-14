package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.TicketHnMapper;
import com.usst.mapper.TicketMapper;
import com.usst.pojo.Ticket;
import com.usst.pojo.TicketHn;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

public class TicketHnDao {

    public ArrayList<TicketHn> SelectAll() throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketHnMapper ticketHnMapper=session.getMapper(TicketHnMapper.class);
        ArrayList<TicketHn> list=ticketHnMapper.SelectAll();
        return list;
    }
    public TicketHn SelectBySome(String level, String start, String end, String time)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketHnMapper ticketMapper=session.getMapper(TicketHnMapper.class);
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
        TicketHnMapper ticketMapper=session.getMapper(TicketHnMapper.class);
        ticketMapper.UpdateAmount(id);
        session.commit();
        session.close();
    }
}
