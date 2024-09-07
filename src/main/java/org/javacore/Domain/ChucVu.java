package org.javacore.Domain;

public class ChucVu {
    private String maCV;
    private String tenCV;
    private String moTa;

    public ChucVu(String maCV, String tenCV, String moTa) {
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.moTa = moTa;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "ChucVu{" +
                "maCV='" + maCV + '\'' +
                ", tenCV='" + tenCV + '\'' +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
