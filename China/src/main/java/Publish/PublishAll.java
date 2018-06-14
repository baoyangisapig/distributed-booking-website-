package Publish;

import ServiceImpl.ChinaServiceImpl;
import ServiceImpl.GongshangServiceImpl;
import ServiceImpl.NongyeServiceImpl;

import java.rmi.RemoteException;

public class PublishAll {
    public static void main(String[] args) throws Exception {
        ServiceProvider serviceProvider=new ServiceProvider();
        serviceProvider.publish(new ChinaServiceImpl(),"localhost",1300);
        System.out.println("中国银行服务器已启动");
        Thread.sleep(100);
        ServiceProvider1 serviceProvider1=new ServiceProvider1();
        serviceProvider1.publish(new NongyeServiceImpl(),"localhost",1301);
        System.out.println("中国农业银行服务器已启动");
        Thread.sleep(100);
        ServiceProvider2 serviceProvider2=new ServiceProvider2();
        serviceProvider2.publish(new GongshangServiceImpl(),"localhost",1302);
        System.out.println("中国工商银行服务器已启动");

    }
}
