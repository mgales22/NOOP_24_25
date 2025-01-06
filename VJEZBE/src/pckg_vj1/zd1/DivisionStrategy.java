package pckg_vj1.zd1;

class DivisionStrategy implements CalculationStrategy {
    @Override
    public float calculation(float a, float b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
