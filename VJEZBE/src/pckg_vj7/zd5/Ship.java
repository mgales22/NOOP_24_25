package pckg_vj7.zd5;

public class Ship implements IVehicle {
    @Override
    public void start() {
        System.out.println("Starting ship engines...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping ship engines...");
    }

    @Override
    public void maneuver() {
        System.out.println("Ship maneuvering...");
    }

    @Override
    public String getVehicleType() {
        return "Ship";
    }
}
