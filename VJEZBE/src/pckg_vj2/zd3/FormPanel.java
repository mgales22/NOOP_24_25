package pckg_vj2.zd3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FormPanel extends JPanel {
    private JTextField nameField;
    private JButton addButton;
    private JTextArea observerList;
    private JComboBox<String> observerCombo;
    private JButton removeButton;
    private WeatherStation weatherStation;
    private ArrayList<String> observerNames;

    private JPanel measurementPanel;
    private JTextField temperatureField;
    private JTextField humidityField;
    private JTextField pressureField;
    private JButton updateButton;

    public FormPanel(WeatherStation ws) {
        this.weatherStation = ws;
        this.observerNames = new ArrayList<>();
        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        nameField = new JTextField(15);
        addButton = new JButton("Dodaj na listu");
        observerList = new JTextArea(10, 15);
        observerList.setEditable(false);
        observerCombo = new JComboBox<>();
        removeButton = new JButton("Ukloni");

        measurementPanel = new JPanel();
        measurementPanel.setBorder(BorderFactory.createTitledBorder("Stanje"));
        temperatureField = new JTextField(10);
        humidityField = new JTextField(10);
        pressureField = new JTextField(10);
        updateButton = new JButton("Unesi promjene");
    }

    private void layoutComps() {
        setLayout(new BorderLayout(10, 10));

        JPanel observerPanel = new JPanel(new GridBagLayout());
        observerPanel.setBorder(BorderFactory.createTitledBorder("Podaci o promatračima"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        observerPanel.add(new JLabel("Novi promatrač:"), gbc);

        gbc.gridy = 1;
        observerPanel.add(nameField, gbc);

        gbc.gridy = 2;
        observerPanel.add(addButton, gbc);

        gbc.gridy = 3;
        observerPanel.add(new JScrollPane(observerList), gbc);

        gbc.gridy = 4;
        observerPanel.add(observerCombo, gbc);

        gbc.gridy = 5;
        observerPanel.add(removeButton, gbc);

        measurementPanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        measurementPanel.add(new JLabel("Temperatura"), gbc);
        gbc.gridx = 1;
        measurementPanel.add(temperatureField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        measurementPanel.add(new JLabel("Vlažnost"), gbc);
        gbc.gridx = 1;
        measurementPanel.add(humidityField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        measurementPanel.add(new JLabel("Tlak"), gbc);
        gbc.gridx = 1;
        measurementPanel.add(pressureField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        measurementPanel.add(updateButton, gbc);

        add(observerPanel, BorderLayout.NORTH);
        add(measurementPanel, BorderLayout.CENTER);
    }

    private void activateComps() {
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                MobilePhoneWeatherApp observer = new MobilePhoneWeatherApp(name);
                observer.register(weatherStation);
                observerNames.add(name);
                observerCombo.addItem(name);
                updateObserverList();
                nameField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = observerCombo.getSelectedIndex();
            if (selectedIndex >= 0) {
                String name = observerNames.get(selectedIndex);
                Observer observer = weatherStation.getObserverByName(name);
                if (observer instanceof MobilePhoneWeatherApp) {
                    ((MobilePhoneWeatherApp) observer).unregister(weatherStation);
                }
                observerNames.remove(selectedIndex);
                observerCombo.removeItemAt(selectedIndex);
                updateObserverList();
            }
        });

        observerCombo.addActionListener(e -> {
            int selectedIndex = observerCombo.getSelectedIndex();
            if (selectedIndex >= 0) {
                String selectedName = observerNames.get(selectedIndex);
                weatherStation.setSelectedObserver(selectedName);
            }
        });

        updateButton.addActionListener(e -> {
            try {
                double temperature = Double.parseDouble(temperatureField.getText());
                double humidity = Double.parseDouble(humidityField.getText());
                double pressure = Double.parseDouble(pressureField.getText());
                weatherStation.setMeasurements(temperature, humidity, pressure);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Molimo unesite ispravne numeričke vrijednosti",
                        "Greška",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void updateObserverList() {
        StringBuilder sb = new StringBuilder();
        for (String name : observerNames) {
            sb.append(name).append("\n");
        }
        observerList.setText(sb.toString());
    }
}
