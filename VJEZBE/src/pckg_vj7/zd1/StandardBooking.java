package pckg_vj7.zd1;

public class StandardBooking implements IBookingStrategy {
    @Override
    public void book(Apartment apartment) {
        System.out.println("Processing standard booking for apartment at " +
                apartment.getLocation());
    }

    @Override
    public void cancel(Apartment apartment) {
        System.out.println("Processing standard cancellation for apartment at " +
                apartment.getLocation());
    }
}
