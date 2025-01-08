package pckg_ocp;

public class Payment {

    //KRIVA LOGIKA
    public static void creditCardPayment(double amount){
        System.out.println("Credit card payment of amount: " + amount);
    }

    public static void payPalPayment(double amount){
        System.out.println("PayPal payment of amount: " + amount);
    }

    public static void cashPayment(double amount){
        System.out.println("Cash payment of amount: " + amount);
    }

}
