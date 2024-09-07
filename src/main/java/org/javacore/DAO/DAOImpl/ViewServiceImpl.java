package org.javacore.DAO.DAOImpl;

import org.javacore.DAO.LicSuLamViec;
import org.javacore.DAO.ViewService;
import org.javacore.Domain.LichSuLamViecV;
import org.javacore.Domain.MucLuongNhanVien;
import org.javacore.Domain.NhanVienCVView;
import org.javacore.Exception.QLNVExceptionException;
import org.javacore.Helper.Ultils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ViewServiceImpl implements ViewService {
    StringBuilder sql ;
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    @Override
    public List<NhanVienCVView> countNhanVienGroupCV() {
        sql = new StringBuilder("SELECT TenCV,MaCV,slnv FROM countNhanVienGroupCV_V ");
        List<NhanVienCVView> listReponse = new ArrayList<>();
        try {
            conn = Ultils.getConnection();
            preparedStatement = conn.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                NhanVienCVView item = new NhanVienCVView();
                item.setMaCv(rs.getString("MaCV"));
                item.setTenCV(rs.getString("TenCV"));
                item.setSlnv(rs.getInt("slnv"));
                listReponse.add(item);
            }
            return listReponse;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
        finally {
            Ultils.close(conn);
        }
    }

    @Override
    public MucLuongNhanVien luongMax() {
        sql = new StringBuilder("SELECT MucLuong, HoTen, TenCV,DiaChi,SoDienThoai FROM mucluong_nhanvien_v ORDER BY MucLuong DESC LIMIT  1;");
        try{
            conn = Ultils.getConnection();
            preparedStatement = conn.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();
            MucLuongNhanVien mucLuongNhanVien = null;
            while (rs.next())
            {
                mucLuongNhanVien = new MucLuongNhanVien();
                mucLuongNhanVien.setMucLuong(rs.getDouble("MucLuong"));
                mucLuongNhanVien.setTenNhanVien(rs.getString("HoTen"));
                mucLuongNhanVien.setTenChucVu(rs.getString("TenCV"));
                mucLuongNhanVien.setDiaChi(rs.getString("DiaChi"));
                mucLuongNhanVien.setPhone(rs.getInt("SoDienThoai"));
            }
            return mucLuongNhanVien;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
    }

    @Override
    public MucLuongNhanVien luongMin() {
        sql = new StringBuilder("SELECT MucLuong, HoTen, TenCV,DiaChi,SoDienThoai FROM mucluong_nhanvien_v ORDER BY MucLuong ASC LIMIT  1;");
        try{
            conn = Ultils.getConnection();
            preparedStatement = conn.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();
            MucLuongNhanVien mucLuongNhanVien = null;
            while (rs.next())
            {
                mucLuongNhanVien = new MucLuongNhanVien();
                mucLuongNhanVien.setMucLuong(rs.getDouble(1));
                mucLuongNhanVien.setTenNhanVien(rs.getString(2));
                mucLuongNhanVien.setTenChucVu(rs.getString(3));
                mucLuongNhanVien.setDiaChi(rs.getString(4));
                mucLuongNhanVien.setPhone(rs.getInt(5));
            }
            return mucLuongNhanVien;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
    }

    @Override
    public List<LichSuLamViecV> lichSuLamViecAll() {
        sql = new StringBuilder("SELECT HoTen,MaNV, TenPB,MaPB,NgayChuyen FROM lich_su_lam_viec_nv_v");
        List<LichSuLamViecV> list = new ArrayList<>();
        try{
            conn = Ultils.getConnection();
            preparedStatement = conn.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                LichSuLamViecV item = new LichSuLamViecV();
                item.setHoTen(rs.getString("HoTen"));
                item.setMaNv(rs.getString("MaNV"));
                item.setTenPB(rs.getString("TenPB"));
                item.setMaPB(rs.getString("MaPB"));
                item.setDate(Ultils.formatDate(rs.getDate("NgayChuyen")));
                list.add(item);
            }
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
        return list;
    }

    @Override
    public Boolean createTableAward() {
        sql = new StringBuilder();
        sql.append("create table if not exists  awards")
                .append("  (award_id int primary key ,")
                .append(" manv   varchar(10), ")
                .append("  type varchar(50),")
                .append(" foreign key (manv) references nhanvien(MaNV)) ");
        try {
            conn = Ultils.getConnection();
            preparedStatement = conn.prepareStatement(sql.toString());
            preparedStatement.execute();
        }catch (Exception e )
        {
            throw new QLNVExceptionException(e.getMessage());
        }
        return true;
    }

}
