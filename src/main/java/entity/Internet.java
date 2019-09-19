package entity;

import java.util.Date;

public class Internet {
    private int i_id;
    private String r_id;
    private int c_id;
    private Date i_ontime;
    private Date i_offtime;
    private int create_id;
    private String create_time;
    private int update_id;
    private String update_time;

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public Date getI_ontime() {
        return i_ontime;
    }

    public void setI_ontime(Date i_ontime) {
        this.i_ontime = i_ontime;
    }

    public Date getI_offtime() {
        return i_offtime;
    }

    public void setI_offtime(Date i_offtime) {
        this.i_offtime = i_offtime;
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

    public Internet(int i_id, String r_id, int c_id, Date i_ontime, Date i_offtime, int create_id, String create_time, int update_id, String update_time) {
        this.i_id = i_id;
        this.r_id = r_id;
        this.c_id = c_id;
        this.i_ontime = i_ontime;
        this.i_offtime = i_offtime;
        this.create_id = create_id;
        this.create_time = create_time;
        this.update_id = update_id;
        this.update_time = update_time;
    }
}
