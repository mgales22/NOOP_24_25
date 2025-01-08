package pckg_lod;

public class TestNew {

    public static void main(String[] args) {
        Product product = new Product(250);
        OrderNew order = new OrderNew(product);
        CustomerNew customer = new CustomerNew(order);

        //bolji princip dizajna (LoD)
        System.out.println("Price is: " + customer.calculateFinalPrice());

    }
}
