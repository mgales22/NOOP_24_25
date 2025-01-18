package pckg_vj5.zd2;

public class SportUpholstery extends CarDecorator {
    public SportUpholstery(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 1200.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n + Sport Fabric Upholstery (+ €1,200)";
    }
}
