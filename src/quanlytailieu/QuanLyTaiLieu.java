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
        if(timKiemTheoMa(ma) == -1){
            System.out.println("Không có để xóa");

        }else {
            taiLieus.remove(taiLieus);
        }

    }

    @Override
    public int timKiemTheoMa(int ma) {
        for (int i = 0; i < taiLieus.size(); i++) {
            if(taiLieus.get(i).getMa() == ma){
                return i;
            }
        }
        return -1;

    }

    @Override
    public void hienThi() {
        for (int i = 0; i < taiLieus.size(); i++) {
            System.out.println(taiLieus.get(i));
        }

    }

    @Override
    public void thoat() {
        System.exit(0);

    }
}
