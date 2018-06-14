package Publish;

import ServiceImpl.DongfangImpl;
import ServiceImpl.GuojiImpl;
import ServiceImpl.HainanImpl;
import ServiceImpl.SichuanImpl;

import java.rmi.RemoteException;

public class PublishAll
{

    public static void main(String[] args)throws Exception {
        ServiceProvider serviceProvider1=new ServiceProvider("/company/dongfang_guard/dongfang_guard");
        ServiceProvider serviceProvider2=new ServiceProvider("/company/guoji_guard/guoji_guard");
        ServiceProvider serviceProvider3=new ServiceProvider("/company/hainan_guard/hainan_guard");
        ServiceProvider serviceProvider4=new ServiceProvider("/company/sichuan_guard/sichuan_guard");
        serviceProvider1.publish(new DongfangImpl(),"localhost",1400);

        serviceProvider2.publish(new GuojiImpl(),"localhost",1401);

        serviceProvider3.publish(new HainanImpl(),"localhost",1402);

        serviceProvider4.publish(new SichuanImpl(),"localhost",1403);
        System.out.println("守护进程开启，临时服务器发布");
    }



}
