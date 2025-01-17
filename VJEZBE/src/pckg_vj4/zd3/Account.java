package pckg_vj4.zd3;

public abstract class Account {
    protected int id;
    protected int cnt;
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
}
