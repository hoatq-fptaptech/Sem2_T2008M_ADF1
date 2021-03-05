package assignment.asm6;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    String name;
    int soLuongHocSinh;
    ArrayList<String> dsHocSinh;

    public LopHoc(String name, int soLuongHocSinh) {
        this.name = name;
        this.soLuongHocSinh = soLuongHocSinh;
        dsHocSinh = new ArrayList<>();
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

    public void nhapHocSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap danh sach hoc sinh:");
        for(int i=0;i<getSoLuongHocSinh();i++){
            dsHocSinh.add(sc.nextLine());
        }
    }
}
