package pckg_vj3.zd5;

import java.util.HashMap;
import java.util.Scanner;

public class WebShop {

    private HashMap<String[], Customer> customers;
    private HashMap<Customer, String[]> mirrorCustomers;
    private String webShop;
    private Scanner sc;

    public WebShop(String shop) {
        webShop = shop;
        customers = new HashMap<String[], Customer>();
        mirrorCustomers = new HashMap<Customer, String[]>();
        sc = new Scanner(System.in);
    }


    public void createAccount(Customer cust) {
        String[] assgnDta = new String[2];
        String userName;
        String password;
        System.out.println("Enter user name:\n");
        userName = sc.nextLine();
        System.out.println("Enter a password");
        password = sc.nextLine();
        assgnDta[0] = userName;
        assgnDta[1] = password;
        customers.put(assgnDta, cust);
        mirrorCustomers.put(cust,assgnDta);
    }

    public HashMap<String[], Customer> getCustomersWithAccount(){
        return customers;
    }

    public HashMap<Customer, String[]> getMirroredCustomerAccounts(){
        return mirrorCustomers;
    }

    public void listAllCstWithAccount() {
        for (String[] key : customers.keySet()) {
            System.out.println("User name: " + key[0]);
            System.out.println("Password: " + key[1]);
            System.out.println(customers.get(key).toString());
        }
    }


    @Override
    public String toString() {
        return "WebShop [webShop=" + webShop + "]";
    }



}