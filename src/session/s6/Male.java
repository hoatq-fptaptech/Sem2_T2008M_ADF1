package session.s6;

import session.s7.IHuman;
import session.s7.IMale;

public class Male extends Human implements IHuman, IMale {

    public void showInfo() {
        System.out.println("Name: "+name);
        System.out.println("Birthday:"+birthday);
    }

    @Override
    public void eat() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void kiss() {

    }

    @Override
    public void playGame() {

    }
}
