package org.javacore.DAO;

import org.javacore.Domain.Phep;

import java.util.Map;

public interface PhepService extends CRUD<Phep> {

        Map<String,Integer> layNgayPhepDuocDuyetTheoMaNV();

        String lyDoNghi(String MaNV);

        Integer tongSongayNghir();

        Map<String,Integer> nhanVienOffNhieuNhat();

}
