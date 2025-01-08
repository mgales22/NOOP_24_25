package pckg_lod;

public class Test {

    public static void main(String[] args) {
        Product product = new Product(250);
        Order order = new Order(product);
        Customer customer = new Customer(order);
        //LoD princip dizajna, customer nebi smio imati pristup getProductu i getPriceu, getOrder je uredu jer ima field order u sebi
        double price = customer.getOrder().getProduct().getPrice();

        System.out.println("Price: " + price);
    }
}
