package pckg_vj2.zd2;

import java.util.ArrayList;

public abstract class Magazine implements Publisher {
    protected String name;
    protected ArrayList<Subscriber> subscribers;
    protected String currentIssue;
    protected String currentPdfUrl;

    public Magazine(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("New subscription: " + subscriber.getEmail() + " subscribed to " + name);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscription cancelled: " + subscriber.getEmail() + " unsubscribed from " + name);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(name, currentIssue, currentPdfUrl);
        }
    }

    @Override
    public void publishNewIssue(String issueNumber, String pdfUrl) {
        this.currentIssue = issueNumber;
        this.currentPdfUrl = pdfUrl;
        System.out.println("\nNew issue of " + name + " (Issue " + issueNumber + ") published!");
        notifySubscribers();
    }
}
