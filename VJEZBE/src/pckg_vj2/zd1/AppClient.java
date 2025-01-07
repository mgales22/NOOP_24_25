package pckg_vj2.zd1;

public class AppClient {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore("Best online store");
        Customer cust1 = new Customer("Fst customer");
        Customer cust2 = new Customer("Snd customer");
        store.setItemAvailability(new Item("Nike Zoom 500", "Sneakers"));
        store.add2AvailLst(cust1);
        store.add2AvailLst(cust2);
        store.notifyCsts();
    }
}