package pckg_vj1.zd2;

public class CashOnDeliveryPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje pouzećem iznosa " + amount + " KM");
    }
}