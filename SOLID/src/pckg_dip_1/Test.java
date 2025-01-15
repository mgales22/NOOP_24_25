package pckg_dip_1;

public class Test {

    // ovo nije dobar pristup (pckg_dip_1), jer NotificationService zavisi od EmailSender-a
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailSender());
        notificationService.sendNotification("Hello", "to World...");

        NotificationManager nm = new NotificationManager();
        nm.addNotificationService(notificationService);
        nm.addNotificationService(new NotificationService(new EmailSender()));
    }
}
