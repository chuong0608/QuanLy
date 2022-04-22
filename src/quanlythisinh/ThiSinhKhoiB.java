package quanlythisinh;

public class ThiSinhKhoiB extends ThiSinh {
    private static final String monToan = "Toán";
    private static final String monHoa = "Hóa";
    private static final String monSinh = "Sinh";

    public ThiSinhKhoiB() {
    }

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB { " + "Số báo danh : " + getSoBaoDanh() +
                ", Họ tên : " + getHoTen()+ ", địa chỉ " + getDiaChi() + ", mức ưu tiên " + getMucUuTien()+
                ", môn thi : " + monToan+ ", " + monHoa + ", " + monSinh + " }";
    }
}
