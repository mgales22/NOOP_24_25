package pckg_vj5.zd2;

public class MetallicPaint extends CarDecorator {
    private String color;

    public MetallicPaint(Car car, String color) {
        super(car);
        this.color = color;
    }

    @Override
    public double getCost() {
        return car.getCost() + 800.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n + Metallic Paint: " + color + " (+ €800)";
    }
}