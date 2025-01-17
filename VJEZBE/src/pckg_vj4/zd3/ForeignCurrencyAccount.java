package pckg_vj4.zd3;

public class ForeignCurrencyAccount extends Account {
    private static final double EURO_RATE = 7.5345;

    public ForeignCurrencyAccount(String name, float balanceInEuros) {
        super(name, balanceInEuros);
    }

    @Override
    public void setAmount(float euroAmount) {
        this.accountBalance = euroAmount;
    }

    @Override
    public float getAmount(float amount) {
        return this.accountBalance;
    }

    public float getAmountInHRK() {
        return this.accountBalance * (float)EURO_RATE;
    }

    @Override
    public String toString() {
        return String.format("ForeignCurrencyAccount [id=%d, name=%s, balance=%.2f€ (%.2fHRK)]",
                id, name, accountBalance, getAmountInHRK());
    }
}
