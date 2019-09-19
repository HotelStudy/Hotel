package entity;

import java.util.Date;

public class Emp {
    private int e_id;
    private String e_loginname;
    private String e_password;
    private String e_realname;
    private int e_age;
    private Date e_hiredate;
    private String d_id;
    private int create_id;
    private String create_time;
    private int update_id;
    private String update_time;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_loginname() {
        return e_loginname;
    }

    public void setE_loginname(String e_loginname) {
        this.e_loginname = e_loginname;
    }

    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }

    public String getE_realname() {
        return e_realname;
    }

    public void setE_realname(String e_realname) {
        this.e_realname = e_realname;
    }

    public int getE_age() {
        return e_age;
    }

    public void setE_age(int e_age) {
        this.e_age = e_age;
    }

    public Date getE_hiredate() {
        return e_hiredate;
    }

    public void setE_hiredate(Date e_hiredate) {
        this.e_hiredate = e_hiredate;
    }

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
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

    public Emp(int e_id, String e_loginname, String e_password, String e_realname, int e_age, Date e_hiredate, String d_id, int create_id, String create_time, int update_id, String update_time) {
        this.e_id = e_id;
        this.e_loginname = e_loginname;
        this.e_password = e_password;
        this.e_realname = e_realname;
        this.e_age = e_age;
        this.e_hiredate = e_hiredate;
        this.d_id = d_id;
        this.create_id = create_id;
        this.create_time = create_time;
        this.update_id = update_id;
        this.update_time = update_time;
    }
}
