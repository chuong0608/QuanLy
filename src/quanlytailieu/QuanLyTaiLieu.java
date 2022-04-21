package quanlytailieu;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu implements QuanLy<TaiLieu> {
    private List<TaiLieu> taiLieus = new ArrayList<>();

    @Override
    public void them(TaiLieu taiLieu) {
        taiLieus.add(taiLieu);
    }

    @Override
    public void xoa(int ma) {

    }

    @Override
    public int timKiem(int ma) {
        return 0;

    }

    @Override
    public void hienThi() {

    }

    @Override
    public void thoat() {

    }
}
