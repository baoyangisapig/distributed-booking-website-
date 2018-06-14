package Publish.Individual;

import Publish.ServiceProvider;
import ServiceImpl.DongfangImpl;

public class PublishDongfang {
    public static void main(String[] args) throws Exception{
        ServiceProvider serviceProvider=new ServiceProvider("/company/dongfang/dongfang");
        serviceProvider.publish(new DongfangImpl(),"localhost",1349);
        System.out.print("东方航空服务器已启动\n");
    }
}
