package pckg_lod;

public class Customer {

    private Order order;
    public Customer(Order order){
        this.order = order;
    }

    public Order getOrder(){
        return this.order;
    }
}
