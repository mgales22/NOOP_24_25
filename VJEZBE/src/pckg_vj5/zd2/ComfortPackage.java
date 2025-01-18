package pckg_vj5.zd2;

public class ComfortPackage extends CarDecorator {
    public ComfortPackage(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 1800.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() +
                "\n + Comfort Package (Heated Seats, Ambient Lighting, Premium Audio) (+ €1,800)";
    }
}
