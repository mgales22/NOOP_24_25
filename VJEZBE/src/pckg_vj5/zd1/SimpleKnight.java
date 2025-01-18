package pckg_vj5.zd1;

public class SimpleKnight extends AbsKnight {
    public SimpleKnight(String name) {
        super(name, 10);
    }

    @Override
    public void attack() {
        System.out.println("Can only attack with the bare hands...");
    }

    @Override
    public int getPowerLevel() {
        return powLevel;
    }

    @Override
    public void avoidBattle() {
        System.out.println("Better decide on a time to avoid battle - remember that you can only walk...");
    }

    @Override
    public void description() {
        System.out.println("SimpleKnight is the zero level character in the game...");
        System.out.println("SimpleKnight [name=" + name + ", powLevel=" + powLevel + "]");
    }

    @Override
    public String toString() {
        return "SimpleKnight [name=" + name + ", powLevel=" + powLevel + "]";
    }
}
