package pckg_abs_factory_gui;

public class Test {

    public static void main(String[] args) {
        Application winApp = new Application(new WINFactory());
        winApp.performSomethingForUser();
        Application macApp = new Application(new MACFactory());
        macApp.performSomethingForUser();
    }
}
