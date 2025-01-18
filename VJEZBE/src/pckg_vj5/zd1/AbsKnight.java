package pckg_vj5.zd1;

public abstract class AbsKnight {
    protected String name;
    protected int powLevel;

    public AbsKnight(String name, int powLevel) {
        this.name = name;
        this.powLevel = powLevel;
    }

    public abstract void attack();
    public abstract int getPowerLevel();
    public abstract void avoidBattle();
    public abstract void description();
}
