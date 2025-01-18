package pckg_vj5.zd2;

public abstract class CarDecorator extends Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
}
