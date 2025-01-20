package pckg_vj7.zd1;

public class CryptoPayment implements IPaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of " + amount);
    }
}

