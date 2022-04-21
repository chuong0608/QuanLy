package qlcb;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        NhanVien nhanVien1 = new NhanVien("Sơn",20,"nam","Hà Nội","Bảo vệ");
        CongNhan congNhan1 = new CongNhan("Sơn",20,"nam","Hà Nội",2);
        KySu kySu1 = new KySu("Sơn",20,"nam","Hà Nội","Cau duong");
        quanLyCanBo.them(kySu1);
        quanLyCanBo.them(congNhan1);
        quanLyCanBo.them(nhanVien1);

        quanLyCanBo.hienThi();
        quanLyCanBo.thoat();
        quanLyCanBo.timKiem("Hoa");

    }
}
