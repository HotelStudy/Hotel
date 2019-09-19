package entity;

public class RType {
    private String r_typeid;
    private String r_typename;
    private Double r_typecost;

    public String getR_typeid() {
        return r_typeid;
    }

    public void setR_typeid(String r_typeid) {
        this.r_typeid = r_typeid;
    }

    public String getR_typename() {
        return r_typename;
    }

    public void setR_typename(String r_typename) {
        this.r_typename = r_typename;
    }

    public Double getR_typecost() {
        return r_typecost;
    }

    public void setR_typecost(Double r_typecost) {
        this.r_typecost = r_typecost;
    }

    public RType(String r_typeid, String r_typename, Double r_typecost) {
        this.r_typeid = r_typeid;
        this.r_typename = r_typename;
        this.r_typecost = r_typecost;
    }
}
