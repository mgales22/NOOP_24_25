package pckg_vj6.zd2;

public class CargoShip extends Ship {
    public CargoShip(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CargoShip [name=" + name + "]";
    }
}
