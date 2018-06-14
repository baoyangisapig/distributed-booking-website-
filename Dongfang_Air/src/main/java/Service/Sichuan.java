package Service;

import com.usst.pojo.Ticket;
import com.usst.pojo.TicketSc;

import java.rmi.Remote;
import java.util.ArrayList;

public interface Sichuan extends Remote {
    public ArrayList<TicketSc> SelectAll() throws Exception;
    public TicketSc SelectBySome(String level, String start, String end, String time) throws Exception;
    public void UpdateAmount(int id)throws Exception;

}
