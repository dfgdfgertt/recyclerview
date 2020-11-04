package com.example.recyclerview;

import java.io.Serializable;

public class product implements Serializable {
    private String ten;
    private String chitietsp;
    private int gia;
    private int avt;

    public String getChitietsp() {
        return chitietsp;
    }

    public void setChitietsp(String chitietsp) {
        this.chitietsp = chitietsp;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public int getAvt() {
        return avt;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }

    public product(String ten) {
        this.ten = ten;
    }

    public product(String ten, String chitietsp, int gia, int avt) {
        this.ten = ten;
        this.chitietsp = chitietsp;
        this.gia = gia;
        this.avt = avt;
    }
}
