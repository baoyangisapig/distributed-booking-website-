package com.usst.dao;

import com.usst.SessionFactory.SessionBuilder;
import com.usst.mapper.ChinaMapper;
import com.usst.mapper.GongshangMapper;
import org.apache.ibatis.session.SqlSession;

public class GongshangDao {
    public void UpdateMoney(int money,String username)throws Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        GongshangMapper gongshangMapper=session.getMapper(GongshangMapper.class);
        gongshangMapper.UpdateMoney(money,username);
        session.commit();
        session.close();
    }
}
