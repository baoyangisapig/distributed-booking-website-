package Service;

import java.rmi.Remote;

public interface NongyeService extends Remote {
    public  void UpdateMoney(int money,String username)throws Exception;
}
