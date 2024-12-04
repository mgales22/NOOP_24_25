package pckg_icecream;

public class HoneyOverflow extends IceCreamDecorator{
    protected HoneyOverflow(String name, double unitPrice, int amount, AbsIceCream component) {
        super(name, unitPrice, amount, component);
    }

    @Override
    protected double decoratedPrice() {
        double price = this.calculatePrice();
        return price;
    }
}
