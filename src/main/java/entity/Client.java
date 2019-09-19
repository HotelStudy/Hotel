package entity;

public class Client {
    private int c_id;
    private String c_name;
    private String c_idname;
    private char c_gender;
    private String c_address;
    private String c_phone;
    private int create_id;
    private String create_time;
    private int update_id;
    private String update_time;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_idname() {
        return c_idname;
    }

    public void setC_idname(String c_idname) {
        this.c_idname = c_idname;
    }

    public char getC_gender() {
        return c_gender;
    }

    public void setC_gender(char c_gender) {
        this.c_gender = c_gender;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_phone() {
        return c_phone;
    }

    public void setC_phone(String c_phone) {
        this.c_phone = c_phone;
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

    public Client(int c_id, String c_name, String c_idname, char c_gender, String c_address, String c_phone, int create_id, String create_time, int update_id, String update_time) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_idname = c_idname;
        this.c_gender = c_gender;
        this.c_address = c_address;
        this.c_phone = c_phone;
        this.create_id = create_id;
        this.create_time = create_time;
        this.update_id = update_id;
        this.update_time = update_time;
    }
}
