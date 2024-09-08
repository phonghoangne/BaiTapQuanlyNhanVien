package org.javacore.DAO.DAOImpl;

import org.javacore.DAO.PhepService;
import org.javacore.Domain.Phep;
import org.javacore.Exception.QLNVExceptionException;
import org.javacore.Helper.Ultils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhepServiceImpl implements PhepService {
    StringBuilder sql ;
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    @Override
    public Boolean insert(Phep phep) {
        return null;
    }

    @Override
    public Boolean update(Phep phep) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    @Override
    public List<Phep> read() {
        return null;
    }

    @Override
    public Map<String,Integer > layNgayPhepDuocDuyetTheoMaNV() {
        sql = new StringBuilder("select count(*) as slphep ,MaNV from phep where TrangThai = 'Đã phê duyệt' group by MaNV;");
        Map<String, Integer> listData =new HashMap<>();
        try {
            conn = Ultils.getConnection();
            pstm = conn.prepareStatement(sql.toString());
            rs = pstm.executeQuery();
            while (rs.next())
            {
                listData.put(rs.getString("MaNV"),rs.getInt("slphep"));
            }
            return listData;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
    }

    @Override
    public String lyDoNghi(String MaNV) {
        StringBuilder response  = new StringBuilder("");
        sql = new StringBuilder("select LyDo from phep where manv = ? and trangthai = 'Đã phê duyệt';");
        try {
            conn = Ultils.getConnection();
            pstm = conn.prepareStatement(sql.toString());
            pstm.setString(1,MaNV);
            rs = pstm.executeQuery();
            while (rs.next())
            {
                if(response.length() == 0)
                    response.append(rs.getString("LyDo"));
               response.append(rs.getString("LyDo")).append("-");
            }
            return response.toString();
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
    }

    @Override
    public Integer tongSongayNghir() {
        sql = new StringBuilder("select sum(datediff(NgayKetThuc,NgayBatDau)+1)  as tongngaynghi from phep where TrangThai = 'Đã phê duyệt';");

        try {
            conn = Ultils.getConnection();
            pstm = conn.prepareStatement(sql.toString());
            rs = pstm.executeQuery();
            return rs.getInt("tongngaynghi");
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
    }

    @Override
    public Map<String, Integer> nhanVienOffNhieuNhat() {

        sql = new StringBuilder("select max(datediff(NgayKetThuc,NgayBatDau)+1) as ngaynghi,MaNV  as tongngaynghi from phep where TrangThai = 'Đã phê duyệt' group by MaNV\n" +
                "        order by ngaynghi desc limit 1");
        Map<String, Integer> responseData = new HashMap<>();
        try {
            conn = Ultils.getConnection();
            pstm = conn.prepareStatement(sql.toString());
            rs = pstm.executeQuery();
            responseData.put(rs.getString("MaNV"),rs.getInt("ngaynghi"));
            return responseData;
        }catch (Exception e)
        {
            throw new QLNVExceptionException(e.getMessage());
        }
    }
}
