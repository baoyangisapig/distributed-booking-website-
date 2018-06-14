package ServiceImpl;

import Service.NongyeService;
import com.usst.dao.NongyeDao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NongyeServiceImpl extends UnicastRemoteObject implements NongyeService {
   public NongyeServiceImpl() throws RemoteException {
    }

    public void UpdateMoney(int money, String username) throws Exception {
        new NongyeDao().UpdateMoney(money,username);
    }
}
