package pckg_vj2.zd2;

public class TestApp {
    public static void main(String[] args) {
        MonthlyMagazine techMonthly = new MonthlyMagazine("Tech Monthly");
        QuarterlyMagazine scienceQuarterly = new QuarterlyMagazine("Science Quarterly");

        Reader reader1 = new Reader("Ana Anić", "ana@email.com");
        Reader reader2 = new Reader("Marko Marić", "marko@email.com");
        Reader reader3 = new Reader("Ivan Ivić", "ivan@email.com");

        System.out.println("-----------------------Initial Subscriptions-----------------------");
        techMonthly.addSubscriber(reader1);
        techMonthly.addSubscriber(reader2);
        scienceQuarterly.addSubscriber(reader2);
        scienceQuarterly.addSubscriber(reader3);

        // simulations...

        System.out.println("\n-----------------------January Publications-----------------------");
        techMonthly.publishNewIssue("2025-01", "https://techmonthly.com/2025-01.pdf");

        System.out.println("\n-----------------------New Subscription-----------------------");
        techMonthly.addSubscriber(reader3);

        System.out.println("\n-----------------------Q1 Publications-----------------------");
        scienceQuarterly.publishNewIssue("2025-Q1", "https://sciencequarterly.com/2025-Q1.pdf");

        System.out.println("\n-----------------------Subscription Cancellations-----------------------");
        techMonthly.removeSubscriber(reader2);
        scienceQuarterly.removeSubscriber(reader3);

        System.out.println("\n-----------------------February Publications-----------------------");
        techMonthly.publishNewIssue("2025-02", "https://techmonthly.com/2025-02.pdf");
    }
}
