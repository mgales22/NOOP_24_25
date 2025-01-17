package pckg_vj4.zd2;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private DesktopAppInv desktopApp;

    public MainFrame() {
        super("Banking Application");
        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        desktopApp = new DesktopAppInv();
        viewPanel = new ViewPanel(desktopApp);
        formPanel = new FormPanel(desktopApp, viewPanel);
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Account Creation", formPanel);
        tabbedPane.addTab("Transactions", viewPanel);
        add(tabbedPane, BorderLayout.CENTER);
    }

    private void activateFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }
}