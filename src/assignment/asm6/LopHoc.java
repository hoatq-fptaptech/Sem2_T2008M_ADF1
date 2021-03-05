package assignment.asm6;

public class LopHoc {
    String name;
    int soLuongHocSinh;

    public LopHoc(String name, int soLuongHocSinh) {
        this.name = name;
        this.soLuongHocSinh = soLuongHocSinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuongHocSinh() {
        return soLuongHocSinh;
    }

    public void setSoLuongHocSinh(int soLuongHocSinh) {
        this.soLuongHocSinh = soLuongHocSinh;
    }
}
