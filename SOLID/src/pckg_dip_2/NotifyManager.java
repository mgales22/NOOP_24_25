package pckg_dip_2;

import java.util.ArrayList;
import java.util.List;

public class NotifyManager {

    private final List<NotificationService> notificationServices;

    public NotifyManager(){
        this.notificationServices = new ArrayList<>();
    }

    public void addNewNotificationService(NotificationService notificationService) throws IllegalArgumentException, NullPointerException{
        if(notificationService==null){
            throw new NullPointerException("NotificationService can't be null");
        }else if(notificationServices.contains(notificationService)){
            throw new IllegalArgumentException("NotificationService already exists");
        }else{
            notificationServices.add(notificationService);
            System.out.println("New notification service added.");
        }
    }

    public void notifyWithAll(String msg, String rec){
        for(NotificationService ns : notificationServices){
            ns.notify(msg, rec);
        }
    }
}
