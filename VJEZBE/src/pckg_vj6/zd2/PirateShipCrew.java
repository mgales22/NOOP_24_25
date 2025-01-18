package pckg_vj6.zd2;

public class PirateShipCrew extends Crew {
    public PirateShipCrew(int num) {
        this.num = num;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PirateShipCrew [num=" + num + "]";
    }
}
