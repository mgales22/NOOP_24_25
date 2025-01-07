package pckg_vj2.zd3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private WeatherStation weatherStation;

    public MainFrame() {
        super("WeatherStation");
        weatherStation = new WeatherStation();
        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        formPanel = new FormPanel(weatherStation);
        viewPanel = new ViewPanel();
        weatherStation.addObserver(viewPanel);
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.WEST);
        add(viewPanel, BorderLayout.CENTER);
    }

    private void activateFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

