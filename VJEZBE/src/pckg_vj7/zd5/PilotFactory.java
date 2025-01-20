package pckg_vj7.zd5;

public class PilotFactory {
    public static IAutonomousPilot createPilot(String type) {
        return switch (type.toLowerCase()) {
            case "ship" -> new ShipPilot();
            case "helicopter" -> new HelicopterPilot();
            case "airplane" -> new AirplanePilot();
            case "car" -> new CarDriver();
            default -> throw new IllegalArgumentException("Unknown pilot type: " + type);
        };
    }
}
