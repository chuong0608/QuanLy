package quanlytinh;

public class Nguoi {
    private String ma,ten;
    private int tuoi;
    private Tinh tinh;

    public Nguoi(String ma, String ten, int tuoi, Tinh tinh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.tinh = tinh;
    }

    public Nguoi() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Tinh getTinh() {
        return tinh;
    }

    public void setTinh(Tinh tinh) {
        this.tinh = tinh;
    }

    @Override
    public String toString() {
        return tinh + "\n" + "Nguoi{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", tinh= " +
                '}';
    }
}
