package pckg_ocp;

// Open-Closed Principle - Good example
public class WebShopNew {
    private PaymentInt paymentMethod;

    public WebShopNew() {
        this.paymentMethod = new CreditCardPayment();
    }

    public void setPaymentMethod(PaymentInt paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void performPayment(double amount){
        paymentMethod.performPayment(amount);
    }
}
