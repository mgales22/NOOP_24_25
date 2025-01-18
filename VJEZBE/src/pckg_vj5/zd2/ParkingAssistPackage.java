package pckg_vj5.zd2;

public class ParkingAssistPackage extends CarDecorator {
    public ParkingAssistPackage(Car car) {
        super(car);
    }

    @Override
    public double getCost() {
        return car.getCost() + 1200.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() +
                "\n + Parking Assist Package (360° Camera, Automatic Parking) (+ €1,200)";
    }
}
