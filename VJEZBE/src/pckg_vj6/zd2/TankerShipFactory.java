package pckg_vj6.zd2;

public class TankerShipFactory implements ShipFactory {
    @Override
    public Captain createCaptain(String name) {
        return new TankerCaptain(name);
    }

    @Override
    public Ship createShip(String name) {
        return new TankerShip(name);
    }

    @Override
    public Crew createCrew(int num) {
        return new TankerShipCrew(num);
    }

    @Override
    public PropulsionSystem createPropulsionSystem() {
        return new EngineMotorPropulsion();
    }
}
