package entity;

import java.util.Date;

public class Check {
    private String ch_id;
    private int c_id;
    private String r_id;
    private Date ch_indate;
    private Date ch_outdate;
    private Double ch_deposit;
    private char ch_internet;
    private int create_id;
    private String create_time;
    private int update_id;
    private String update_time;

    public String getCh_id() {
        return ch_id;
    }

    public void setCh_id(String ch_id) {
        this.ch_id = ch_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public Date getCh_indate() {
        return ch_indate;
    }

    public void setCh_indate(Date ch_indate) {
        this.ch_indate = ch_indate;
    }

    public Date getCh_outdate() {
        return ch_outdate;
    }

    public void setCh_outdate(Date ch_outdate) {
        this.ch_outdate = ch_outdate;
    }

    public Double getCh_deposit() {
        return ch_deposit;
    }

    public void setCh_deposit(Double ch_deposit) {
        this.ch_deposit = ch_deposit;
    }

    public char getCh_internet() {
        return ch_internet;
    }

    public void setCh_internet(char ch_internet) {
        this.ch_internet = ch_internet;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Check(String ch_id, int c_id, String r_id, Date ch_indate, Date ch_outdate, Double ch_deposit, char ch_internet, int create_id, String create_time, int update_id, String update_time) {
        this.ch_id = ch_id;
        this.c_id = c_id;
        this.r_id = r_id;
        this.ch_indate = ch_indate;
        this.ch_outdate = ch_outdate;
        this.ch_deposit = ch_deposit;
        this.ch_internet = ch_internet;
        this.create_id = create_id;
        this.create_time = create_time;
        this.update_id = update_id;
        this.update_time = update_time;
    }
}
