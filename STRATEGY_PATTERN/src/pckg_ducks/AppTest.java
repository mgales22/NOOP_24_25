package pckg_ducks;

// ZA DOMA JEDNOSTAVNI KALKULATOR S PREDLOSKOM STRATEGY , ZBRAJANJE,ODUZIMANJE,MNOZENJE,DJELJENJE
public class AppTest {

    public static void main(String[] args) {
        DuckClientSimulator client = new DuckClientSimulator();
        client.startSimulation();
        client.setDuck(new MallardDuck());
        client.getDuck().setQuackable(new QuackLoud());
        client.getDuck().setFlyable(new FlyWithWings());
        client.startSimulation();
    }
}
