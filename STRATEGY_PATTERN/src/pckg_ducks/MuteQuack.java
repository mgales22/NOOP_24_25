package pckg_ducks;

public class MuteQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
