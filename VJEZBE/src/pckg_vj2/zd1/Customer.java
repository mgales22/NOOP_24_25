package pckg_vj2.zd1;

public class Customer implements CustObserverInt {
    private String userName;
    private int id;
    private static int cnt = 1;

    public Customer(String usrn) {
        this.id = cnt++;
        this.userName = usrn;
    }

    @Override
    public void update(Item itm, String storeName) {
        System.out.println("\nNotification for customer: ");
        System.out.println(toString());
        System.out.println("****************** " + storeName + " *********************");
        System.out.println("Item: " + itm.toString());
        System.out.println("Is now available in our store....");
        System.out.println("////////////////////////////////////////////////////////////\n");
    }

    @Override
    public String toString() {
        return "Customer [userName=" + userName + ", id=" + id + "]";
    }
}
