package org.javacore.Domain;

public class PhongBan {
    private String maPB;
    private String tenPB;
    private String moTa;

    public PhongBan(String maPB, String tenPB, String moTa) {
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.moTa = moTa;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "PhongBan{" +
                "maPB='" + maPB + '\'' +
                ", tenPB='" + tenPB + '\'' +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
