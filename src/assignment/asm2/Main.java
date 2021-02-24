package assignment.asm2;

public class Main {
    public static void main(String[] args){
        Fraction ft1 = new Fraction();
        ft1.setTuSo(1);
        ft1.setMauSo(2);
        Fraction ft2 = new Fraction();
        ft2.setTuSo(1);
        ft2.setMauSo(3);

        Fraction t = ft1.add(ft2);
        t.printFraction();
    }
}
