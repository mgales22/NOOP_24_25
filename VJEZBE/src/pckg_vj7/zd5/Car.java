package pckg_vj7.zd5;

public class Car implements IVehicle {
    @Override
    public void start() {
        System.out.println("Starting car engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car engine...");
    }

    @Override
    public void maneuver() {
        System.out.println("Car maneuvering...");
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}