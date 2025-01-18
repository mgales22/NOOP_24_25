package pckg_vj6.zd2;

public class CargoShipFactory implements ShipFactory {
    @Override
    public Captain createCaptain(String name) {
        return new CargoCaptain(name);
    }

    @Override
    public Ship createShip(String name) {
        return new CargoShip(name);
    }

    @Override
    public Crew createCrew(int num) {
        return new CargoShipCrew(num);
    }

    @Override
    public PropulsionSystem createPropulsionSystem() {
        return new EngineMotorPropulsion();
    }
}
