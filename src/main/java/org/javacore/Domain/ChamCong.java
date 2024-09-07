package org.javacore.Domain;

import java.sql.Date;
import java.sql.Time;

public class ChamCong {
    private String maChamCong;
    private String maNV;
    private Date ngayChamCong;
    private Time gioBatDau;
    private Time gioketThuc;
    private String trangThai;

    public ChamCong(String maChamCong, String maNV, Date ngayChamCong, Time gioBatDau, Time gioketThuc, String trangThai) {
        this.maChamCong = maChamCong;
        this.maNV = maNV;
        this.ngayChamCong = ngayChamCong;
        this.gioBatDau = gioBatDau;
        this.gioketThuc = gioketThuc;
        this.trangThai = trangThai;
    }

    public String getMaChamCong() {
        return maChamCong;
    }

    public void setMaChamCong(String maChamCong) {
        this.maChamCong = maChamCong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayChamCong() {
        return ngayChamCong;
    }

    public void setNgayChamCong(Date ngayChamCong) {
        this.ngayChamCong = ngayChamCong;
    }

    public Time getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(Time gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public Time getGioketThuc() {
        return gioketThuc;
    }

    public void setGioketThuc(Time gioketThuc) {
        this.gioketThuc = gioketThuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChamCong{" +
                "maChamCong='" + maChamCong + '\'' +
                ", maNV='" + maNV + '\'' +
                ", ngayChamCong=" + ngayChamCong +
                ", gioBatDau=" + gioBatDau +
                ", gioketThuc=" + gioketThuc +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
