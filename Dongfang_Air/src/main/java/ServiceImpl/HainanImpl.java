package ServiceImpl;

import Service.Hainan;
import com.usst.dao.TicketHnDao;
import com.usst.pojo.TicketHn;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class HainanImpl extends UnicastRemoteObject implements Hainan {

    public HainanImpl() throws RemoteException {
    }

    public ArrayList<TicketHn> SelectAll() throws Exception {
        return new TicketHnDao().SelectAll();
    }

    public TicketHn SelectBySome(String level, String start, String end, String time) throws Exception {
        return new TicketHnDao().SelectBySome(level,start,end,time);
    }

    public void UpdateAmount(int id) throws Exception {
        new TicketHnDao().UpdateAmount(id);
    }
}
