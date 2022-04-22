package quanlytinh;

import quanlytailieu.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTinh implements QuanLy<Tinh> {
    List<Tinh> tinhs = new ArrayList<>();

    public QuanLyTinh() {
        Tinh tinh = new Tinh("19","Phú Thọ",1000000,2.8);
        tinhs.add(tinh);
        Tinh tinh1 = new Tinh("20","Thái Nguyên",1000000,2.8);
        tinhs.add(tinh1);
        Tinh tinh2 = new Tinh("21","Yên Bái",1000000,2.8);
        tinhs.add(tinh2);
        Tinh tinh3 = new Tinh("22","Tuyên Quang",1000000,2.8);
        tinhs.add(tinh3);
        Tinh tinh4 = new Tinh("19","Phú Thọ",1000000,2.8);
        tinhs.add(tinh4);
    }

    @Override
    public void them(Tinh tinh) {
        tinhs.add(tinh);
    }

    @Override
    public void xoa(int ma) {
        tinhs.remove(timKiemTheoMa(ma));
    }

    @Override
    public int timKiemTheoMa(int ma) {
        for (int i = 0; i < tinhs.size(); i++) {
            return i;
        }
        return -1;
    }
    public void hienThiSoTinh(){
            System.out.println(tinhs.size());
    }

    @Override
    public void hienThi() {
        for (Tinh t: tinhs) {
            System.out.println(t);
        }

    }

    @Override
    public void thoat() {
        System.exit(0);

    }
}
