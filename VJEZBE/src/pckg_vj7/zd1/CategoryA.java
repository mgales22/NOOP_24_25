package pckg_vj7.zd1;

public class CategoryA implements Category {
    @Override
    public double calculatePrice() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Luxury apartment with premium amenities";
    }
}
