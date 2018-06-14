package Service;

import com.usst.pojo.Ticket;

import java.rmi.Remote;

import java.util.ArrayList;

public interface Dongfang extends Remote {
   public ArrayList<Ticket> SelectAll() throws Exception;
   public  Ticket SelectBySome(String level,String start,String end,String time) throws Exception;
   public void UpdateAmount(int id)throws Exception;
   public void UpdateById(String money,int amount,int id) throws Exception;
}
