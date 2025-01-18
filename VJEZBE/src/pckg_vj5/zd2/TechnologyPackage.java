package pckg_vj5.zd2;

public class TechnologyPackage extends CarDecorator {
    public TechnologyPackage(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 2500.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() +
                "\n + Technology Package (12\" Touch Screen, Navigation, Head-up Display) (+ €2,500)";
    }
}

