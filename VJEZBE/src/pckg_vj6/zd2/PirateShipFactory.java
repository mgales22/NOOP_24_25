package pckg_vj6.zd2;

public class PirateShipFactory implements ShipFactory {
    @Override
    public Captain createCaptain(String captainName) {
        return new PirateCaptain(captainName);
    }

    @Override
    public Ship createShip(String sname) {
        return new PirateShip(sname);
    }

    @Override
    public Crew createCrew(int num) {
        return new PirateShipCrew(num);
    }

    @Override
    public PropulsionSystem createPropulsionSystem() {
        return new SailingPropulsion();
    }
}
