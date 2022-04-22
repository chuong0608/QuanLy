package quanlytinh;

public class Main {
    public static void main(String[] args) {
        QuanLyTinh quanLyTinh=new QuanLyTinh();
        QuanLyNguoi quanLyNguoi = new QuanLyNguoi();
        Nguoi nguoi = new Nguoi("1","Sơn",12,quanLyTinh.tinhs.get(1));
        System.out.println(nguoi);
        quanLyTinh.hienThiSoTinh();

    }
}
