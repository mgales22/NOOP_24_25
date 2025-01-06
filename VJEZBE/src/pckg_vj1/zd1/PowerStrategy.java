package pckg_vj1.zd1;

public class PowerStrategy implements CalculationStrategy {
    @Override
    public float calculation(float a, float b) {
        return (float) Math.pow(a, (int)b);
    }
}
