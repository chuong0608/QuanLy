package quanlytinh;

import quanlytailieu.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoi implements QuanLy<Nguoi> {
    private List<Nguoi> nguois = new ArrayList<>();


    @Override
    public void them(Nguoi nguoi) {
        nguois.add(nguoi);
    }

    @Override
    public void xoa(int ma) {

    }

    @Override
    public int timKiemTheoMa(int ma) {

        return 0;
    }

    @Override
    public void hienThi() {
        for (Nguoi n: nguois
             ) {
            System.out.println(n);
        }
    }
    public void hienThiSoNguoi(){

    }

    @Override
    public void thoat() {
        System.exit(0);

    }
}
