package pckg_vj4.zd3;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, float balance) {
        super(name, balance);
    }

    public void setAmount(float amount) {
        this.accountBalance = amount;
    }

    @Override
    public float getAmount(float amount) {
        return this.accountBalance;
    }

    @Override
    public String toString() {
        return String.format("CheckingAccount [id=%d, name=%s, accountBalance=%.2f]",
                id, name, accountBalance);
    }
}