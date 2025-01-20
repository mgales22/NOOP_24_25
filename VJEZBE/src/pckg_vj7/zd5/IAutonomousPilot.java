package pckg_vj7.zd5;

public interface IAutonomousPilot {
    void operate(IVehicle vehicle);
    void safetyCheck();
    String getPilotType();
}