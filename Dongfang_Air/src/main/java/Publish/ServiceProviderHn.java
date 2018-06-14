package Publish;

import org.apache.zookeeper.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.concurrent.CountDownLatch;

public class ServiceProviderHn {
    private CountDownLatch latch = new CountDownLatch(1);

    public  void publish(Remote remote, String host, int port) throws Exception
    {
        String url=publicService(remote,host,port);
        ZooKeeper zk=connectServer();
        createNode(zk,url);
    }


    public ZooKeeper connectServer() {     //获得Zookeeper连接
        ZooKeeper zk = null;
        try {
            zk = new ZooKeeper("localhost:2181", 5000, new Watcher() {

                public void process(WatchedEvent event) {
                    if (event.getState() == Event.KeeperState.SyncConnected) {
                        latch.countDown(); // 唤醒当前正在执行的线程
                    }
                }
            });
            latch.await(); // 使当前线程处于等待状态
        } catch (Exception e) {
            System.out.print(e + "");

        }
        return zk;
    }


    public String publicService(Remote remote, String host, int port) throws RemoteException, MalformedURLException {//发布任务
        LocateRegistry.createRegistry(port);
        String url="rmi://"+host+":"+port+"/"+remote.getClass().getName();
        Naming.rebind(url,remote);
        return url;
    }

    public void createNode(ZooKeeper zk,String url) throws KeeperException, InterruptedException {
        try {
            byte[] data = url.getBytes();
            String path = zk.create("/company/hainan/hainan", data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL); // 创建一个临时性且有序的 ZNode
        } catch (Exception e)
        {
            System.out.print(e+"");
        }




    }

}
