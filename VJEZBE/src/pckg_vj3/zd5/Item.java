package pckg_vj3.zd5;

public class Item {
    private String itemName;
    private String itemCategory;
    private double price;

    public Item(String itemName, String itemCategory) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getItemName() { return itemName; }
    public String getItemCategory() { return itemCategory; }
}