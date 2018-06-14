package Publish.Individual;

import Publish.ServiceProvider;
import Publish.ServiceProviderHn;
import ServiceImpl.HainanImpl;

public class PublishHainan {
    public static void main(String[] args)throws Exception {
        ServiceProvider serviceProvider=new ServiceProvider("/company/hainan/hainan");
        serviceProvider.publish(new HainanImpl(),"localhost",1351);
        System.out.println("海南航空服务器已启动");
    }
}
