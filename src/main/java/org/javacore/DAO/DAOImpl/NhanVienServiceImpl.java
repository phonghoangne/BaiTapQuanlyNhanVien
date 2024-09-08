package org.javacore.DAO.DAOImpl;

import org.javacore.DAO.CRUD;
import org.javacore.DAO.NhanVienService;
import org.javacore.Domain.Luong;
import org.javacore.Domain.NhanVien;
import org.javacore.Exception.QLNVExceptionException;
import org.javacore.Helper.Ultils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NhanVienServiceImpl implements NhanVienService {

    StringBuilder sql ;
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    @Override
    public Boolean insert(NhanVien nhanVien)
    {
        return null;
    }

    @Override
    public Boolean update(NhanVien nhanVien) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    @Override
    public List<NhanVien> read() {

        return null;
    }


    @Override
    public Map<String, Double> applyVouCherChoNhanVien() {
        Map<String,Double> dataReponse = new HashMap<>();
        sql = new StringBuilder("SELECT")
                .append(" MANV, ")
                .append(" CASE ")
                .append("   WHEN timestampdiff(YEAR ,NgayBatDauLam,curdate()) > 5 THEN 5000000.00")
                .append(" WHEN  timestampdiff(YEAR ,NgayBatDauLam,curdate())  between 1 and 5 then 3000000.00 ")
                .append(" WHEN  timestampdiff(YEAR ,NgayBatDauLam,curdate()) = 1 then 1000000.00")
                .append(" ELSE 0 end as voucher")
                .append(" FROM nhanvien;");
        try {
            conn= Ultils.getConnection();
            pstm = conn.prepareStatement(sql.toString());
            rs = pstm.executeQuery();
            while(rs.next())
            {
                dataReponse.put(rs.getString("MANV"),rs.getDouble("voucher"));
            }
            return dataReponse;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
        finally {
            Ultils.close(conn);
        }
    }

    @Override
    public NhanVien timKiemTheoMaNV(String MaNV) {
        sql = new StringBuilder("select MaNV, HoTen, SoDienThoai, NgaySinh, DiaChi, MaPB, MaCV, NgayBatDauLam, apply_voucher from nhanvien where manv = ? ");
        try {
            NhanVien nhanVien = new NhanVien();
            conn = Ultils.getConnection();
            pstm = conn.prepareStatement(sql.toString());
            pstm.setString(1, MaNV);
            rs = pstm.executeQuery();
            while (rs.next())
            {
                nhanVien.setMaNhanVien(rs.getString("MaNV"));
                nhanVien.setHoTen(rs.getString("HoTen"));
                nhanVien.setSoDienThoai(rs.getString("SoDienThoai"));
                nhanVien.setNgaySinh(rs.getDate("NgaySinh"));
                nhanVien.setDiaChi(rs.getString("DiaChi"));
                nhanVien.setMaPB(rs.getString("MaPB"));

            }

            return nhanVien;
        }catch (Exception e)
        {
            throw  new QLNVExceptionException(e.getMessage());
        }
    }
}
