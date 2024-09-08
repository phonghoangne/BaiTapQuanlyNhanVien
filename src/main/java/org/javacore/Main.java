package org.javacore;

import org.javacore.DAO.*;
import org.javacore.DAO.DAOImpl.*;
import org.javacore.Domain.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        LuongService luongService = new LuongServiceImpl();
        ViewService viewService = new ViewServiceImpl();
        NhanVienService nhanVienService= new NhanVienServiceImpl();
        boolean  exit = false;
        Scanner scanner = new Scanner(System.in);
        ChamCongService chamCongService = new ChamCongServiceImpl();
        PhepService phepService = new PhepServiceImpl();

        while(!exit){
            System.out.println("\n --- MENU----");
            System.out.println("1. Tính lương trung bình của nhân viên ");
            System.out.println("2. Đếm số lượng nhân viên theo chức vụ ");
            System.out.println("3. Xác định nhân viên có mức lương cao nhất và thấp nhất ");
            System.out.println("4. Thống kê lịch sử làm việc của nhân viên ");
            System.out.println("5. Thông tin nhân viên lớn tuổi nhất công ty ");
            System.out.println("6. Thông tin nhân viên làm việc lâu năm nhất ");
            System.out.println("7. Thêm bảng awards(id,nhanvien_id,type (varchar)) ");
            System.out.println("8. Kiểm tra nếu nhân viên làm trên  5 năm sẽ được thưởng voucher 5 triệu \n" +
                    "nếu làm trên 1 năm sẽ được 1 triệu \n " +
                    "nếu làm từ 1 đến 5  năm sẽ được 3 triệu  ");
            System.out.println("9. Tính số giờ làm việc trung bình của mỗi nhân viên  ");
            System.out.println("10. Tính tổng số giờ làm việc của tất cả nhân viên trong vòng 1 tháng ");
            System.out.println("11.  Tìm nhân viên đi làm muộn nhất và trừ lương vào tháng đó 500k ");
            System.out.println("12. Tìm nhân viên đi làm sớm nhất và cộng vào lương tháng đó  500k");
            System.out.println("13. Đếm số ngày phép đã được phê duyệt cho mỗi nhân viên ");
            System.out.println("14. Tính tổng số ngày phép đã sử dụng của toàn bộ công ty");
            System.out.println("15. Tìm nhân viên có số ngày phép nhiều nhất ");
            System.out.println("16 : Thoát !!");
            System.out.println("Vui lòng chọn từ 1-15!!!!!");
            int choice = scanner.nextInt();
//            scanner.nextLine();

            switch(choice){
                case 1 :
                    System.out.println(luongService.AvgSalary());
                    break;
                case 2 :
                    List<NhanVienCVView> listCountNV = viewService.countNhanVienGroupCV();
                    for (NhanVienCVView item : listCountNV)
                    {
                        System.out.println(item.toString());
                    }
                    break;
                case 3 :
                    System.out.println("nhan vien luong cao nhat : "+viewService.luongMax());
                    System.out.println("nhan vien luong thap nhat : "+ viewService.luongMin());
                    break;
                case 4 :
                    List<LichSuLamViecV> lichSuLamViecVS = viewService.lichSuLamViecAll();
                    for (LichSuLamViecV item : lichSuLamViecVS){
                        System.out.println(item.toString());
                    }
                    break;
                case 5 :
                    System.out.println(viewService.nhanVienLonTuoiNhat());// *
                    break;
                case 6 :
                    System.out.println(viewService.nhanVienLamViecLauNhat());
                    break;
                case 7 :
                    viewService.createTableAward();
                    break;
                case 8 :
                    System.out.println("-----");
                    System.out.println("luong truoc apply voucher");
                    List<Luong> luongAll = luongService.read();
                    for (Luong item : luongAll )
                    {
                        System.out.println(item.toString());
                    }
                    Map<String,Double> dataVoucher = nhanVienService.applyVouCherChoNhanVien();

                    luongService.UpdateAllLuong(dataVoucher);
                    System.out.println("-----");
                    System.out.println("luong sau apply voucher");
                    luongAll = luongService.read();
                    for (Luong item : luongAll )
                    {
                        System.out.println(item.toString());
                    }

                    break;
                case 9 : List<ChamCongGioLamV> chamCong = viewService.gioLamTrungBinh();
                    for(ChamCongGioLamV item : chamCong){
                        System.out.println(item);
                    }
                    break;
                case 10 :
                    System.out.println("Nhap nam thang co dinh dang yyyy-mm ");
                    Scanner sc = new Scanner(System.in);
                    String namThang = sc.nextLine();
                    System.out.println("Tong so gio lam viec cua tat ca nhan vien trong 1 thang : "+ viewService.TongSoGioLamViec(namThang) );
                    break;
                case 11 :
                    ChamCong muonNhat = chamCongService.timNhanVienMuonNhat();
                    Luong truLuong = luongService.timLuongTheoMaNV(muonNhat.getMaNV());
                    luongService.UpdateLuong(truLuong.getMaNV(),truLuong.getMucLuong() - 500000);
                    break;
                case 12 :
                    ChamCong somNhat = chamCongService.timNhanVienSomNhat();
                    Luong congLuong = luongService.timLuongTheoMaNV(somNhat.getMaNV());
                    luongService.UpdateLuong(somNhat.getMaNV(),congLuong.getMucLuong() + 500000);
                    break;
                case 13 :
                    System.out.println("so ngay phep duoc phe duyet cho cac nhan vien");
                    Map<String,Integer> ngayPhepget=   phepService.layNgayPhepDuocDuyetTheoMaNV();
                    for(Map.Entry<String, Integer> entry : ngayPhepget.entrySet())
                    {
                        NhanVien nvNghi = nhanVienService.timKiemTheoMaNV(entry.getKey());
                        String LydoNghi =  phepService.lyDoNghi(nvNghi.getMaNhanVien());
                        System.out.println(nvNghi.toString() + " - Lý do: "+LydoNghi );
                    }
                    break;
                case 14 :
                    phepService.tongSongayNghir();
                    break;
                case 15 :
                  Map<String,Integer>data=  phepService.nhanVienOffNhieuNhat();
                    for(Map.Entry<String, Integer> entry : data.entrySet())
                    {
                        System.out.println("NHan Vien Nghi nhieu Nhat: "+nhanVienService.timKiemTheoMaNV(entry.getKey()) + " nghi "+entry.getValue() + "ngay");
                    }
                    break;
                case 16 :
                    System.out.println("Cảm ơn bạn đã sử dụng ứng dụng quản lý nhân viên !!");
                    exit = true;
                    break;
                default :
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại .");
            }
        }
        scanner.close();

    }
}