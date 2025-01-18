package pckg_vj5.zd1;

public class SndRangKnightDecorator extends AbsKnight implements KnightDecoratorInt {
    private AbsKnight knight;

    public SndRangKnightDecorator(AbsKnight knight) {
        super(knight.name, knight.powLevel + 10);
        this.knight = knight;
    }

    public SndRangKnightDecorator() {
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
        System.out.println("This one can attack with knife, sword, mace and defend with a shield.");
    }

    @Override
    public int getPowerLevel() {
        return powLevel;
    }

    @Override
    public void avoidBattle() {
        System.out.println("Now you can run and jump over obstacles to avoid battle!");
    }

    @Override
    public void description() {
        System.out.println("SndRangKnightDecorator is the second level character in the game...");
        System.out.println("SndRangKnightDecorator [knight=" + knight.toString() + ", name=" + name + ", powLevel=" + powLevel + "]");
    }
}
