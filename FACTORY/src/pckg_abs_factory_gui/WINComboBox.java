package pckg_abs_factory_gui;

public class WINComboBox implements ComboBox{
    @Override
    public void renderElement() {
        System.out.println("Rendering: " + getClass().getSimpleName());
    }
}
