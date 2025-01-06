package pckg_abs_factory_gui;

public class WINCheckBox implements CheckBox{
    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
