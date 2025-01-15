package pckg_dip_2;

public class WhatsAppSender implements SenderService{
    @Override
    public void send(String message, String recepient) {
        System.out.println(this.getClass().getSimpleName() + " sending to: " + recepient + "| message:\n" + message);
    }
}
