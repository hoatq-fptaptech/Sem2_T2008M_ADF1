package lab.s4;

public class Main {
    public static void main(String[] args){
        Account ac1 = new Account();
        ac1.setId(1);
        ac1.setName("Nguyen Van A");
        ac1.setBalance(50000);
        Account ac2 = new Account();
        ac2.setId(2);
        ac2.setName("Le Van B");
        ac2.setBalance(20000);
        ac1.credit(10000);
        ac1.debit(40000);
        ac2.transferTo(ac1,30000);
        System.out.println("AC1: "+ac1.getBalance());//20 000
        System.out.println("AC2: "+ac2.getBalance());//20 000
    }
}
