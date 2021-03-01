package lab.s5;

import java.util.Scanner;

public class SinhVien extends Person{
    int maSv;
    float mark;
    String email;

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ma SV:");
        setMaSv(sc.nextInt());
        System.out.println("Diem thi:");
        setMark(sc.nextFloat());
        sc.nextLine();
        System.out.println("Email:");
        setEmail(sc.nextLine());
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Ma SV: "+getMaSv());
        System.out.println("Diem thi: "+getMark());
        System.out.println("Email: "+getEmail());
    }

    public boolean ktHocBong(){
        return getMark()>8;
    }
}
