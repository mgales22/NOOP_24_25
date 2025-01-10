package pckg_vj3.zd5;

import java.util.UUID;

public class BankAccount {
    private Customer customer;
    private int bankAccId;
    private static int cnt = 100;
    private String usrName;
    private String passwd;

    public BankAccount(Customer customer) {
        this.customer = customer;
        this.bankAccId = cnt++;
        usrName = generateString();
        passwd = generateString();
    }

    private String generateString() {
        return UUID.randomUUID().toString();
    }

    public Customer getCustomer() { return customer; }
    public int getBankAccId() { return bankAccId; }
}