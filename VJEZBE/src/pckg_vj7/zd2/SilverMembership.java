package pckg_vj7.zd2;

public class SilverMembership implements MembershipType {
    @Override
    public String getDescription() {
        return "Silver Membership";
    }

    @Override
    public double getDiscount() {
        return 0.15;
    }

    @Override
    public int getMaxBooks() {
        return 4;
    }
}
