package com.shop.bean;

public class Busertable {
    private Integer id;

    private String bemail;

    private String bpwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBemail() {
        return bemail;
    }

    public void setBemail(String bemail) {
        this.bemail = bemail == null ? null : bemail.trim();
    }

    public String getBpwd() {
        return bpwd;
    }

    public void setBpwd(String bpwd) {
        this.bpwd = bpwd == null ? null : bpwd.trim();
    }
}