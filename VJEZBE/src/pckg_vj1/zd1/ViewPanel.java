package pckg_vj1.zd1;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {
    private JTextField resultField;
    private JTextArea historyArea;

    public ViewPanel() {
        initComps();
        layoutComps();
    }

    public void initComps() {
        setLayout(new BorderLayout());
        resultField = new JTextField("Rezultat");
        resultField.setEditable(false);
        historyArea = new JTextArea(10, 20);
        historyArea.setEditable(false);
    }

    public void layoutComps() {
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Rezultat"));
        resultPanel.add(resultField);

        JPanel historyPanel = new JPanel(new BorderLayout());
        historyPanel.setBorder(BorderFactory.createTitledBorder("Prikaz svih rezultata"));
        JScrollPane scrollPane = new JScrollPane(historyArea);
        historyPanel.add(scrollPane);

        add(resultPanel, BorderLayout.NORTH);
        add(historyPanel, BorderLayout.CENTER);
    }

    public void setResult(String result) {
        resultField.setText(result);
    }

    public void addToHistory(String operation) {
        historyArea.append(operation + "\n");
    }
}
