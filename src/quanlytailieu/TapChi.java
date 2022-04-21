package quanlytailieu;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int ma, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(ma, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tài liệu là : "+ "TapChi{"+ super.toString() +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                "} " ;
    }

}
