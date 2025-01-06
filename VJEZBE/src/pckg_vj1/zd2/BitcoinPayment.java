package pckg_vj1.zd2;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje Bitcoinom iznosa " + amount + " KM");
    }
}
