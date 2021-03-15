package adf2.session.s1;

public class Cat implements Comparable<Cat>{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
//        return this.age - o.age;
        return this.name.compareTo(o.name);
    }
}
