package pckg_vj4.zd3;

public class Client {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Sandra", 375.5f);
        ForeignCurrencyAccount foreignAccount = new ForeignCurrencyAccount("Mario", 100.0f);

        MobAppInv mobApp = new MobAppInv();

        PaymentServiceInt depositTransaction = new DepositMoney(checkingAccount, 250.5f);
        System.out.println("Initial state: " + checkingAccount);

        mobApp.performTransaction(depositTransaction);
        System.out.println("After deposit: " + checkingAccount);

        mobApp.undoLastTransaction();
        System.out.println("After undo: " + checkingAccount);

        mobApp.redoLastTransaction();
        System.out.println("After redo: " + checkingAccount);

        System.out.println("\nForeign account initial state: " + foreignAccount);
        PaymentServiceInt euroDeposit = new DepositMoney(foreignAccount, 50.0f);
        mobApp.performTransaction(euroDeposit);
        System.out.println("After euro deposit: " + foreignAccount);
    }
}