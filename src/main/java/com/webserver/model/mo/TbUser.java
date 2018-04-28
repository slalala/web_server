package com.webserver.model.mo;

public class TbUser {
    private Long id;
    private String userName;
    private Long iphone;
    private String salt;
    private String pass;

    public TbUser() {
    }

    public TbUser(String userName, Long iphone, String salt, String pass) {
        this.userName = userName;
        this.iphone = iphone;
        this.salt = salt;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", iphone=" + iphone +
                ", salt='" + salt + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getIphone() {
        return iphone;
    }

    public void setIphone(Long iphone) {
        this.iphone = iphone;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
