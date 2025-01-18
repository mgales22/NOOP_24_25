package pckg_vj5.zd2;

public class CarConfigurator {
    public static void main(String[] args) {
        // Osnovni model s nekoliko dodataka
        System.out.println("=== Configuration 1: Basic Upgrades ===");
        Car car1 = new BaseModelAA1();
        car1 = new MetallicPaint(car1, "Granite Grey");
        car1 = new ParkingAssistPackage(car1);

        System.out.println(car1.getDescription());
        System.out.println("Total Price: €" + car1.getCost());

        // Premium model s full opremom
        System.out.println("=== Configuration 2: Premium Specification ===");
        Car car2 = new BaseModelAA1();
        car2 = new PremiumPetrolEngine(car2);
        car2 = new PearlPaint(car2, "Crystal White");
        car2 = new LeatherUpholstery(car2);
        car2 = new AdvancedSafetyPackage(car2);
        car2 = new TechnologyPackage(car2);
        car2 = new ComfortPackage(car2);

        System.out.println(car2.getDescription());
        System.out.println("Total Price: €" + car2.getCost());
    }
}
