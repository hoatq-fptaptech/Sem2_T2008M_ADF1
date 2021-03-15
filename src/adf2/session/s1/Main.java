package adf2.session.s1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        HashSet<String> hsString = new HashSet<>();
        hsString.add("hello");
        hsString.add("world");
        hsString.add("hello");
        for(String s:hsString){
            System.out.println(s);
        }
        // nhap 1 mang 10 so ko trung nhau.
        HashSet<Integer> randomArr = new HashSet<>();
//        Scanner sc = new Scanner(System.in);
//        while (randomArr.size()<10){
//            System.out.println("Nhap 1 so:");
//            randomArr.add(sc.nextInt());
//        }
//        System.out.println("Sau khi nhap xong:");
//        for (Integer i:randomArr){
//            System.out.println(i);
//        }

        PriorityQueue<String> prArr = new PriorityQueue<>();
        prArr.add("hello");
        prArr.add("abc");
        prArr.add("xin chao");
        prArr.add("aaa");
        for(String s:prArr){
            System.out.println(s);
        }

        PriorityQueue<Cat> cPr = new PriorityQueue<>();
        cPr.add(new Cat("abc",8));
        cPr.add(new Cat("bbb",7));
        cPr.add(new Cat("aaa",6));
        Iterator<Cat> i = cPr.iterator();
        while (i.hasNext()){
            Cat x = i.next();
            System.out.println(x.name+"--"+x.age);
            i.remove();
        }

        HashMap<String,String>  hmArr = new HashMap<>();
        hmArr.put("t2008m","Lop hoc mon ADF2");
        hmArr.put("t1907A","Lop Project");

        System.out.println(hmArr.get("t2008m"));

        HashMap<Integer,String> hhAr = new HashMap<>();
        hhAr.put(1,"xin chao cac ban");
        System.out.println(hhAr.get(1));
    }
}
