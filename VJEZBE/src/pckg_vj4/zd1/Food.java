package pckg_vj4.zd1;

public class Food {
    private double price;
    private int id;
    private FoodName name;

    public Food(FoodName name, double price) {
        this.price = price;
        this.name = name;
        this.id = name.ordinal();
    }

    @Override
    public String toString() {
        return "Food [price=" + price + ", id=" + id + ", enumFood=" + name + "]";
    }
}
