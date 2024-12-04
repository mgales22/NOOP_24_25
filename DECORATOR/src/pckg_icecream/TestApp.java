package pckg_icecream;

public class TestApp {

    public static void main(String[] args) {
//        Chocolate ch1 = new Chocolate("Chocolate", 2.0, 2);
//        ch1.calculatePrice();
//        ch1.description();
//        System.out.println("-------------------------------------------------");
//        HoneyOverflow ho1 = new HoneyOverflow("HoneyOverflow", 0.5, 1, ch1);
//        ho1.decoratedPrice();
//        HazelnutPowder hzp1 = new HazelnutPowder("HazelnutPowder", 1.0, 1, ho1);
//        hzp1.decoratedPrice();
        AbsIceCream iceCream = new HazelnutPowder("HazelnutPowder", 1.0, 1, new HoneyOverflow("HoneyOverflow", 0.5, 1, new Chocolate("Chocolate", 2.0, 2)));
        iceCream.calculatePrice();
    }
}
