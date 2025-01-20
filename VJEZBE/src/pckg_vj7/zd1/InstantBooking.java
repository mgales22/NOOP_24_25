package pckg_vj7.zd1;

public class InstantBooking implements IBookingStrategy {
    @Override
    public void book(Apartment apartment) {
        System.out.println("Processing instant booking for apartment at " +
                apartment.getLocation());
    }

    @Override
    public void cancel(Apartment apartment) {
        System.out.println("Processing instant cancellation for apartment at " +
                apartment.getLocation());
    }
}

