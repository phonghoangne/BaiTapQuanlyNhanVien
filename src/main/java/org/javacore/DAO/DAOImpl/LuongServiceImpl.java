package org.javacore.DAO.DAOImpl;

import org.javacore.DAO.LuongService;
import org.javacore.Domain.Luong;
import org.javacore.Exception.QLNVExceptionException;
import org.javacore.Helper.Ultils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

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
        return null;
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
}
