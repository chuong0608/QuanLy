package qlcb;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements QuanLy<CanBo> {
    private List<CanBo> canBoList= new ArrayList<>();

    @Override
    public void them(CanBo canBo) {
        canBoList.add(canBo);
    }

    @Override
    public void timKiem(String ten) {
        for (int i = 0; i < canBoList.size(); i++) {
            if (canBoList.get(i).getHoTen().equals(ten)){
                System.out.println(canBoList.get(i));
            }
        }
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < canBoList.size(); i++) {
            System.out.println(canBoList.get(i));
        }

    }
    @Override
    public void thoat() {
        System.exit(0);
    }
}
