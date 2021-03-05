package assignment.asm6;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong m = new MonHocDaiCuong();
        m.themLopHoc("T2008M",23);
        m.themLopHoc("T2009M",21);
        m.themLopHoc("T2011E",26);
        m.inDanhSach();
        m.sapXep();
        System.out.println("Sau khi sap xep:");
        m.inDanhSach();
    }
}
