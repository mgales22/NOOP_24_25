package pckg_vj5.zd2;

public class AdvancedSafetyPackage extends CarDecorator {
    public AdvancedSafetyPackage(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 2000.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() +
                "\n + Advanced Safety Package (Adaptive Cruise Control, Lane Keeping Assist, " +
                "Blind Spot Monitor) (+ €2,000)";
    }
}
