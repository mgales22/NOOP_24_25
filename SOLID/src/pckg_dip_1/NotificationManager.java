package pckg_dip_1;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private final List<NotificationService> notificationServiceList;

    public NotificationManager() {
        this.notificationServiceList = new ArrayList<>();
    }

    public void addNotificationService(NotificationService notService) {
        if(notService == null){
            throw new NullPointerException("Service can not be null!");
        }else if(notificationServiceList.contains(notService)){
            throw new IllegalArgumentException("Service already exists!");
        } else {
            notificationServiceList.add(notService);
            System.out.println("Service added successfully!");
        }
    }

    public void notifyWithMsg(String msg, String rec){
        for(NotificationService ns : notificationServiceList){
            ns.sendNotification(msg, rec);
        }
    }
}
