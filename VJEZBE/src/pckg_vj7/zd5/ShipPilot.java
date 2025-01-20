package pckg_vj7.zd5;

public class ShipPilot implements IAutonomousPilot {
    @Override
    public void operate(IVehicle vehicle) {
        System.out.println("\nShip Pilot operating " + vehicle.getVehicleType());
        safetyCheck();
        vehicle.start();
        vehicle.maneuver();
        vehicle.stop();
    }

    @Override
    public void safetyCheck() {
        System.out.println("Performing maritime safety checks...");
    }

    @Override
    public String getPilotType() {
        return "Ship Pilot";
    }
}
