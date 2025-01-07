package pckg_vj2.zd3;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel implements Observer {
    private JTextField temperatureField;
    private JTextField humidityField;
    private JTextField pressureField;
    private WeatherStation weatherStation;

    public ViewPanel() {
        initComps();
        layoutComps();
    }

    private void initComps() {
        temperatureField = new JTextField(10);
        humidityField = new JTextField(10);
        pressureField = new JTextField(10);

        temperatureField.setEditable(false);
        humidityField.setEditable(false);
        pressureField.setEditable(false);
    }

    private void layoutComps() {
        setBorder(BorderFactory.createTitledBorder("Prikaz"));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Temperatura/AVG:"), gbc);
        gbc.gridx = 1;
        add(temperatureField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Vlažnost/AVG:"), gbc);
        gbc.gridx = 1;
        add(humidityField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Tlak/AVG:"), gbc);
        gbc.gridx = 1;
        add(pressureField, gbc);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatureField.setText(String.format("%.1f", temperature));
        humidityField.setText(String.format("%.1f", humidity));
        pressureField.setText(String.format("%.1f", pressure));
    }

    @Override
    public void register(ObservableWS observableWS) {
        this.weatherStation = (WeatherStation) observableWS;
        observableWS.addObserver(this);
    }

    @Override
    public void unregister(ObservableWS observableWS) {
        observableWS.removeObserver(this);
        this.weatherStation = null;
    }
}
