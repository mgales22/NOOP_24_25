package pckg_dip_2;

public class TestApp {

    private static NotificationService newNotificationService;
    public static void main(String[] args) {
        NotifyManager nm = new NotifyManager();
        NotificationService ns1 = new NotificationService(new EmailSender());
        NotificationService ns2 = new NotificationService(new SMSSender());
        NotificationService ns3 = new NotificationService(new WhatsAppSender());
        nm.addNewNotificationService(ns1);
        nm.addNewNotificationService(ns2);
        nm.addNewNotificationService(ns3);
        //nm.addNewNotificationService(newNotificationService);
        nm.notifyWithAll("Hello", "Universe");
    }
}
