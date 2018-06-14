package ServiceImpl;

import Service.Sichuan;
import com.usst.dao.TicketScDao;
import com.usst.pojo.TicketSc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class SichuanImpl extends UnicastRemoteObject implements Sichuan {
    public SichuanImpl() throws RemoteException {
    }

    public ArrayList<TicketSc> SelectAll() throws Exception {
        return new TicketScDao().SelectAll();
    }

    public TicketSc SelectBySome(String level, String start, String end, String time) throws Exception {
        return new TicketScDao().SelectBySome(level,start,end,time);
    }

    public void UpdateAmount(int id) throws Exception {
        new TicketScDao().UpdateAmount(id);

    }
}
