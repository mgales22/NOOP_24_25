package pckg_vj7.zd5;

public class HelicopterPilot implements IAutonomousPilot {
    @Override
    public void operate(IVehicle vehicle) {
        System.out.println("\nHelicopter Pilot operating " + vehicle.getVehicleType());
        safetyCheck();
        vehicle.start();
        vehicle.maneuver();
        vehicle.stop();
    }

    @Override
    public void safetyCheck() {
        System.out.println("Performing helicopter safety checks...");
    }

    @Override
    public String getPilotType() {
        return "Helicopter Pilot";
    }
}
