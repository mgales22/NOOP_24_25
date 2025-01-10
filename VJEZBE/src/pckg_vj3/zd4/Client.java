package pckg_vj3.zd4;

public class Client {
    public static void main(String[] args) {
        AirCondSystemFacade acSystem = new AirCondSystemFacade();

        System.out.println("=== Starting the AC System ===");
        acSystem.startAirConditioningSystem();

        System.out.println("\n=== After some time... ===\n");

        System.out.println("=== Stopping the AC System ===");
        acSystem.stopAirConditioningSystem();
    }
}
