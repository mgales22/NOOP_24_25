package pckg_ocp;

public class BitCoinPayment implements PaymentInt{
    @Override
    public void performPayment(double amount) {
        System.out.println(getClass().getSimpleName() + " payment of amount: " + amount + " performed!");
    }
}
