package Publish.Individual;

import Publish.ServiceProvider;
import Publish.ServiceProviderGj;
import ServiceImpl.GuojiImpl;

public class PublishGuoji {
    public static void main(String[] args)throws Exception {
        ServiceProvider serviceProvider=new ServiceProvider("/company/guoji/guoji");
        serviceProvider.publish(new GuojiImpl(),"localhost",1350);
        System.out.println("国际航空服务器已启动");
    }
}
