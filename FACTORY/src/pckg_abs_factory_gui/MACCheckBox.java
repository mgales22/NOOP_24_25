package pckg_abs_factory_gui;

public class MACCheckBox implements CheckBox{
    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
