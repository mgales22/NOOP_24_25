package pckg_icecream;

public abstract class IceCreamDecorator extends AbsIceCream{

    protected AbsIceCream component;

    protected IceCreamDecorator(String name, double unitPrice, int amount, AbsIceCream component) {
        super(name, unitPrice, amount);
        this.component = component;
    }

    protected abstract double decoratedPrice();

    @Override
    protected double calculatePrice() {
        double price = this.component.calculatePrice() + unitPrice * amount;
        System.out.println(getClass().getSimpleName() + " decorates: " + this.component.getClass().getSimpleName());
        System.out.println("Final price is: " + price);
        return price;
    }
}
