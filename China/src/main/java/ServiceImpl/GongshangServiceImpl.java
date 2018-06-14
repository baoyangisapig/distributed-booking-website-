package ServiceImpl;

import Service.GongshangService;
import com.usst.dao.GongshangDao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GongshangServiceImpl extends UnicastRemoteObject implements GongshangService {
    public GongshangServiceImpl() throws RemoteException {
    }

    public void UpdateMoney(int money, String username) throws Exception {
        new GongshangDao().UpdateMoney(money,username);
    }
}
