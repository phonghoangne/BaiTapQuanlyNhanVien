package org.javacore.Domain;

import java.sql.Date;

public class LichSuLamViec {
    private String maNV;
    private String tenPB;
    private java.sql.Date ngayChuyen; //  ngay chuyen phong ban

    public LichSuLamViec(String maNV, String tenPB, Date ngayChuyen) {
        this.maNV = maNV;
        this.tenPB = tenPB;
        this.ngayChuyen = ngayChuyen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public Date getNgayChuyen() {
        return ngayChuyen;
    }

    public void setNgayChuyen(Date ngayChuyen) {
        this.ngayChuyen = ngayChuyen;
    }

    @Override
    public String toString() {
        return "LichSuLamViec{" +
                "maNV='" + maNV + '\'' +
                ", tenPB='" + tenPB + '\'' +
                ", ngayChuyen=" + ngayChuyen +
                '}';
    }
}
