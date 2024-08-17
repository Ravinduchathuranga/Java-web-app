package model;

public class User {

    private String mobile;
    private String name;
    private String contry;

    public User(String mobile, String name, String country) {
        this.mobile = mobile;
        this.name = name;
        this.contry = country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

}
