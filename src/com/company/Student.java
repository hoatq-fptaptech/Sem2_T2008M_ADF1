package com.company;

public class Student {
    int id;
    String name;
    int age;

    void run(){
        eat();
        System.out.println(this.name+ " Running...");
    }

    void eat(){
        System.out.println(this.name+ "eating..");
    }
}
