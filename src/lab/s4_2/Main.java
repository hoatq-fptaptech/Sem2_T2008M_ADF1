package lab.s4_2;

public class Main {
    public static void main(String[] args){
        SinhVien s1 = new SinhVien();
        s1.setId(1);
        s1.setName("Nguyen Van A");
        s1.setTel("0987654321");
        s1.setAddress("12 Ton That Thuyet");

        SinhVien s2 = new SinhVien();
        s2.setName("Nguyen Duc Nam");
        s2.setId(2);
        s2.setAddress("76 Quang Trung");
        s2.setTel("0123456789");

        LopHoc lh = new LopHoc();
        lh.addStudent(s1);
        lh.addStudent(s2);

        lh.printStudents();
    }
}
