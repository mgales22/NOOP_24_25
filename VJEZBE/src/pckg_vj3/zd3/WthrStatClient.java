package pckg_vj3.zd3;

public class WthrStatClient {

    private static PrimaryInterface objMes;

    public static void main(String[] args) {

        objMes = new MetricWthrServiceStation();
        objMes.readTempC();
        objMes.readWndSpdms();
        objMes.showWthrData();
        objMes = new Adapter(new NonMetricWthrServiceAdapter());
        objMes.readTempC();
        objMes.readWndSpdms();
        objMes.showWthrData();
    }
}
