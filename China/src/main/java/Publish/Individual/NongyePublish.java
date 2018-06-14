package Publish.Individual;

import Publish.ServiceProvider2;
import ServiceImpl.GongshangServiceImpl;

public class NongyePublish {
    public static void main(String[] args) throws Exception{
        ServiceProvider2 serviceProvider2=new ServiceProvider2();
        serviceProvider2.publish(new GongshangServiceImpl(),"localhost",1302);
        System.out.println("中国工商银行服务器已启动");
    }
}
