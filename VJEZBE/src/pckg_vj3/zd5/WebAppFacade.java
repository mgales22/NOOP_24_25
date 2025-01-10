package pckg_vj3.zd5;

import java.util.Scanner;

public class WebAppFacade {

    private WebShop webShop;
    private Customer customer;
    private Item item;
    private ShoppingBasket basket;
    private Warehouse wh;
    private ConcretePayment payment;
    private Shipping shipping;
    private CustomerAccount customerAcc;
    private String userName;
    private String password;
    private Scanner sc;
    private BankALL allBnkAcc;
    private Warehouse warehouse;

    public WebAppFacade(Customer customer, WebShop shop, CustomerAccount acc, String userName, String password) {

        this.customer = customer;
        this.webShop = shop;
        customerAcc = acc;
        this.userName = userName;
        this.password = password;
        this.sc = new Scanner(System.in);
    }

    public boolean login2Account() {
        customerAcc.assign2Account(userName, password);
        if (customerAcc.checkCustomerData()) {
            System.out.println("Welcome -> " + userName);
            return true;
        } else {
            System.out.println("If you have an account, then you have provided the wrong user name or password...");
            return false;
        }

    }

    public void makeShopping(BankAccount ba) {
        ShoppingBasket basket = new ShoppingBasket(userName);
        newItem(basket);
        basket.listAllItems();
        payment = new ConcretePayment(allBnkAcc, customer);
        shipping.someDesiredShipmentMethod();
        warehouse.invoiceProcessing();
        warehouse.findCustomerItems();
        warehouse.packingItems();
        warehouse.dispatchment();
        if(payment.assign2PaymentAccount(ba)) {
            payment.link2CustomerBankAccount();
            payment.performTransaction2BankAccount();
            shipping.deliveryNotification();
        } else {
            System.out.println("Unable to perform payment...");
            System.out.println("Try later...");
        }
    }

    private void newItem(ShoppingBasket basket) {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter item name: ");
            String itemName = sc.nextLine();
            System.out.println("Enter item category:");
            String itemCat = sc.nextLine();
            item = new Item(itemName, itemCat);
            basket.add2ShoppingBasket(item);
            System.out.println("More items -> 1 for yes and other for no....");
            try {
                int val = sc.nextInt();
                if (val == 1) {
                    sc.nextLine();
                    continue;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                flag = false;
            }

        }

    }


    public void customerPaymentBank(BankALL bnk) {
        this.allBnkAcc = bnk;
    }

    public void setShippment(Shipping shp) {
        this.shipping = shp;
    }

    public void setWarehouse(Warehouse whs) {
        this.warehouse = whs;
    }



}