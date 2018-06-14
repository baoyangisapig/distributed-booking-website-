package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.ChinaMapper;
import com.usst.mapper.NongyeMapper;
import org.apache.ibatis.session.SqlSession;

public class NongyeDao {
    public void UpdateMoney(int money,String username)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        NongyeMapper nongyeMapper=session.getMapper(NongyeMapper.class);
        nongyeMapper.UpdateMoney(money,username);
        session.commit();
        session.close();
    }
}
