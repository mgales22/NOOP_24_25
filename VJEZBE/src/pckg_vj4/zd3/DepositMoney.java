package pckg_vj4.zd3;

public class DepositMoney implements PaymentServiceInt {
    private Account account;
    private float oldBalance;
    private float amount;

    public DepositMoney(Account account, float amount) {
        this.account = account;
        this.amount = amount;
        this.oldBalance = account.getAccountBalance();
    }

    @Override
    public void execute() {
        account.setAmount(account.getAccountBalance() + amount);
    }

    @Override
    public void undo() {
        account.setAmount(oldBalance);
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public String toString() {
        return String.format("DepositMoney [account=%s, oldBalance=%.2f, amount=%.2f]",
                account.toString(), oldBalance, amount);
    }
}