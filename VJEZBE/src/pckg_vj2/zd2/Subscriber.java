package pckg_vj2.zd2;

public interface Subscriber {
    void update(String magazineName, String issueNumber, String pdfUrl);
    String getEmail();
}
