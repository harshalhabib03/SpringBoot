package com.reqresp.map5.controller;

public class User {
    private Integer eid;
    private String ename;
    private String eloc;

    public User() {
    }

    public User(Integer eid) {
        this.eid = eid;
    }

    public User(String ename, String eloc) {
        this.ename = ename;
        this.eloc = eloc;
    }

    public User(Integer eid, String ename, String eloc) {
        this.eid = eid;
        this.ename = ename;
        this.eloc = eloc;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEloc() {
        return eloc;
    }

    public void setEloc(String eloc) {
        this.eloc = eloc;
    }

    @Override
    public String toString() {
        return "User{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eloc='" + eloc + '\'' +
                '}';
    }
}
