package lab.s5;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Nguyen Gia Thinh","Nam","29/2/1999","18 Hang bai");

//        p1.inputInfo();
//        p1.showInfo();
//        p2.showInfo();

//        SinhVien s = new SinhVien();
//        s.inputInfo();
//        s.showInfo();

        GiaoVien gv = new GiaoVien();
        gv.inputInfo();
        gv.showInfo();

    }
}
