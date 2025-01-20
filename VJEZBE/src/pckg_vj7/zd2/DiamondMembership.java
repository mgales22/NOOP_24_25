package pckg_vj7.zd2;

public class DiamondMembership implements MembershipType {
    @Override
    public String getDescription() {
        return "Diamond Membership";
    }

    @Override
    public double getDiscount() {
        return 0.30;
    }

    @Override
    public int getMaxBooks() {
        return 10;
    }
}
