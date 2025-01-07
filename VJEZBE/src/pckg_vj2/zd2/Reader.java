package pckg_vj2.zd2;

public class Reader implements Subscriber {
    private String name;
    private String email;

    public Reader(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String magazineName, String issueNumber, String pdfUrl) {
        System.out.println("Sending email to: " + email);
        System.out.println("Dear " + name + ",");
        System.out.println("New issue of " + magazineName + " (Issue " + issueNumber + ") is available!");
        System.out.println("You can download your PDF copy at: " + pdfUrl);
        System.out.println("-----------------------------------");
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Reader [name=" + name + ", email=" + email + "]";
    }
}
