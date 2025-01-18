package pckg_vj5.zd2;

public class DieselEngine extends CarDecorator {
    public DieselEngine(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 2500.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n + 2.0L 150HP Diesel Engine (+ €2,500)";
    }
}
