package pckg_vj3.zd5;

public class Warehouse implements WarehouseInt {


    private String wrhName;
    private int whsID;
    private static int cnt = 1;


    public Warehouse(String name) {
        wrhName = name;
        this.whsID = cnt;
        cnt++;
    }

    @Override
    public void invoiceProcessing() {
        System.out.println("Processing specific invoice ....");
        System.out.println("For the sake of simplicity, we are taking as granted that the invoice is already known...");

    }

    @Override
    public void findCustomerItems() {
        System.out.println("Finding customer items from the invoice...");

    }

    @Override
    public void packingItems() {
        System.out.println("Putting the all avaible customer's items in a nice package...");

    }

    @Override
    public void dispatchment() {
        System.out.println(toString());
        System.out.println("All is ready for dispatching...");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");

    }

    @Override
    public String toString() {
        return "Warehouse [wrhName=" + wrhName + ", whsID=" + whsID + "]";
    }



}