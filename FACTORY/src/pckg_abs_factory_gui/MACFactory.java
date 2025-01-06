package pckg_abs_factory_gui;

public class MACFactory implements GUIFactory{

    private Button button;
    private CheckBox checkBox;
    private ComboBox comboBox;
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MACCheckBox();
    }

    @Override
    public ComboBox createComboBox() {
        return new MACComboBox();
    }

    @Override
    public void createGUI() {
        button = createButton();
        checkBox = createCheckBox();
        comboBox = createComboBox();
        System.out.println("GUI created: " + getClass().getSimpleName());
    }
}
