package pckg_abs_factory_gui;

public class WINFactory implements GUIFactory{

    private Button button;
    private ComboBox comboBox;
    private CheckBox checkBox;
    @Override
    public Button createButton() {
        return new WINButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WINCheckBox();
    }

    @Override
    public ComboBox createComboBox() {
        return new WINComboBox();
    }

    @Override
    public void createGUI() {
        button = createButton();
        checkBox = createCheckBox();
        comboBox = createComboBox();
        System.out.println("GUI created: " + getClass().getSimpleName());
    }
}
