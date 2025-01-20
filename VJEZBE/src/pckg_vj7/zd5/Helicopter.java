package pckg_vj7.zd5;

public class Helicopter implements IVehicle {
    @Override
    public void start() {
        System.out.println("Starting helicopter rotors...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping helicopter rotors...");
    }

    @Override
    public void maneuver() {
        System.out.println("Helicopter maneuvering...");
    }

    @Override
    public String getVehicleType() {
        return "Helicopter";
    }
}
