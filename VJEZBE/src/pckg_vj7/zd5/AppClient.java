package pckg_vj7.zd5;

public class AppClient {
    private final IAutonomousPilot pilot;
    private final IVehicle vehicle;

    public AppClient(String pilotType, IVehicle vehicle) {
        this.pilot = PilotFactory.createPilot(pilotType);
        this.vehicle = vehicle;
    }

    public void startMission() {
        pilot.operate(vehicle);
    }
}

