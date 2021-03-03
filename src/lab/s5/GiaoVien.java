package lab.s5;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person{
    ArrayList<String> danhSachLop;
    double mucLuong;
    int soMonDay;
    ArrayList<String> danhSachMonHoc;

    public GiaoVien() {
        danhSachLop = new ArrayList<>();
        danhSachMonHoc = new ArrayList<>();
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoMonDay() {
        return soMonDay;
    }

    public void setSoMonDay(int soMonDay) {
        this.soMonDay = soMonDay;
    }

    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Muc luong:");
        setMucLuong(sc.nextDouble());
        System.out.println("So mon day:");
        setSoMonDay(sc.nextInt());
        sc.nextLine();
        System.out.println("Danh sach cac mon:");
        for(int i=0;i<getSoMonDay();i++){
            danhSachMonHoc.add(sc.nextLine());
        }
        System.out.println("So lop day:");
        int sl = sc.nextInt();
        sc.nextLine();
        System.out.println("Danh sach lop:");
        for(int i=0;i<sl;i++){
            danhSachLop.add(sc.nextLine());
        }
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Muc luong:"+getMucLuong());
        System.out.println("So mon hoc dang day:"+getSoMonDay());
        System.out.println("Danh sach mon hoc:");
        for(String s: danhSachMonHoc){
            System.out.println(s);
        }
        System.out.println("Danh sach lop hoc:");
        for(String s: danhSachLop){
            System.out.println(s);
        }
    }
}
