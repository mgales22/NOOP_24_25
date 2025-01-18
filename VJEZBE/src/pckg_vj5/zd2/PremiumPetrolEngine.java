package pckg_vj5.zd2;

public class PremiumPetrolEngine extends CarDecorator {
    public PremiumPetrolEngine(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 3000.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n + 2.0L 180HP Turbo Petrol Engine (+ €3,000)";
    }
}
