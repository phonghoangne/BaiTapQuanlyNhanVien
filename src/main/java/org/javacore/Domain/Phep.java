package org.javacore.Domain;

import java.sql.Date;

public class Phep {
    private int maPhep;
    private String maNV;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String loaiPhep;
    private String lyDo;
    private String trangThai;

    public Phep(int maPhep, String maNV, Date ngayBatDau, Date ngayKetThuc, String loaiPhep, String lyDo, String trangThai) {
        this.maPhep = maPhep;
        this.maNV = maNV;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.loaiPhep = loaiPhep;
        this.lyDo = lyDo;
        this.trangThai = trangThai;
    }

    public int getMaPhep() {
        return maPhep;
    }

    public void setMaPhep(int maPhep) {
        this.maPhep = maPhep;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
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

    public String getLoaiPhep() {
        return loaiPhep;
    }

    public void setLoaiPhep(String loaiPhep) {
        this.loaiPhep = loaiPhep;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Phep{" +
                "maPhep=" + maPhep +
                ", maNV='" + maNV + '\'' +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", loaiPhep='" + loaiPhep + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
