package org.javacore.Domain;

import java.sql.Date;

public class Luong {
    private String maNV;
    private String mucLuong;
    private java.sql.Date ngayBatDau;
    private java.sql.Date ngayKetThuc;

    public Luong(String maNV, String mucLuong, Date ngayBatDau, Date ngayKetThuc) {
        this.maNV = maNV;
        this.mucLuong = mucLuong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(String mucLuong) {
        this.mucLuong = mucLuong;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "Luong{" +
                "maNV='" + maNV + '\'' +
                ", mucLuong='" + mucLuong + '\'' +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                '}';
    }
}
