package pckg_vj2.zd1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineStore implements ObservableInt {
    private String storeName;
    private int storeId;
    private ArrayList<Customer> customers;
    private Item itm;

    public OnlineStore(String name) {
        customers = new ArrayList<Customer>();
        this.storeName = name;
        this.storeId = ThreadLocalRandom.current().nextInt(100000);
    }

    public void setItemAvailability(Item itm) {
        this.itm = itm;
        notifyCsts();
    }

    @Override
    public void add2AvailLst(Customer cst) {
        if (!customers.contains(cst)) {
            customers.add(cst);
            System.out.println("Added customer: " + cst.toString());
        }
    }

    @Override
    public void remove4AvailLst(Customer cst) {
        if (!customers.contains(cst)) {
            System.out.println("There is no such customer on our list");
        } else {
            customers.remove(cst);
            System.out.println("Removed customer: " + cst.toString());
        }
    }

    @Override
    public void notifyCsts() {
        for (Customer cst : customers) {
            cst.update(itm, storeName);
        }
    }
}
