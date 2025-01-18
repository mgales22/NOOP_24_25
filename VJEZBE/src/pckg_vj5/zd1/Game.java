package pckg_vj5.zd1;

public class Game {
    public static void main(String[] args) {
        // Create base knight
        AbsKnight knight = new SimpleKnight("Valiant");
        knight.description();
        System.out.println("Power level -> " + knight.getPowerLevel());
        knight.attack();
        knight.avoidBattle();
        System.out.println("*".repeat(80));

        // Upgrade to first rank
        FstRangKnightDecorator fstRank = new FstRangKnightDecorator(knight);
        fstRank.description();
        System.out.println("Power level -> " + fstRank.getPowerLevel());
        fstRank.attack();
        fstRank.avoidBattle();
        System.out.println("*".repeat(80));

        // Upgrade to second rank
        SndRangKnightDecorator sndRank = new SndRangKnightDecorator(fstRank);
        sndRank.description();
        System.out.println("Power level -> " + sndRank.getPowerLevel());
        sndRank.attack();
        sndRank.avoidBattle();
        System.out.println("*".repeat(80));

        // Demonstrate cascade style upgrading
        AbsKnight arthur = new SndRangKnightDecorator(new FstRangKnightDecorator(new SimpleKnight("Arthur")));
        arthur.attack();
        arthur.avoidBattle();
        System.out.println(arthur.getPowerLevel());
        arthur.description();
    }
}
