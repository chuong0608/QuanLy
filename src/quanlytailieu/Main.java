package quanlytailieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        do {
            System.out.println("____________Menu____________");
            System.out.println("Vui lòng lựa chọn chức năng : ");
            System.out.println("1. Thêm tài liệu vào danh sách :\n" +
                    "2. Xóa theo mã: \n" +
                    "3.Hiện thị tất cả thông tin : \n" +
                    "4.Hiển thị tất cả sách : \n" +
                    "5. Hiển thị tất cả tạp chí : \n" +
                    "6. Hiển thị tất cả báo : \n");
            String luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    System.out.println("Chọn a để nhập sách : ");
                    System.out.println("Chọn b để nhập tạp chí : ");
                    System.out.println("Chọn c để nhập báo : ");
                    String chon1 = scanner.nextLine();
                    switch (chon1) {
                        case "a": {
                            System.out.println("Nhập mã tài liệu : ");
                            int ma1 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập tên nhà xuất bản : ");
                            String tenNSB = scanner.nextLine();
                            System.out.println("Nhập số bản phát hành : ");
                            int soBanPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập tên tác giả : ");
                            String tenTacGia = scanner.nextLine();
                            System.out.println("Nhập số trang : ");
                            int soTrang = scanner.nextInt();
                            TaiLieu sach = new Sach(ma1, tenNSB, soBanPhatHanh, tenTacGia, soTrang);
                            quanLyTaiLieu.them(sach);
                            break;
                        }
                        case "b": {
                            System.out.println("Nhập mã tài liệu : ");
                            int ma2 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập tên nhà xuất bản : ");
                            String tenNSB = scanner.nextLine();
                            System.out.println("Nhập số bản phát hành : ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.println("Nhập số phát hành : ");
                            int soPhatHanh = scanner.nextInt();
                            System.out.println("Nhập tháng phát hành : ");
                            int thangPhatHanh = scanner.nextInt();
                            TaiLieu tapChi = new TapChi(ma2, tenNSB, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                            quanLyTaiLieu.them(tapChi);
                            break;
                        }

                        case "c": {
                            System.out.println("Nhập mã tài liệu : ");
                            int ma3 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập tên nhà xuất bản : ");
                            String tenNSB = scanner.nextLine();
                            System.out.println("Nhập số bản phát hành : ");
                            int soBanPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập số phát hành : ");
                            String ngayPhatHanh = scanner.nextLine();
                            TaiLieu bao = new Bao(ma3, tenNSB, soBanPhatHanh, ngayPhatHanh);
                            quanLyTaiLieu.them(bao);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                case "2":{
//                    In danh sách ra màn hình
                    quanLyTaiLieu.hienThi();
                    break;
                }
                case "3":{
                    quanLyTaiLieu.xoa(1);
                }
            }

        } while (true);
        }
    }
