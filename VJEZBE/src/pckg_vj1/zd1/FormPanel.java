package pckg_vj1.zd1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JComboBox<String> operationCombo;
    private JButton calculateButton;

    public FormPanel() {
        initComps();
        layoutComps();
    }

    public void initComps() {
        setBorder(BorderFactory.createTitledBorder("Unos"));
        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);
        String[] operations = {"+", "-", "*", "/", "pow", "avg"};
        operationCombo = new JComboBox<>(operations);
        calculateButton = new JButton("Izracunaj");
    }

    public void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Prvi broj:"), gbc);

        gbc.gridy = 1;
        add(firstNumberField, gbc);

        gbc.gridy = 2;
        add(new JLabel("Drugi broj:"), gbc);

        gbc.gridy = 3;
        add(secondNumberField, gbc);

        gbc.gridy = 4;
        add(new JLabel("Izaberi matematicku operaciju:"), gbc);

        gbc.gridy = 5;
        add(operationCombo, gbc);

        gbc.gridy = 6;
        gbc.insets = new Insets(10, 0, 0, 0);
        add(calculateButton, gbc);
    }

    public void addCalculateListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }

    public String getFirstNumber() {
        return firstNumberField.getText();
    }

    public String getSecondNumber() {
        return secondNumberField.getText();
    }

    public String getSelectedOperation() {
        return operationCombo.getSelectedItem().toString();
    }
}
