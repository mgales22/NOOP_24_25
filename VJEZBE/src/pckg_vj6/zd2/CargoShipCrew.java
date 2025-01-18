package pckg_vj6.zd2;

public class CargoShipCrew extends Crew {
    public CargoShipCrew(int num) {
        this.num = num;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CargoShipCrew [num=" + num + "]";
    }
}
