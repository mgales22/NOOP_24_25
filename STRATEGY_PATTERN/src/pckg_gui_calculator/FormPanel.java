package pckg_gui_calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    private JTextField fstNumField;
    private JTextField sndNumField;
    private JTextField resultField;

    private JComboBox<CalculationStrategy> operationBox;
    private JButton confirmButton;

    public FormPanel(){
        Dimension dims = getPreferredSize();
        dims.height = 220;
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border innter = BorderFactory.createTitledBorder("Calculation panel: ");
        Border border = BorderFactory.createCompoundBorder(outer, innter);
        setBorder(border);
        initComps();
        layoutComps();
        activateFormPanel();
    }

    private void initComps() {

        fstNumField = new JTextField(10);
        sndNumField = new JTextField(10);
        resultField = new JTextField(10);
        operationBox = new JComboBox<>();

        DefaultComboBoxModel<CalculationStrategy> operationBoxModel = new DefaultComboBoxModel<>();
        operationBoxModel.addElement(new AdditionStrategy());
        operationBoxModel.addElement(new SubtractionStrategy());
        operationBoxModel.addElement(new MultiplicationStrategy());
        operationBoxModel.addElement(new DivisionStrategy());
        operationBox.setModel(operationBoxModel);
        operationBox.setSelectedIndex(-1);

        confirmButton = new JButton("Calculate");
    }

    private void layoutComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("First Number: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(fstNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;

        add(Box.createVerticalStrut(15), gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Second Number: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sndNumField, gbc);

        gbc.gridx++;
        add(Box.createHorizontalStrut(25), gbc);

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Choose operation: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(operationBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;

        add(Box.createVerticalStrut(20), gbc);

        gbc.gridy++;
        add(confirmButton,gbc);

        gbc.gridx+=2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Result: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(resultField, gbc);

    }

    private void activateFormPanel() {
    }
}
