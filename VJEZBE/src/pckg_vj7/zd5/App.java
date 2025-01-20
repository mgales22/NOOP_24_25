package pckg_vj7.zd5;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Testing different vehicle-pilot combinations ===");

        // Pravilan slučaj
        AppClient shipClient = new AppClient("ship", new Ship());
        shipClient.startMission();

        AppClient helicopterClient = new AppClient("helicopter", new Helicopter());
        helicopterClient.startMission();

        // Neobičan slučaj
        AppClient mixedClient = new AppClient("helicopter", new Ship());
        mixedClient.startMission();

        AppClient carClient = new AppClient("car", new Car());
        carClient.startMission();
    }
}
