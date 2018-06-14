package Service;

import com.usst.pojo.Ticket;
import com.usst.pojo.TicketGj;

import java.rmi.Remote;
import java.util.ArrayList;

public interface Guoji extends Remote {
    ArrayList<TicketGj> SelectAll() throws Exception;
    public TicketGj SelectBySome(String level, String start, String end, String time) throws Exception;
    public void UpdateAmount(int id)throws Exception;
}
