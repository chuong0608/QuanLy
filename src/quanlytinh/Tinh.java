package quanlytinh;

public class Tinh {
    private String ma,ten;
    private int danSo;
    private double gDP;

    public Tinh(String ma, String ten, int danSo, double gDP) {
        this.ma = ma;
        this.ten = ten;
        this.danSo = danSo;
        this.gDP = gDP;
    }

    public Tinh() {
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

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public double getgDP() {
        return gDP;
    }

    public void setgDP(double gDP) {
        this.gDP = gDP;
    }

    @Override
    public String toString() {
        return "Tỉnh  : " +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", danSo=" + danSo +
                ", gDP=" + gDP ;
    }
}
