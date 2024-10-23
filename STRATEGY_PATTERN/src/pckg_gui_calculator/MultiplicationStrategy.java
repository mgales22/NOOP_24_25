package pckg_gui_calculator;

public class MultiplicationStrategy implements CalculationStrategy{
    @Override
    public double performCalculation(double fstNum, double sndNum) {
        return fstNum * sndNum;
    }

    @Override
    public String toString() {
        return "MultiplicationStrategy";
    }
}
