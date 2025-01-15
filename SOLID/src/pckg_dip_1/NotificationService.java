package pckg_dip_1;

public class NotificationService {
    private EmailSender emailSender; // tight coupling

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendNotification(String message, String recepient){
        emailSender.sendEmail(message, recepient);
    }
}
