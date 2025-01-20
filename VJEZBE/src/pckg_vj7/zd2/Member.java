package pckg_vj7.zd2;

import java.time.LocalDate;
import java.util.UUID;

public class Member {
    private String id;
    private String name;
    private MembershipType membership;
    private LocalDate joinDate;

    public Member(String name, String membershipType) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.membership = MembershipFactory.createMembership(membershipType);
        this.joinDate = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MembershipType getMembership() {
        return membership;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void upgradeMembership(String newMembershipType) {
        this.membership = MembershipFactory.createMembership(newMembershipType);
    }

    @Override
    public String toString() {
        return String.format("Member{id='%s', name='%s', membership='%s', discount=%.2f%%, maxBooks=%d, joinDate=%s}",
                id, name, membership.getDescription(),
                membership.getDiscount() * 100,
                membership.getMaxBooks(),
                joinDate);
    }
}