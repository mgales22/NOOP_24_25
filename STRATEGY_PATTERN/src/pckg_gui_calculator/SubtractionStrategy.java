package pckg_gui_calculator;

public class SubtractionStrategy implements CalculationStrategy{
    @Override
    public double performCalculation(double fstNum, double sndNum) {
        return fstNum - sndNum;
    }
}
