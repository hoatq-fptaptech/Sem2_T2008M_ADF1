package lab.s8;

public class KhachHangNuocNgoai extends KhachHang {
    public String quocTich;

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return getSoLuong() * 2000;
    }
}
