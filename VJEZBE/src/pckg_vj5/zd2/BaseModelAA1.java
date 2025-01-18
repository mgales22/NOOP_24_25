package pckg_vj5.zd2;

public class BaseModelAA1 extends Car {
    public BaseModelAA1() {
        description = "SUV AA1 Base Model (Front-wheel drive, 1.6L 105HP Petrol Engine)";
        basePrice = 25000.0;
    }

    @Override
    public double getCost() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return description;
    }
}