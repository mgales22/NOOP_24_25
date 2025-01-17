package pckg_vj4.zd2;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel implements AccountUpdateListener {
    private JComboBox<Account> accountCombo;
    private JTextField amountField;
    private JButton depositButton;
    private JButton undoButton;
    private JButton redoButton;
    private JTextArea transactionLog;
    private DesktopAppInv desktopApp;

    public ViewPanel(DesktopAppInv desktopApp) {
        this.desktopApp = desktopApp;
        initComps();
        layoutComps();
        activatePanel();
    }

    private void initComps() {
        accountCombo = new JComboBox<>();
        amountField = new JTextField(10);
        depositButton = new JButton("Deposit");
        undoButton = new JButton("Undo");
        redoButton = new JButton("Redo");
        transactionLog = new JTextArea(10, 40);
        transactionLog.setEditable(false);
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Transaction Management"));

        JPanel controlPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0;
        controlPanel.add(new JLabel("Select Account:"), gbc);

        gbc.gridx = 1;
        controlPanel.add(accountCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        controlPanel.add(new JLabel("Amount:"), gbc);

        gbc.gridx = 1;
        controlPanel.add(amountField, gbc);

        gbc.gridx = 2;
        controlPanel.add(depositButton, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(undoButton);
        buttonPanel.add(redoButton);

        add(controlPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(transactionLog), BorderLayout.SOUTH);
    }

    private void activatePanel() {
        depositButton.addActionListener(e -> performDeposit());
        undoButton.addActionListener(e -> performUndo());
        redoButton.addActionListener(e -> performRedo());
    }


    private void performDeposit() {
        Account selectedAccount = (Account) accountCombo.getSelectedItem();
        if (selectedAccount != null) {
            try {
                float amount = Float.parseFloat(amountField.getText());
                PaymentServiceInt depositTransaction = new DepositMoney(selectedAccount, amount);
                desktopApp.performTransaction(depositTransaction);

                transactionLog.append("Deposit: " + amount + " to account: " +
                        selectedAccount.getAccUsername() + "\n");
                amountField.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void performUndo() {
        desktopApp.undoLastTransaction();
        transactionLog.append("Undo performed\n");
    }

    private void performRedo() {
        desktopApp.redoLastTransaction();
        transactionLog.append("Redo performed\n");
    }

    @Override
    public void onAccountsUpdated(java.util.List<Account> accounts) {
        accountCombo.removeAllItems();
        for (Account account : accounts) {
            accountCombo.addItem(account);
        }
    }
}