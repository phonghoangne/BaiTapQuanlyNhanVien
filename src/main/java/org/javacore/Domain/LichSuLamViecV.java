package org.javacore.Domain;

import java.util.Date;

public class LichSuLamViecV {
    private String HoTen;
    private String MaNv;
    private String TenPB;
    private String MaPB;
    private String date;

    public LichSuLamViecV() {
    }

    public LichSuLamViecV(String hoTen, String maNv, String tenPB, String maPB, String date) {
        HoTen = hoTen;
        MaNv = maNv;
        TenPB = tenPB;
        MaPB = maPB;
        this.date = date;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String maNv) {
        MaNv = maNv;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String tenPB) {
        TenPB = tenPB;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String maPB) {
        MaPB = maPB;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LichSuLamViecV{" +
                "HoTen='" + HoTen + '\'' +
                ", MaNv='" + MaNv + '\'' +
                ", TenPB='" + TenPB + '\'' +
                ", MaPB='" + MaPB + '\'' +
                ", date=" + date +
                '}';
    }
}
