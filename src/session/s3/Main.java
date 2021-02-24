package session.s3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        int[] arr;// khai bao rang arr la 1 bien kieu mang so nguyen --> chua co o nho
//        arr = new int[3];// bao rang arr la mang so nguyen 3 phan tu --> luc nay moi co o nho
        int[] arr = new int[3];
        arr[0] =1;
        arr[1] = 18;
        System.out.println("Kich thuoc mang: "+arr.length);
        int[][] mularr = new int[3][4];
        mularr[0][0] = 9;
        ArrayList arrL = new ArrayList();// tao 1 doi tuong array list -> doi tuong tap hop
        arrL.add(1);
        arrL.add("Hello");
        arrL.add(null);
        arrL.add(true);
        for (int i=0;i<arrL.size();i++){
            System.out.println(arrL.get(i));// khong phai arrL[i] ma la arrL.get(i)
        }

        // khoi tao 1 collection chi gom cac String
        ArrayList<String> arrS = new ArrayList<String>();
        arrS.add("xin chao");
        arrS.add("cac ban");
        for(String x:arrS){ // foreach --> x tuong duong arrS.get(i)
            System.out.println(x);
        }
        ArrayList<Dog> arrD = new ArrayList<Dog>();// tap hop cac doi tuong Dog
        Dog d1 = new Dog();
        arrD.add(d1);
        Dog d2 = new Dog();
        arrD.add(d2);
        for(int i=0;i<100;i++){
            arrD.add(new Dog());
        }
        System.out.println("So luong cho trong long: "+arrD.size());
        arrD.remove(d1);
        arrD.remove(d2);
        arrD.remove(arrD.get(13));
        arrD.remove(5);
        System.out.println("So luong cho trong long: "+arrD.size());
    }
}
