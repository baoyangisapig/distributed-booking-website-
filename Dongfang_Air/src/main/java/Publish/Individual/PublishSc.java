package Publish.Individual;

import Publish.ServiceProvider;
import Publish.ServiceProviderSc;
import ServiceImpl.SichuanImpl;

public class PublishSc {
    public static void main(String[] args) throws Exception{
        ServiceProvider serviceProvider=new ServiceProvider("/company/sichuan/sichuan");
        serviceProvider.publish(new SichuanImpl(),"localhost",1352);
        System.out.println("四川航空服务器已启动");
    }
}
