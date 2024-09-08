package org.javacore.DAO.DAOImpl;

import org.javacore.DAO.ChamCongService;
import org.javacore.DAO.LuongService;
import org.javacore.Domain.ChamCong;
import org.javacore.Exception.QLNVExceptionException;
import org.javacore.Helper.Ultils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ChamCongServiceImpl implements ChamCongService {
    Connection connection = null;

    PreparedStatement pstmt = null;

    ResultSet rs = null;
    StringBuilder sql;


    LuongService luongService = new LuongServiceImpl();

    @Override
    public Boolean insert(ChamCong chamCong) {
        return null;
    }

    @Override
    public Boolean update(ChamCong chamCong) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    @Override
    public List<ChamCong> read() {
        return null;
    }

    @Override
    public ChamCong timNhanVienMuonNhat() {


        sql = new StringBuilder("select manv,mcc,ngaychamcong,giobatdau,gioketthuc from chamcong order by GioBatDau asc limit 1");
        try {
            connection = Ultils.getConnection();
            pstmt = connection.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            ChamCong chamCong = new ChamCong();
            chamCong.setMaNV(rs.getString("manv"));
            chamCong.setMaChamCong(rs.getString("mcc"));
            chamCong.setNgayChamCong(rs.getDate("ngaychamcong"));
            chamCong.setGioBatDau(rs.getTime("giobatdau"));
            chamCong.setGioBatDau(rs.getTime("gioketthuc"));
            return chamCong;
        } catch (Exception e) {
            throw new QLNVExceptionException(e.getMessage());
        }
    }

    @Override
    public ChamCong timNhanVienSomNhat() {
        sql = new StringBuilder("select manv,mcc,ngaychamcong,giobatdau,gioketthuc from chamcong order by GioBatDau desc limit 1");
        try {
            connection = Ultils.getConnection();
            pstmt = connection.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            ChamCong chamCong = new ChamCong();
            chamCong.setMaNV(rs.getString("manv"));
            chamCong.setMaChamCong(rs.getString("mcc"));
            chamCong.setNgayChamCong(rs.getDate("ngaychamcong"));
            chamCong.setGioBatDau(rs.getTime("giobatdau"));
            chamCong.setGioBatDau(rs.getTime("gioketthuc"));
            return chamCong;
        } catch (Exception e) {
            throw new QLNVExceptionException(e.getMessage());
        }
    }
}
