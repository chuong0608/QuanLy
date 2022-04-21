package quanlytailieu;

public class TaiLieu {
    private int ma;
    private String tenNXB;
    private int soBanPhatHanh;

    public TaiLieu(int ma, String tenNXB, int soBanPhatHanh) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return
                "ma=" + ma +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBanPhatHanh = " + soBanPhatHanh + ", "
                ;
    }
}
