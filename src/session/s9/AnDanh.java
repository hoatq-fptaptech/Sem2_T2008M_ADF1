package session.s9;
import session.s6.Human;
import session.s7.IHuman;
public class AnDanh {
    public static void main(String[] args){
        int x = 1000;
        Human h = new Human() {
            @Override
            public void showInfo() {
                System.out.println("Lam gi do "+x);
            }
        };

        h.showInfo();

        IHuman ih = new IHuman() {
            @Override
            public void eat() {
                System.out.println(x+10);
            }

            @Override
            public void jump() {
                System.out.println(x+20);
            }
        };
        Is ii = new Is() {
            @Override
            public void callMe(String msg) {
                System.out.println("Call me.."+msg);
            }
        };
        Is ii2 = (String msg)->{ // lambda expression
            System.out.println("Call me.."+msg);
        };
    }
}
