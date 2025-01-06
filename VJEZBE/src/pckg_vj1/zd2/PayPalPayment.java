package pckg_vj1.zd2;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje PayPalom iznosa " + amount + " KM");
    }
}
