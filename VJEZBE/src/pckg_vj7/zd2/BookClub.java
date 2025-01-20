package pckg_vj7.zd2;

import java.util.ArrayList;
import java.util.List;

public class BookClub {
    private List<Member> members = new ArrayList<>();

    public void addMember(String name, String membershipType) {
        members.add(new Member(name, membershipType));
    }

    public List<Member> getMembers() {
        return members;
    }

    public void upgradeMembership(String memberId, String newMembershipType) {
        members.stream()
                .filter(m -> m.getId().equals(memberId))
                .findFirst()
                .ifPresent(m -> m.upgradeMembership(newMembershipType));
    }

    public void printAllMembers() {
        System.out.println("\nBook Club Members:");
        System.out.println("-----------------");
        members.forEach(System.out::println);
    }
}
