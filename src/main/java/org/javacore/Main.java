package org.javacore;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean  exit = false;
        while(!exit){
            System.out.println("\n --- MENU----");
            System.out.println("1. Tính lương trung bình của nhân viên ");
            System.out.println("2. Đếm số lượng nhân viên theo chức vụ ");
            System.out.println("3. Xác định nhân viên có mức lương cao nhất và thấp nhất ");
            System.out.println("4. Thống kê lịch sử lamf việc của nhân viên ");
            System.out.println("5. Thông tin nhân viên lớn tuổi nhất công ty ");
            System.out.println("6. Thông tin nhân viên làm việc lâu năm nhất ");
            System.out.println("7. Thêm bảng awards(id,nhanvien_id,type (varchar)) ");
            System.out.println("8. Kiểm tra nếu nhân viên làm trên  5 năm sẽ được thưởng voucher 5 triệu \n" +
                    "nếu làm trên 1 năm sẽ được 1 triệu \n " +
                    "nếu làm từ 1 đến 5  năm sẽ được 3 triệu  ");
            System.out.println("9. Tính số giờ làm việc trugn bình của mỗi nhân viên  ");
            System.out.println("10. Tính tổng số giờ làm việc của tất cả nhân viên trong vòng 1 tháng ");
            System.out.println("11.  Tìm nhân viên đi làm muộn nhất và trừ lương vào tháng đó 500k ");
            System.out.println("12. Tìm nhân viên đi làm sớm nhất và cộng vào lương tháng đó  500k");
            System.out.println("13. Đếm số ngày phép đã được phê duyệt cho mỗi nhân viên ");
            System.out.println("14. Tính tổng số ngày phép đã sử dụng của toàn bộ công ty");
            System.out.println("15. Tìm nhân viên có số ngày phép nhiều nhất ");
            System.out.println("16 : Thoát !!");
            System.out.println("Vui lòng chọn từ 1-15!!!!!");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    break;
                case 7 :
                    break;
                case 8 :
                    break;
                case 9 :
                    break;
                case 10 :
                    break;
                case 11 :
                    break;
                case 12 :
                    break;
                case 13 :
                    break;
                case 14 :
                    break;
                case 15 :
                    break;
                case 16 :
                    System.out.println("Cảm ơn bạn đã sử dụng ứng dụng quản lý nhân viên !!");
                    exit = true;
                    break;
                default :
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại .");
            }
            scanner.close();
        }

    }
}