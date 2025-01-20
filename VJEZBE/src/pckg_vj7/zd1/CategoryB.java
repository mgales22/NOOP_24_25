package pckg_vj7.zd1;

public class CategoryB implements Category {
    @Override
    public double calculatePrice() {
        return 75.0;
    }

    @Override
    public String getDescription() {
        return "Standard apartment with good amenities";
    }
}