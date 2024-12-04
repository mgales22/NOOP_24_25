package pckg_icecream;

public abstract class AbsIceCream {

    protected String name;
    protected double unitPrice;
    protected int amount;

    protected AbsIceCream(String name, double unitPrice, int amount){
        this.amount = amount;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    protected abstract double calculatePrice();

    public void description(){
        System.out.println(getClass().getSimpleName() + ":");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AbsIceCream{" +
                "name='" + name + '\'' +
                ", price=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
