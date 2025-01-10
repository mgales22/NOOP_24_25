package pckg_vj3.zd3;

import java.util.concurrent.ThreadLocalRandom;

public class NonMetricWthrServiceAdapter {

    private double tempF;
    private double wndSpdKn;



    public double getTempF() {
        return tempF;
    }

    public double getWndSpdKn() {
        return wndSpdKn;
    }

    public void readTempInF() {

        this.tempF = ThreadLocalRandom.current().nextDouble(0, 114);
    }

    public void readWndSpdInKn() {
        this.wndSpdKn = ThreadLocalRandom.current().nextDouble(0, 60);
    }

    public void showMeasuredData() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "NonMetricWthrServiceAdaptee [ tempF = " + tempF + ", degree Fahrenheit & wndSpdKn = " + wndSpdKn + " knots ]";
    }

}