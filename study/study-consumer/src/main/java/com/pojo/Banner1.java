package com.pojo;

import java.io.Serializable;

public class Banner1 implements Serializable {
    private int bid;

    private String bname;

    private String bdescription;

    private String bpic;

    private String btarget;

    private String bstatus;

    private int btype;

    private int bshort;

    @Override
    public String toString() {
        return "Banner1{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bdescription='" + bdescription + '\'' +
                ", bpic='" + bpic + '\'' +
                ", btarget='" + btarget + '\'' +
                ", bstatus='" + bstatus + '\'' +
                ", btype=" + btype +
                ", bshort=" + bshort +
                '}';
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBdescription() {
        return bdescription;
    }

    public void setBdescription(String bdescription) {
        this.bdescription = bdescription;
    }

    public String getBpic() {
        return bpic;
    }

    public void setBpic(String bpic) {
        this.bpic = bpic;
    }

    public String getBtarget() {
        return btarget;
    }

    public void setBtarget(String btarget) {
        this.btarget = btarget;
    }

    public String getBstatus() {
        return bstatus;
    }

    public void setBstatus(String bstatus) {
        this.bstatus = bstatus;
    }

    public int getBtype() {
        return btype;
    }

    public void setBtype(int btype) {
        this.btype = btype;
    }

    public int getBshort() {
        return bshort;
    }

    public void setBshort(int bshort) {
        this.bshort = bshort;
    }

    public Banner1() {
    }

    public Banner1(int bid, String bname, String bdescription, String bpic, String btarget, String bstatus, int btype, int bshort) {
        this.bid = bid;
        this.bname = bname;
        this.bdescription = bdescription;
        this.bpic = bpic;
        this.btarget = btarget;
        this.bstatus = bstatus;
        this.btype = btype;
        this.bshort = bshort;
    }
}
