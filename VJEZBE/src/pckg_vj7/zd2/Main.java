package pckg_vj7.zd2;

public class Main {
    public static void main(String[] args) {
        BookClub bookClub = new BookClub();

        bookClub.addMember("Ana Anić", "diamond");
        bookClub.addMember("Pero Perić", "platinum");
        bookClub.addMember("Marko Markić", "gold");
        bookClub.addMember("Iva Ivić", "silver");
        bookClub.addMember("Jana Janić", "bronze");

        bookClub.printAllMembers();

        System.out.println("\nNakon promjene članstva:");
        Member member = bookClub.getMembers().get(4);
        member.upgradeMembership("silver");

        bookClub.printAllMembers();
    }
}