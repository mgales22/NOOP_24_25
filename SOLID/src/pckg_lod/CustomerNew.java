package pckg_lod;

public class CustomerNew {

    private OrderNew order;
    public CustomerNew(OrderNew order){
        this.order = order;
    }

    public double calculateFinalPrice(){
        return order.calculateOrderPrice();
    }
}
