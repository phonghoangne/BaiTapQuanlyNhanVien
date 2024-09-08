package org.javacore.Domain;

import java.sql.Date;

public class Luong {
    private String maNV;
    private Double mucLuong;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    private String applyVoucher;
    public Luong() {
    }

    public Luong(String maNV, Double mucLuong, Date ngayBatDau, Date ngayKetThuc,String applyVoucher) {
        this.maNV = maNV;
        this.mucLuong = mucLuong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.applyVoucher = applyVoucher;
    }

    public String getApplyVoucher() {
        return applyVoucher;
    }

    public void setApplyVoucher(String applyVoucher) {
        this.applyVoucher = applyVoucher;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(Double mucLuong) {
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
