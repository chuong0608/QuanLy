package quanlythisinh;

import quanlytailieu.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh implements QuanLy<ThiSinh> {
    List<ThiSinh> thiSinhs = new ArrayList<>();

    @Override
    public void them(ThiSinh thiSinh) {
        thiSinhs.add(thiSinh);
    }

    @Override
    public void xoa(int ma) {

    }

    @Override
    public int timKiemTheoMa(int ma) {
        return 0;
    }
    public void timKienTheoSoBaoDanh(String soBaoDanh){
        for (int i = 0; i < thiSinhs.size(); i++) {
            if (thiSinhs.get(i).getSoBaoDanh().equals(soBaoDanh)) {
                System.out.println(thiSinhs.get(i));
            }
        }
    }

    @Override
    public void hienThi() {
        for (int i = 0 ; i< thiSinhs.size();i++){
            System.out.println(thiSinhs.get(i));
        }
        System.out.println("----------ok --- chưa -----------");

    }

    @Override
    public void thoat() {
        System.exit(0);

    }
}
