package pckg_vj4.zd2;

import java.io.Serializable;

public abstract class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int id;
    protected static int cnt;
    protected String name;
    protected float accountBalance;
    protected float amount;

    public Account() {
        this.id = ++cnt;
    }

    public Account(String name, float balance) {
        this();
        this.name = name;
        this.accountBalance = balance;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public int getAccId() {
        return id;
    }

    public String getAccUsername() {
        return name;
    }

    public void setOldBalance(float balance) {
        this.accountBalance = balance;
    }

    public abstract void setAmount(float amount);

    public abstract float getAmount(float amount);

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}
