package pckg_no_mvc;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;


    public MainFrame(){
        super("Simple App");

        initAll();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formEventOccurred(FormEvent fe) {
                Programmer programmer = fe.getProgrammer();
                viewPanel.appendText(programmer.toString());
            }
        });
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
    }

    private void initAll() {

        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }
}
