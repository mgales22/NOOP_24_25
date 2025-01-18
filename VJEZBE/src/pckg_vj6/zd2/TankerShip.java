package pckg_vj6.zd2;

public class TankerShip extends Ship {
    public TankerShip(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TankerShip [name=" + name + "]";
    }
}
