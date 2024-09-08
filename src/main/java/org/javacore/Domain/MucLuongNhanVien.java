package org.javacore.Domain;

public class MucLuongNhanVien {
    private String tenNhanVien;
    private String tenChucVu;
    private String diaChi;
    private Integer phone;
    private Double mucLuong;

    public MucLuongNhanVien() {
    }

    public MucLuongNhanVien(String tenNhanVien, String tenChucVu, String diaChi, Integer phone, Double mucLuong) {
        this.tenNhanVien = tenNhanVien;
        this.tenChucVu = tenChucVu;
        this.diaChi = diaChi;
        this.phone = phone;
        this.mucLuong = mucLuong;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(Double mucLuong) {
        this.mucLuong = mucLuong;
    }

    @Override
    public String toString() {
        return "MucLuongNhanVien{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", tenChucVu='" + tenChucVu + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", phone=" + phone +
                ", mucLuong=" + mucLuong +
                '}';
    }
}
