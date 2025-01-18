package pckg_vj6.zd2;

public class CruiserShip extends Ship {
    public CruiserShip(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CruiserShip [name=" + name + "]";
    }
}
