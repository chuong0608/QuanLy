package quanlythisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        do {
            System.out.println("----------Menu----------");
            System.out.println("Chọn chức năng đê : ");
            System.out.println(" 1. Thêm thí sinh vào danh sách :\n " +
                    "2. Hiển thị thông tin thí sinh :\n " +
                    "3. Tìm kiếm thí sinh theo số báo danh :\n " +
                    "4. Thoát khỏi chương trình .");
            String luaChon = scanner.nextLine();
            switch (luaChon){
                case "1" :
                    System.out.println("Chon a để nhập thông tin thí sinh thi khối A : ");
                    System.out.println("Chọn b để nhập thông tin thí sinh thi khối B : ");
                    System.out.println("Chọn c để nhập thông tin thí sinh thi khối C : ");
                    String chonKhoi =  scanner.nextLine();
                    switch (chonKhoi){
                        case "a":{
                            System.out.println("Nhập số báo danh : ");
                            String soBaoDanh = scanner.nextLine();
                            System.out.println("Nhập họ tên thí sinh : ");
                            String hoTen =  scanner.nextLine();
                            System.out.println("Nhập địa chỉ thí sinh : ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhập mức ưu tiên : ");
                            int mucUuTien = scanner.nextInt();
                            ThiSinh thiSinhKhoiA = new ThiSinhKhoiA(soBaoDanh,hoTen,diaChi,mucUuTien);
                            tuyenSinh.them(thiSinhKhoiA);
                            break;
                        }
                        case "b":{
                            System.out.println("Nhập số báo danh : ");
                            String soBaoDanh = scanner.nextLine();
                            System.out.println("Nhập họ tên thí sinh : ");
                            String hoTen =  scanner.nextLine();
                            System.out.println("Nhập địa chỉ thí sinh : ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhập mức ưu tiên : ");
                            int mucUuTien = scanner.nextInt();
                            ThiSinh thiSinhKhoiB = new ThiSinhKhoiB(soBaoDanh,hoTen,diaChi,mucUuTien);
                            tuyenSinh.them(thiSinhKhoiB);
                            break;
                        }
                        case "c": {
                            System.out.println("Nhập số báo danh : ");
                            String soBaoDanh = scanner.nextLine();
                            System.out.println("Nhập họ tên thí sinh : ");
                            String hoTen =  scanner.nextLine();
                            System.out.println("Nhập địa chỉ thí sinh : ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhập mức ưu tiên : ");
                            int mucUuTien = scanner.nextInt();
                            ThiSinh thiSinhKhoiC = new ThiSinhKhoiC(soBaoDanh,hoTen,diaChi,mucUuTien);
                            tuyenSinh.them(thiSinhKhoiC);
                            break;
                        }
                    }
                    break;
                case "2":
//                    Hiển thị thông tin thí sinh
                    tuyenSinh.hienThi();
                    break;
                case "3":
//                    Tìm kiếm theo số báo danh
                    System.out.println("Nhập số báo danh cần tìm kiếm : ");
                    String soBaoDanhCanTim = scanner.nextLine();
                    tuyenSinh.timKienTheoSoBaoDanh(soBaoDanhCanTim);
                    break;
                case "4" :
                    tuyenSinh.thoat();
                    break;
            }

        }while (true);

    }
}
