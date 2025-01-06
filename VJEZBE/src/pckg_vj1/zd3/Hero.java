package pckg_vj1.zd3;

public class Hero {
    private AbilityStrategy abilityStrategy;

    public Hero() {
        this.abilityStrategy = new ZeroStrategy();
    }

    public void setAndApplyAbilityStrategy(AbilityStrategy strategy) {
        this.abilityStrategy = strategy;
        this.abilityStrategy.applyAbility();
    }

    public String toString() {
        return "Hero with current ability: " + abilityStrategy.getClass().getSimpleName();
    }
}
