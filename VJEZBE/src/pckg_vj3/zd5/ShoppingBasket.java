package pckg_vj3.zd5;

import java.util.ArrayList;

public class ShoppingBasket {

    private String userName;
    private ArrayList<Item> items;

    public ShoppingBasket(String userName) {
        this.userName = userName;
        items = new ArrayList<Item>();
    }

    public void add2ShoppingBasket(Item itm) {
        items.add(itm);
    }

    public void remove4ShoppingBasket(Item it) {
        items.remove(it);
    }

    public ArrayList<Item> confirAll(){
        return items;
    }

    public void listAllItems() {
        for(Item itm : items) {
            System.out.println(itm.toString());
        }
    }

}

