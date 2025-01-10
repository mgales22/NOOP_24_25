package pckg_vj3.zd5;

public class PaymentImpl implements PaymentInt {
    @Override
    public void link2CustomerBankAccount() {
        System.out.println("Linking to customer bank account...");
    }

    @Override
    public void performTransaction2BankAccount() {
        System.out.println("Performing bank transaction...");
    }

    @Override
    public boolean assign2PaymentAccount(BankAccount bankAcc) {
        System.out.println("Assigning to payment account...");
        return true;
    }
}
