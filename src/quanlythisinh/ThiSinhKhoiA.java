package quanlythisinh;

public class ThiSinhKhoiA extends ThiSinh {
    private static final String monToan = "Toan";
    private static final String monLy = "Ly";
    private static final String monHoa = "Hoa";

    public ThiSinhKhoiA() {

    }

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA { " + "Số báo danh : " + getSoBaoDanh() +
                ", Họ tên : " + getHoTen()+ ", địa chỉ " + getDiaChi() + ", mức ưu tiên " + getMucUuTien()+
                ", môn thi : " +monToan + ", " + monLy  + ", " + monHoa+ "} " ;
    }
}
