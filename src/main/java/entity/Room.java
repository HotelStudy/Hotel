package entity;

public class Room {
    private String r_id;
    private String r_typeid;
    private String r_place;
    private char r_eastate;
    private int create_id;
    private String create_time;
    private int update_id;
    private String update_time;

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public String getR_typeid() {
        return r_typeid;
    }

    public void setR_typeid(String r_typeid) {
        this.r_typeid = r_typeid;
    }

    public String getR_place() {
        return r_place;
    }

    public void setR_place(String r_place) {
        this.r_place = r_place;
    }

    public char getR_eastate() {
        return r_eastate;
    }

    public void setR_eastate(char r_eastate) {
        this.r_eastate = r_eastate;
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

    public Room(String r_id, String r_typeid, String r_place, char r_eastate, int create_id, String create_time, int update_id, String update_time) {
        this.r_id = r_id;
        this.r_typeid = r_typeid;
        this.r_place = r_place;
        this.r_eastate = r_eastate;
        this.create_id = create_id;
        this.create_time = create_time;
        this.update_id = update_id;
        this.update_time = update_time;
    }
}
