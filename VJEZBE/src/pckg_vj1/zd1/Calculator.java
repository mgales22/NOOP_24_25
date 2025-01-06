package pckg_vj1.zd1;

public class Calculator {
    private CalculationStrategy strategy;

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void display(float result) {
        System.out.println("Result: " + result);
    }

    public float performCalculation(float a, float b) {
        if (strategy == null) throw new IllegalStateException("No strategy selected");
        return strategy.calculation(a, b);
    }
}
