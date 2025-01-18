package pckg_vj5.zd1;

public class FstRangKnightDecorator extends AbsKnight implements KnightDecoratorInt {
    private AbsKnight knight;

    public FstRangKnightDecorator(AbsKnight knight) {
        super(knight.name, knight.powLevel + 10);
        this.knight = knight;
    }

    public FstRangKnightDecorator() {
        super("", 0);
    }

    @Override
    public void setKnightDecorator(AbsKnight knight) {
        this.knight = knight;
        this.name = knight.name;
        this.powLevel = knight.powLevel + 10;
    }

    @Override
    public void attack() {
        System.out.println("This one can attack with the knife or with a sword.");
    }

    @Override
    public int getPowerLevel() {
        return powLevel;
    }

    @Override
    public void avoidBattle() {
        System.out.println("Still, there are some concerns about your decision to avoid battle - now you can only walk fast.");
    }

    @Override
    public void description() {
        System.out.println("FstRangKnightDecorator is the first level character in the game...");
        System.out.println("FstRangKnightDecorator [knight=" + knight.toString() + ", name=" + name + ", powLevel=" + powLevel + "]");
    }
}
