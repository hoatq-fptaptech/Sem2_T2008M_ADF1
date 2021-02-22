package session.s2;

public class Car {
    private String model;
    protected int soBanhxe;

    // constructor - ham khoi tao
    public Car(){
        setSoBanhxe(4);
    }
    /*
        1. ten giong ten lop
        2. khong co gia tri tra ve ( ko cos void int ... truoc ten ham)
        3. Tu dong chay khi tao doi tuong
     */

     public String getModel(){
         return model;
     }// getter

     public void setModel(String m){
         this.model = m;
     }//setter

    public int getSoBanhxe() {
        return soBanhxe;
    }

    public void setSoBanhxe(int soBanhxe) {
        this.soBanhxe = soBanhxe;
    }

    public void run(){
        System.out.println(this.model+" Running...");
    }

    void going(){
         run();
    }
}
