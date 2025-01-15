package pckg_dip_2;

//MODUL NIZE RAZINE, ovisi o apstrakciji, sucelju
public class EmailSender implements SenderService{
    @Override
    public void send(String message, String recepient) {
        System.out.println(this.getClass().getSimpleName() + " sending to: " + recepient + "| message:\n" + message);
    }
}
