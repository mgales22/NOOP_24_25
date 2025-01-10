package pckg_vj3.zd5;

import java.util.HashMap;

public class CustomerAccount implements CustomerAccountInt {

    private String userName;
    private String pswd;
    private Customer customer;
    private WebShop shop;

    public CustomerAccount(WebShop shop, Customer customer) {
        this.customer = customer;
        this.shop = shop;

    }

    @Override
    public void assign2Account(String userName, String password) {
        this.userName = userName;
        this.pswd = password;
    }

    @Override
    public boolean checkCustomerData() {
        HashMap<String[], Customer> customers = shop.getCustomersWithAccount();
        HashMap<Customer, String[]> mirrorCust = shop.getMirroredCustomerAccounts();
        if (customers.containsValue(customer)) {
            System.out.println(":::::::::::::::: HERE :::::::::::::::::::::::::");
            String[] valKey = { userName, pswd };
            String[] org = mirrorCust.get(customer);
            if (valKey[0].equals(org[0]) && valKey[1].equals(org[1])) {
                return true;
            } else {
                System.out.println("Wrong credentials ...");
                return false;
            }

        } else {
            return false;
        }

    }

}
