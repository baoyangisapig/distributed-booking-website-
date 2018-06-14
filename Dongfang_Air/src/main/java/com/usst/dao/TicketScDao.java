package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.TicketMapper;
import com.usst.mapper.TicketScMapper;
import com.usst.pojo.Ticket;
import com.usst.pojo.TicketSc;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

public class TicketScDao {
    public  ArrayList<TicketSc>  SelectAll() throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketScMapper ticketScMapper=session.getMapper(TicketScMapper.class);
        return  ticketScMapper.SelectAll();
    }
    public TicketSc SelectBySome(String level, String start, String end, String time)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        TicketScMapper ticketMapper=session.getMapper(TicketScMapper.class);
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
        TicketScMapper ticketMapper=session.getMapper(TicketScMapper.class);
        ticketMapper.UpdateAmount(id);
        session.commit();
        session.close();
    }
}
