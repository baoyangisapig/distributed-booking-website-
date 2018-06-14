package com.usst.pojo;

import java.io.Serializable;

public class TicketSc implements Serializable {
    private int id;
    private int level;
    private  String end;
    private  String start;
    private int money;
    private String flightnumber;
    private String name;
    private String time;
    private  int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFilghtnumber(String filght) {
        this.flightnumber=flightnumber;
    }
}
