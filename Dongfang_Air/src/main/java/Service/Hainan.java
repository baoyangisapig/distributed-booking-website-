package Service;

import com.usst.pojo.Ticket;
import com.usst.pojo.TicketHn;


import java.rmi.Remote;
import java.util.ArrayList;

public interface Hainan extends Remote {
    public ArrayList<TicketHn> SelectAll() throws Exception ;
    public TicketHn SelectBySome(String level, String start, String end, String time) throws Exception;
    public void UpdateAmount(int id)throws Exception;
}
