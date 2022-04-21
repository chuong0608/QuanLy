package quanlytailieu;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(int ma, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(ma, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
