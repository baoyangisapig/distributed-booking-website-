package Publish.Individual;

import Publish.ServiceProvider1;
import ServiceImpl.NongyeServiceImpl;

public class GongshangPublish {
    public static void main(String[] args) throws Exception {
        ServiceProvider1 serviceProvider1=new ServiceProvider1();
        serviceProvider1.publish(new NongyeServiceImpl(),"localhost",1301);
        System.out.println("中国农业银行服务器已启动");
    }
}
