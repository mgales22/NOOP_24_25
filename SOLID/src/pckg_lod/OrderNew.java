package pckg_lod;

public class OrderNew {

    private Product product;

    public OrderNew(Product product){
        this.product = product;
    }

    public double calculateOrderPrice(){
        return product.getPrice();
    }
}
