package pckg_vj6.zd2;

public class SimApp {
    public static void main(String[] args) {
        Simulator simulator = new Simulator("Jack", "Pearl", 25);
        simulator.runSimulation(ShipFactoryCreator.createShipFactory(ShipType.PIRATE));

        Simulator simulator2 = new Simulator("John", "Titanic", 50);
        simulator2.runSimulation(ShipFactoryCreator.createShipFactory(ShipType.CARGO));

        Simulator simulator3 = new Simulator("Jane", "Queen Anne", 100);
        simulator3.runSimulation(ShipFactoryCreator.createShipFactory(ShipType.CRUISER));

        Simulator simulator4 = new Simulator("Jill", "Black Pearl", 75);
        simulator4.runSimulation(ShipFactoryCreator.createShipFactory(ShipType.TANKER));
    }
}
