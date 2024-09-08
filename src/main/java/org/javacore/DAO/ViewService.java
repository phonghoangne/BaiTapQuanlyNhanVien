package org.javacore.DAO;

import org.javacore.Domain.*;

import java.util.List;

public interface ViewService {
    // nhung model view chi de doc khong dung de insert update delete
    // vi view duoc join tu nhieu bang khac nhau nen chi dung de read
    List<NhanVienCVView> countNhanVienGroupCV();

    MucLuongNhanVien luongMax();

    MucLuongNhanVien luongMin();

    List<LichSuLamViecV> lichSuLamViecAll();


    Boolean createTableAward();
    NhanVien nhanVienLonTuoiNhat();
    NhanVien nhanVienLamViecLauNhat();
    List<ChamCongGioLamV> gioLamTrungBinh();
    TongSoGioLamViecV TongSoGioLamViec();
}
