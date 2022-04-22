package quanlythisinh;

public class ThiSinhKhoiC extends ThiSinh{
    private static final String monVan = "Văn";
    private static final String monSu = "Sử";
    private static final String monDia = "Địa";

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC { " + "Số báo danh : " + getSoBaoDanh() +
                ", Họ tên : " + getHoTen()+ ", địa chỉ " + getDiaChi() + ", mức ưu tiên " + getMucUuTien()+
                ", môn thi : "+ monVan + ", " + monSu + ", " + monDia + " }";
    }
}
