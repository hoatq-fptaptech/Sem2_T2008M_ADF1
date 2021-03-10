package session.s9;

public class StaticDemo {
    public void run(){
        System.out.println("running...");
        boolean kt = StaticDemo.kiemTraSNT(1997);
        boolean kt2 =  kiemTraSNT(1222);
    }

    public static boolean kiemTraSNT(int n){
        if(n<2)return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    static class StaticOne{
        public void oneOne(){
            System.out.println("One one");
        }
    }

    class StaticTwo{
        public void twoTwo(){
            System.out.println(" 2  2");
        }
    }
}
