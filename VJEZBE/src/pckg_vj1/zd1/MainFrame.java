package pckg_vj1.zd1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private Calculator calculator;

    public MainFrame() {
        calculator = new SimpleCalculator();
        initComps();
        layoutComps();
        activateFrame();
    }

    public void initComps() {
        formPanel = new FormPanel();
        viewPanel = new ViewPanel();

        formPanel.addCalculateListener(e -> calculate());
    }

    public void layoutComps() {
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.WEST);
        add(viewPanel, BorderLayout.CENTER);
    }

    public void activateFrame() {
        setTitle("SimpleCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculate() {
        try {
            float a = Float.parseFloat(formPanel.getFirstNumber());
            float b = Float.parseFloat(formPanel.getSecondNumber());
            String operation = formPanel.getSelectedOperation();

            switch (operation) {
                case "+": calculator.setStrategy(new AddStrategy()); break;
                case "-": calculator.setStrategy(new SubsStrategy()); break;
                case "*": calculator.setStrategy(new MultiplyStrategy()); break;
                case "/": calculator.setStrategy(new DivisionStrategy()); break;
                case "pow": calculator.setStrategy(new PowerStrategy()); break;
                case "avg": calculator.setStrategy(new AvgStrategy()); break;
            }

            float result = calculator.performCalculation(a, b);
            viewPanel.setResult(String.valueOf(result));
            viewPanel.addToHistory(String.format("%.2f %s %.2f = %.2f", a, operation, b, result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}
