package pckg_vj2.zd1;

public class Item {
    private String itemName;
    private String itemCat;

    public Item(String name, String itemCat) {
        this.itemCat = itemCat;
        itemName = name;
    }

    @Override
    public String toString() {
        return "Item [itemName=" + itemName + ", itemCat=" + itemCat + "]";
    }
}