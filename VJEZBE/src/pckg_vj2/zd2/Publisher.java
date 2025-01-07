package pckg_vj2.zd2;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
    void publishNewIssue(String issueNumber, String pdfUrl);
}
