package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.ChinaMapper;
import org.apache.ibatis.session.SqlSession;

public class ChinaDao {
    public void UpdateMoney(int money,String username)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        ChinaMapper chinaMapper=session.getMapper(ChinaMapper.class);
        chinaMapper.UpdateMoney(money,username);
        session.commit();
        session.close();
    }
}
