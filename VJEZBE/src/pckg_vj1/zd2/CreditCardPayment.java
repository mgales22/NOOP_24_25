package pckg_vj1.zd2;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje karticom iznosa " + amount + " KM");
    }
}
