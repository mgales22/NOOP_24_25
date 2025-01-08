package pckg_ocp;

//KRIVA LOGIKA - OCP
public class WebShop {

    private Payment payment;

    public WebShop(Payment payment){
        this.payment = payment;
    }

    public void performPayment(int paymentChoice,double amount){
        switch(paymentChoice){
            case 1:
                Payment.creditCardPayment(amount);
                break;
            case 2:
                Payment.cashPayment(amount);
                break;
            case 3:
                Payment.payPalPayment(amount);
                break;
            default:
                System.out.println("Invalid payment choice! (1-3)");
        }
    }
}
