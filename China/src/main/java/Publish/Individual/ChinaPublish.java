package Publish.Individual;

import Publish.ServiceProvider;
import ServiceImpl.ChinaServiceImpl;

public class ChinaPublish {
    public static void main(String[] args) throws Exception{
        ServiceProvider serviceProvider=new ServiceProvider();
        serviceProvider.publish(new ChinaServiceImpl(),"localhost",1300);
        System.out.println("中国银行服务器已启动");
    }
}
