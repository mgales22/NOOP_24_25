package pckg_vj7.zd1;

public class Apartment {
    private String location;
    private Category category;
    private double price;

    public Apartment(String location, Category category) {
        this.location = location;
        this.category = category;
        this.price = category.calculatePrice();
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return category.getDescription();
    }

    public double getPrice() {
        return price;
    }
}