package pckg_vj7.zd2;

public class PlatinumMembership implements MembershipType {
    @Override
    public String getDescription() {
        return "Platinum Membership";
    }

    @Override
    public double getDiscount() {
        return 0.25;
    }

    @Override
    public int getMaxBooks() {
        return 8;
    }
}
