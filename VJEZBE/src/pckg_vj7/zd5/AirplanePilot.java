package pckg_vj7.zd5;

public class AirplanePilot implements IAutonomousPilot {
    @Override
    public void operate(IVehicle vehicle) {
        System.out.println("\nAirplane Pilot operating " + vehicle.getVehicleType());
        safetyCheck();
        vehicle.start();
        vehicle.maneuver();
        vehicle.stop();
    }

    @Override
    public void safetyCheck() {
        System.out.println("Performing airplane safety checks...");
    }

    @Override
    public String getPilotType() {
        return "Airplane Pilot";
    }
}