package pckg_vj3.zd5;

public class Shipping implements ShippingInt {

    private Customer customer;

    public Shipping(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void roadTransportation() {
        System.out.println("Some road transportation...");
        System.out.println("Final destination:");
        System.out.println(customer.toString());

    }

    @Override
    public void seaTransportation() {
        System.out.println("Some sea transportation...");
        System.out.println("Final destination:");
        System.out.println(customer.toString());

    }

    @Override
    public void deliveryNotification() {
        System.out.println("Package delivered - confirmed by -> " + customer.getName() + " " + customer.getSurname());

    }

    @Override
    public void airTransportation() {
        System.out.println("Some air transportation...");
        System.out.println("Final destination:");
        System.out.println(customer.toString());

    }

    @Override
    public void someDesiredShipmentMethod() {

        System.out.println("Some shipment method -> can combine some or all types of transportation...");
        System.out.println("Final destination:");
        System.out.println(customer.toString());
    }

}