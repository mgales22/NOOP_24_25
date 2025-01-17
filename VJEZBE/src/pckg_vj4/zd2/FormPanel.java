package pckg_vj4.zd2;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FormPanel extends JPanel {
    private JTextField nameField;
    private JTextField balanceField;
    private JComboBox<String> accountTypeCombo;
    private JButton createButton;
    private List<Account> accounts;
    private DesktopAppInv desktopApp;
    private AccountUpdateListener updateListener;
    private static final String ACCOUNTS_FILE = "accounts.ser";

    public FormPanel(DesktopAppInv desktopApp, AccountUpdateListener listener) {
        this.desktopApp = desktopApp;
        this.updateListener = listener;
        accounts = new ArrayList<>();
        loadAccounts();

        initComps();
        layoutComps();
        activatePanel();

        // Notify listener of initial accounts
        if (updateListener != null) {
            updateListener.onAccountsUpdated(accounts);
        }
    }

    private void initComps() {
        nameField = new JTextField(20);
        balanceField = new JTextField(20);
        accountTypeCombo = new JComboBox<>(new String[]{"Checking Account", "Foreign Currency Account"});
        createButton = new JButton("Create Account");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder("Create New Account"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Initial Balance:"), gbc);

        gbc.gridx = 1;
        add(balanceField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Account Type:"), gbc);

        gbc.gridx = 1;
        add(accountTypeCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(createButton, gbc);
    }

    private void activatePanel() {
        createButton.addActionListener(e -> createAccount());
    }

    private void createAccount() {
        try {
            String name = nameField.getText();
            float balance = Float.parseFloat(balanceField.getText());

            Account account = null;
            if (accountTypeCombo.getSelectedIndex() == 0) {
                account = new CheckingAccount(name, balance);
            } else {
                account = new ForeignCurrencyAccount(name, balance);
            }

            accounts.add(account);
            saveAccounts();

            // Notify listener of the updated account list
            if (updateListener != null) {
                updateListener.onAccountsUpdated(accounts);
            }

            JOptionPane.showMessageDialog(this, "Account created successfully!");
            nameField.setText("");
            balanceField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid balance amount!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ACCOUNTS_FILE))) {
            oos.writeObject(accounts);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving accounts!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    private void loadAccounts() {
        File file = new File(ACCOUNTS_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(file))) {
                accounts = (List<Account>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                accounts = new ArrayList<>();
            }
        }
    }
}