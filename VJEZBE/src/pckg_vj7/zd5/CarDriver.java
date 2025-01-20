package pckg_vj7.zd5;

public class CarDriver implements IAutonomousPilot {
    @Override
    public void operate(IVehicle vehicle) {
        System.out.println("\nCar Driver operating " + vehicle.getVehicleType());
        safetyCheck();
        vehicle.start();
        vehicle.maneuver();
        vehicle.stop();
    }

    @Override
    public void safetyCheck() {
        System.out.println("Performing car safety checks...");
    }

    @Override
    public String getPilotType() {
        return "Car Driver";
    }
}
