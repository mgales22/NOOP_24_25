package pckg_vj6.zd2;

public final class Simulator {
    private Captain captain;
    private Ship ship;
    private PropulsionSystem propulsion;
    private Crew crew;

    private String capName;
    private String shpName;
    private int numCrew;

    public Simulator(String cpName, String shpName, int num) {
        this.capName = cpName;
        this.shpName = shpName;
        this.numCrew = num;
    }

    public void runSimulation(ShipFactory sf) {
        this.captain = sf.createCaptain(capName);
        this.crew = sf.createCrew(numCrew);
        this.propulsion = sf.createPropulsionSystem();
        this.ship = sf.createShip(shpName);

        System.out.println("\n<<<<<<<<<<<<<<<<< Running simulation >>>>>>>>>>>>>>>>>");
        captain.description();
        crew.description();
        ship.description();
        propulsion.description();
    }

    public Captain getCaptain() {
        return captain;
    }

    public Ship getShip() {
        return ship;
    }

    public PropulsionSystem getPropulsion() {
        return propulsion;
    }

    public Crew getCrew() {
        return crew;
    }
}