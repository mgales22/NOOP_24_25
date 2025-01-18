package pckg_vj6.zd2;

public class SailingPropulsion extends PropulsionSystem {
    public SailingPropulsion() {
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SailingPropulsion [only on wind]";
    }
}
