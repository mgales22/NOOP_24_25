package pckg_vj7.zd1;

public class User {
    private String name;
    private String id;
    private IPaymentStrategy paymentStrategy;
    private IBookingStrategy bookingStrategy;

    public User(String name) {
        this.name = name;
        this.id = generateId();
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setBookingStrategy(IBookingStrategy bookingStrategy) {
        this.bookingStrategy = bookingStrategy;
    }

    public void makeBooking(Apartment apartment) {
        if (bookingStrategy == null) {
            throw new IllegalStateException("Booking strategy not set");
        }
        bookingStrategy.book(apartment);
    }

    public void makePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.processPayment(amount);
    }

    public void cancelBooking(Apartment apartment) {
        if (bookingStrategy == null) {
            throw new IllegalStateException("Booking strategy not set");
        }
        bookingStrategy.cancel(apartment);
    }

    public void makeCommentOnAccommodation(Apartment apartment, String comment) {
        System.out.println("User " + name + " commented on apartment at " +
                apartment.getLocation() + ": " + comment);
    }

    private String generateId() {
        return "USER_" + System.currentTimeMillis();
    }
}
