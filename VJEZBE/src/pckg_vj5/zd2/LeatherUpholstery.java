package pckg_vj5.zd2;

public class LeatherUpholstery extends CarDecorator {
    public LeatherUpholstery(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 1500.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n + Premium Leather Upholstery (+ €1,500)";
    }
}
