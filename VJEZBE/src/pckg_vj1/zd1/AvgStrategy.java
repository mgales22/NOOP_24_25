package pckg_vj1.zd1;

public class AvgStrategy implements CalculationStrategy {
    @Override
    public float calculation(float a, float b) {
        return (a + b) / 2;
    }
}
