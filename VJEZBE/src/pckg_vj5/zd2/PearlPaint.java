package pckg_vj5.zd2;

public class PearlPaint extends CarDecorator {
    private String color;

    public PearlPaint(Car car, String color) {
        super(car);
        this.color = color;
    }

    @Override
    public double getCost() {
        return car.getCost() + 1200.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n + Pearl Paint: " + color + " (+ €1,200)";
    }
}
