package pckg_icecream;

public class HazelnutPowder extends IceCreamDecorator{
    protected HazelnutPowder(String name, double unitPrice, int amount, AbsIceCream component) {
        super(name, unitPrice, amount, component);
    }

    @Override
    protected double decoratedPrice() {
        double price = this.calculatePrice();
        return price;
    }
}
