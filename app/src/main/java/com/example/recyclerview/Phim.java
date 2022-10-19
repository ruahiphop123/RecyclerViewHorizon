package com.example.recyclerview;


public class Phim {
    String ten;
    Integer hinhAnh;

    public Phim(String ten, Integer hinhAnh) {
        this.ten = ten;
        this.hinhAnh = hinhAnh;
    }

    public  Phim(){

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public Integer getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(Integer hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
