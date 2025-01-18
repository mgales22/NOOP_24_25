package pckg_vj6.zd2;

public class TankerShipCrew extends Crew {
    public TankerShipCrew(int num) {
        this.num = num;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TankerShipCrew [num=" + num + "]";
    }
}
