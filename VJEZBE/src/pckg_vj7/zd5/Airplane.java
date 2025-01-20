package pckg_vj7.zd5;

public class Airplane implements IVehicle {
    @Override
    public void start() {
        System.out.println("Starting airplane engines...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping airplane engines...");
    }

    @Override
    public void maneuver() {
        System.out.println("Airplane maneuvering...");
    }

    @Override
    public String getVehicleType() {
        return "Airplane";
    }
}
