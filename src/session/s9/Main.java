package session.s9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
//        int x = 1999;
//        if(StaticDemo.kiemTraSNT(x)){
//            System.out.println(x+ " la so nguyen to");
//        }else {
//            System.out.println(x+ " ko phai la so nguyen to");
//        }
//
//        StaticDemo.StaticOne o1 = new StaticDemo.StaticOne();
//        o1.oneOne();
//
//        StaticDemo.StaticTwo t1 = new StaticDemo().new StaticTwo();
//        t1.twoTwo();
        int c = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap a = ");
            int a = sc.nextInt();
            System.out.println("Nhap b = ");
            int b = sc.nextInt();
            if(b >10){
                throw new Exception("Khong duoc phep de so chia qua lon..");
            }
            a++;
            System.out.println("a = " + a);
            c = a / b;
            System.out.println("c = " + c);
        }catch (ArithmeticException ar){
            System.out.println("Loi toan hoc");
        }catch (Exception e){
            System.out.println("Vui long cap nhat");
        }finally {
            System.out.println("Bat ke dung hay sai van vao day het...");
            if(c == 0){
                c = 100;
            }
        }

        System.out.println("Xong xuoi... c = "+c);
    }
}
