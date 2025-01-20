package pckg_vj7.zd1;

public class App {
    public static void main(String[] args) {
        Category categoryA = new CategoryA();
        Category categoryB = new CategoryB();
        Category categoryC = new CategoryC();

        Apartment luxuryApartment = new Apartment("Zagreb Center", categoryA);
        Apartment standardApartment = new Apartment("Split Riva", categoryB);
        Apartment basicApartment = new Apartment("Zadar Poluotok", categoryC);

        User user = new User("Hrvoje Horvat");

        user.setBookingStrategy(new InstantBooking());
        user.setPaymentStrategy(new CreditCardPayment());

        user.makeBooking(luxuryApartment);
        user.makePayment(luxuryApartment.getPrice());

        user.setPaymentStrategy(new CryptoPayment());

        user.makeBooking(standardApartment);
        user.makePayment(standardApartment.getPrice());

        user.cancelBooking(standardApartment);

        user.makeCommentOnAccommodation(luxuryApartment, "Great place!");
    }
}
