package pckg_vj3.zd5;

public class Test {

    public static void main(String[] args) {
        WebShop ws = new WebShop("Best online shop");
        Customer cust1 = new Customer("Name1", "Surname1", "Croatia", "Zadar");
        cust1.setDeliveryAddress("some address 1");
        cust1.setSimCardNumer(12564);
        ws.createAccount(cust1);
        ws.listAllCstWithAccount();
        BankAccount bnAc1 = new BankAccount(cust1);
        BankALL bankALL = new BankALL();
        bankALL.add2BankALL(bnAc1);
        System.out.println(bnAc1.toString());
        CustomerAccount custAcc1 = new CustomerAccount(ws, cust1);
        WebAppFacade webApp = new WebAppFacade(cust1, ws, custAcc1, "cust1", "pasw1");


        if (webApp.login2Account()) {
            webApp.customerPaymentBank(bankALL);
            Shipping shp = new Shipping(cust1);
            Warehouse whs = new Warehouse("2344 Region Warehouse");
            webApp.setShippment(shp);
            webApp.setWarehouse(whs);
            webApp.makeShopping(bnAc1);
        }

    }
}
