package ServiceImpl;

import Service.Guoji;
import com.usst.dao.TicketGjDao;
import com.usst.pojo.TicketGj;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class GuojiImpl extends UnicastRemoteObject implements Guoji {
    public GuojiImpl() throws RemoteException {
    }

    public ArrayList<TicketGj> SelectAll() throws Exception{
        return new TicketGjDao().SelectAll();
    }

    public TicketGj SelectBySome(String level, String start, String end, String time) throws Exception {
        return new TicketGjDao().SelectBySome(level,start,end,time);
    }

    public void UpdateAmount(int id) throws Exception {
            new TicketGjDao().UpdateAmount(id);
    }


}
