package lab.s8;

public abstract class KhachHang {
    protected int maKH;
    protected String tenKh;
    protected String ngayXuatHD;
    protected int soLuong;

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getNgayXuatHD() {
        return ngayXuatHD;
    }

    public void setNgayXuatHD(String ngayXuatHD) {
        this.ngayXuatHD = ngayXuatHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract double thanhTien();
}
