package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;

    public MainFrame(){

        super("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }

}
