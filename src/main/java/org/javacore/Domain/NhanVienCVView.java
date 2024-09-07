package org.javacore.Domain;

public class NhanVienCVView {
    private String tenCV;
    private String maCv;
    private Integer slnv;

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public Integer getSlnv() {
        return slnv;
    }

    public void setSlnv(Integer slnv) {
        this.slnv = slnv;
    }

    @Override
    public String toString() {
        return "CountNhanVienCV{" +
                "tenCV='" + tenCV + '\'' +
                ", maCv='" + maCv + '\'' +
                ", slnv=" + slnv +
                '}';
    }
}
