package pckg_vj6.zd2;

public class ShipFactoryCreator {
    public static ShipFactory createShipFactory(ShipType type) {
        switch (type) {
            case PIRATE:
                return new PirateShipFactory();
            case CARGO:
                return new CargoShipFactory();
            case TANKER:
                return new TankerShipFactory();
            case CRUISER:
                return new CruiserShipFactory();
            default:
                throw new IllegalArgumentException("There is no such ShipType!!!");
        }
    }
}
