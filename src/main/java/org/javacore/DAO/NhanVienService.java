package org.javacore.DAO;

import org.javacore.Domain.NhanVien;

import java.util.Map;

public interface NhanVienService extends CRUD<NhanVien> {

    Map<String,Double> applyVouCherChoNhanVien();

    NhanVien timKiemTheoMaNV(String MaNV);

}
