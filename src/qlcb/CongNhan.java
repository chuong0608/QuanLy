package qlcb;

public class CongNhan extends CanBo{
   private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                  super.toString() +
        "bac=" + bac+ "} ";
    }
}
