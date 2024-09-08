package org.javacore.DAO;

import org.javacore.Domain.Luong;

import java.util.Map;

public interface LuongService extends CRUD<Luong> {

    Double AvgSalary();

    Boolean UpdateLuong(String manv,Double voucherThuong);

    Boolean UpdateAllLuong(Map<String,Double> listLuong);

    Luong timLuongTheoMaNV(String manv);
}
