package lab.s4_2;

import java.util.ArrayList;

public class LopHoc {
    int id;
    String name;
    String room;
    ArrayList<SinhVien> studentList;

    public LopHoc() {
        this.studentList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void addStudent(SinhVien sv){
        studentList.add(sv);
    }

    public void removeStudent(int index){
        studentList.remove(index);
    }

    public void printStudents(){
        for(SinhVien s:studentList){
            System.out.println("Ma SV:"+s.getId());
            System.out.println("Ten SV:"+s.getName());
            System.out.println("Dien thoai:"+s.getTel());
            System.out.println("Dia chi:"+s.getAddress());
        }
    }
}
