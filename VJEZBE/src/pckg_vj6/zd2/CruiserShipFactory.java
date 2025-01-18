package pckg_vj6.zd2;

public class CruiserShipFactory implements ShipFactory {
    @Override
    public Captain createCaptain(String name) {
        return new CruiserCaptain(name);
    }

    @Override
    public Ship createShip(String name) {
        return new CruiserShip(name);
    }

    @Override
    public Crew createCrew(int num) {
        return new CruiserShipCrew(num);
    }

    @Override
    public PropulsionSystem createPropulsionSystem() {
        return new EngineMotorPropulsion();
    }
}
