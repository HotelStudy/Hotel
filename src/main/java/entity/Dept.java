package entity;

public class Dept {
    private char d_id;
    private String d_name;

    public char getD_id() {
        return d_id;
    }

    public void setD_id(char d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Dept(char d_id, String d_name) {
        this.d_id = d_id;
        this.d_name = d_name;
    }
}
