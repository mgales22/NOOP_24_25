package pckg_vj3.zd5;


import java.util.ArrayList;

public class BankALL {
    private ArrayList<BankAccount> accounts;

    public BankALL() {
        accounts = new ArrayList<BankAccount>();
    }

    public void add2BankALL(BankAccount bnAcc) {
        accounts.add(bnAcc);
    }

    public ArrayList<BankAccount> getALLAccounts() {
        return accounts;
    }
}