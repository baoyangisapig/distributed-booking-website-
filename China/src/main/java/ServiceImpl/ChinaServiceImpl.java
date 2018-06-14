package ServiceImpl;

import Service.ChinaService;
import com.usst.dao.ChinaDao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChinaServiceImpl extends UnicastRemoteObject implements ChinaService {

    public ChinaServiceImpl() throws RemoteException {
    }

    public void UpdateMoney(int money, String username) throws Exception {
        new ChinaDao().UpdateMoney(money,username);

    }
}
