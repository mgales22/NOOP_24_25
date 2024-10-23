package pckg_gui_calculator;

public class DivisionStrategy implements CalculationStrategy{
    @Override
    public double performCalculation(double fstNum, double sndNum) {
        if(sndNum == 0){
            System.out.println("Division with zero is not allowed!");
            throw new ArithmeticException("Zero division error!");
        }else{
            return fstNum / sndNum;
        }
    }

    @Override
    public String toString() {
        return "DivisionStrategy";
    }
}
