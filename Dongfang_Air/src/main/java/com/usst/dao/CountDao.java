package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.CountMapper;
import org.apache.ibatis.session.SqlSession;

public class CountDao {
    public String SelectById(int id) throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        CountMapper countMapper=session.getMapper(CountMapper.class);
        return countMapper.SelectById(id);
    }
}
