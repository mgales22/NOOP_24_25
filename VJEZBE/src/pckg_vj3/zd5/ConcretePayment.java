package pckg_vj3.zd5;

public class ConcretePayment implements PaymentInt {
    private BankALL bank;
    private Customer customer;
    private BankAccount ba;

    public ConcretePayment(BankALL bank, Customer customer) {
        this.bank = bank;
        this.customer = customer;
    }

    @Override
    public boolean assign2PaymentAccount(BankAccount acc) {
        if(bank.getALLAccounts().contains(acc)) {
            System.out.println("Successfully assigned to an account: " + acc.getCustomer().getName());
            System.out.println(acc.getCustomer().getSimCardNumer());
            this.ba = acc;
            return true;
        }
        return false;
    }

    @Override
    public void link2CustomerBankAccount() {
        System.out.println("Linked to and account -> " + ba.getBankAccId());
    }

    @Override
    public void performTransaction2BankAccount() {
        System.out.println("Performed transaction to the bank account -> " + ba.getBankAccId());
        System.out.println("All is linked to the credit card -> " + ba.getCustomer().getSimCardNumer());
    }
}