package ServiceImpl;

import Service.Dongfang;
import com.usst.dao.TicketDao;
import com.usst.pojo.Ticket;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class DongfangImpl extends UnicastRemoteObject implements Dongfang {

    public DongfangImpl() throws RemoteException {
    }
    private  TicketDao ticketDao=new TicketDao();
    public ArrayList<Ticket> SelectAll() throws Exception {

        ArrayList<Ticket> list=ticketDao.SelectAll();
        return list;
    }

    public Ticket SelectBySome(String level,String start,String end,String time) throws Exception {
        return ticketDao.SelectBySome(level,start,end,time) ;
    }

    public void UpdateAmount(int id) throws Exception {
        ticketDao.UpdateAmount(id);
    }

    public void UpdateById(String money, int amount, int id) throws Exception {
        ticketDao.UpdateById(money,amount,id);
    }

}
