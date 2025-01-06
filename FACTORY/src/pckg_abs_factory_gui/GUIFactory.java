package pckg_abs_factory_gui;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
    ComboBox createComboBox();

    void createGUI();
}
