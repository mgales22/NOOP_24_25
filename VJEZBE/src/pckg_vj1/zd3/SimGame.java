package pckg_vj1.zd3;

public class SimGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Starting game...\n");

        System.out.println(hero);
        hero.setAndApplyAbilityStrategy(new ZeroStrategy());

        System.out.println("\nLevel 1 completed - gained Fast Running!");
        hero.setAndApplyAbilityStrategy(new FastRunningStrategy());

        System.out.println("\nLevel 2 completed - gained Flying!");
        hero.setAndApplyAbilityStrategy(new FlyingStrategy());

        System.out.println("\nLevel 3 completed - gained Double Strength!");
        hero.setAndApplyAbilityStrategy(new DoubleStrengthStrategy());

        System.out.println("\nLevel 4 completed - gained High Jump!");
        hero.setAndApplyAbilityStrategy(new HighJumpStrategy());

        System.out.println("\nLevel 5 completed - gained Freeze Breath!");
        hero.setAndApplyAbilityStrategy(new FreezeBreathStrategy());
    }
}
