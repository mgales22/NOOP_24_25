package pckg_vj1.zd2;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        double amount = 100.0;

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(amount);

        cart.setPaymentStrategy(new CashOnDeliveryPayment());
        cart.checkout(amount);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(amount);

        cart.setPaymentStrategy(new BitcoinPayment());
        cart.checkout(amount);
    }
}
