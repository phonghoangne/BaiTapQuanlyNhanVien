package org.javacore.DAO.DAOImpl;

import org.javacore.DAO.LuongService;
import org.javacore.Domain.Luong;
import org.javacore.Exception.QLNVExceptionException;
import org.javacore.Helper.Ultils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LuongServiceImpl implements LuongService {

    StringBuilder sql ;

    String tableName = "LUONG";
    String maNV = "MaNV";
    String mucLuong = "MucLuong";

    String NgayBatDau = "NgayBatDau";
    String NgayKetThuc ="NgayKetThuc";

    Connection connection = null;

    PreparedStatement pstmt = null;

    ResultSet rs = null;


    @Override
    public Boolean insert(Luong luong) {
        return null;
    }

    @Override
    public Boolean update(Luong luong) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    @Override
    public List<Luong> read() {
        sql = new StringBuilder("SELECT MANV, MUCLUONG, NGAYBATDAU, NGAYKETTHUC FROM LUONG");
        try{
            List<Luong> luongAll = new ArrayList<>();
            connection = Ultils.getConnection();
            pstmt = connection.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                Luong item = new Luong();
                item.setMaNV(rs.getString("MANV"));
                item.setMucLuong(rs.getDouble("MUCLUONG"));
                item.setNgayBatDau(rs.getDate("NGAYBATDAU"));
                item.setNgayKetThuc(rs.getDate("NGAYKETTHUC"));
                luongAll.add(item);
            }
            return luongAll;
        }catch (Exception e)
        {
            throw  new QLNVExceptionException(e.getMessage());
        }
    }


    @Override
    public Double AvgSalary() {
        sql = new StringBuilder("SELECT AVG(").append (mucLuong).append(") as LuongTrungBinh FROM ").append(tableName);

        try{
            connection = Ultils.getConnection();
            pstmt = connection.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            if(rs.next())
             return rs.getDouble("LuongTrungBinh");
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }

        return 0.0;
    }

    @Override
    public Boolean UpdateLuong(String manv, Double voucherThuong) {
        sql = new StringBuilder("UPDATE LUONG SET MUCLUONG =   ? WHERE MANV = ? ");
        try{
            connection = Ultils.getConnection();
            pstmt = connection.prepareStatement(sql.toString());
            pstmt.setString(1,manv);
            pstmt.setDouble(2,voucherThuong);
            int i = pstmt.executeUpdate();
            if(i > 0)
                return  true;
            return false;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }finally {
            Ultils.close(connection);
        }
    }

    @Override
    public Boolean UpdateAllLuong(Map<String, Double> listLuong) {
        sql = new StringBuilder("UPDATE LUONG SET MUCLUONG = MUCLUONG + ? , apply_voucher = 'Y' WHERE MANV = ? AND apply_voucher = 'N'");
            try{
                connection = Ultils.getConnection();
                connection.setAutoCommit(false);
                int i = 0;
                for (Map.Entry<String, Double> entry : listLuong.entrySet()) {
                    pstmt = connection.prepareStatement(sql.toString());
                    pstmt.setDouble(1,entry.getValue());
                    pstmt.setString(2,entry.getKey());
                     i = pstmt.executeUpdate();
                }
                if(i > 0)
                {
                    connection.commit();
                    return true;
                }
                else{
                    connection.rollback();
                    return false;
                }
            }catch (Exception e)
            {
                throw new QLNVExceptionException(e.getMessage());
            }finally {
                Ultils.close(connection);
        }
    }

    @Override
    public Luong timLuongTheoMaNV(String manv) {
        sql = new StringBuilder("select  manv, mucluong, ngaybatdau, ngayketthuc, apply_voucher\n "  +
                "from luong where manv = ?; ");

        try{
            connection = Ultils.getConnection();
            pstmt = connection.prepareStatement(sql.toString());
            pstmt.setString(1,manv);
            rs = pstmt.executeQuery();
            Luong luong = new Luong();
            luong.setMaNV(rs.getString("manv"));
            luong.setMucLuong(rs.getDouble("mucluong"));
            return luong;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }

    }
}
