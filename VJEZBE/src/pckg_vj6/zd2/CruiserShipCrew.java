package pckg_vj6.zd2;

public class CruiserShipCrew extends Crew {
    public CruiserShipCrew(int num) {
        this.num = num;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CruiserShipCrew [num=" + num + "]";
    }
}
