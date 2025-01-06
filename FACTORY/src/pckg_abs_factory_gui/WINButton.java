package pckg_abs_factory_gui;

public class WINButton implements Button{
    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
