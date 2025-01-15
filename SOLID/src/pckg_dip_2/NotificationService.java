package pckg_dip_2;

//MODUL VISE RAZINE, ovisi o apstrakciji SenderService
public class NotificationService {
    private SenderService senderService;

    public NotificationService(SenderService senderService){
        this.senderService = senderService;
        System.out.println("NotificationService created - sender: " + senderService.getClass().getSimpleName());
    }

    public void notify(String message, String recepient){
        senderService.send(message, recepient);
    }
}
