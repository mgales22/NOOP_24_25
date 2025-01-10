package pckg_vj3.zd5;

public class CustomerAccountImpl implements CustomerAccountInt {
    @Override
    public void assign2Account(String username, String password) {
        System.out.println("Assigning to account: " + username);
    }

    @Override
    public boolean checkCustomerData() {
        System.out.println("Checking customer data...");
        return true;
    }
}
