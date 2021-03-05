package assignment.asm6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc {
    ArrayList<LopHoc> danhSachLopHoc;

    public MonHocDaiCuong(){
        danhSachLopHoc = new ArrayList<>();
    }

    @Override
    public void themLopHoc(String name,int soluonghocsinh) {
        for(LopHoc lh:danhSachLopHoc){
            if(lh.getName().equals(name)){
                return;
            }
        }
        LopHoc lh = new LopHoc(name,soluonghocsinh);
        lh.nhapHocSinh();
        danhSachLopHoc.add(lh);
    }

    @Override
    public void xoaLopHoc(String name) {
        for(LopHoc lh:danhSachLopHoc){
            if(lh.getName().equals(name)){
                danhSachLopHoc.remove(lh);
                return;
            }
        }
    }

    @Override
    public void sapXep() {
        Collections.sort(danhSachLopHoc, new Comparator<LopHoc>() {
            @Override
            public int compare(LopHoc o1, LopHoc o2) {
                return o2.getSoLuongHocSinh()-o1.getSoLuongHocSinh();// > 0 se dao lai vi tri o1 va o2 voi nhau
            }
        });

//        for(int i=0;i<danhSachLopHoc.size()-1;i++){
//            for(int j=0;j<danhSachLopHoc.size()-i-1;j++){
//                if(danhSachLopHoc.get(j).getSoLuongHocSinh()<danhSachLopHoc.get(j+1).soLuongHocSinh){
//                    LopHoc tmp = danhSachLopHoc.get(j);
//                    danhSachLopHoc.set(j,danhSachLopHoc.get(j+1));
//                    danhSachLopHoc.set(j+1,tmp);
//                }
//            }
//        }
    }

    @Override
    public void inDanhSach() {
        for(LopHoc lh: danhSachLopHoc){
            System.out.println("Ten Lop:"+lh.getName()+" - Si so:"+lh.getSoLuongHocSinh());
            System.out.println("Danh sach hoc sinh:");
            for(String s: lh.dsHocSinh){
                System.out.println(s);
            }
        }
    }
}
