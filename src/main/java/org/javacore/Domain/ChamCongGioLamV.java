package org.javacore.Domain;

public class ChamCongGioLamV {
    private String maNV;
    private String hoTen;
    private double soGioLamViec;

    public ChamCongGioLamV(String maNV, String hoTen, double soGioLamViec) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.soGioLamViec = soGioLamViec;
    }

    public ChamCongGioLamV() {

    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return "ChamCongGioLamV{" +
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soGioLamViec=" + soGioLamViec +
                '}';
    }
}
