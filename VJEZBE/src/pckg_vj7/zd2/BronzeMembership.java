package pckg_vj7.zd2;

public class BronzeMembership implements MembershipType {
    @Override
    public String getDescription() {
        return "Bronze Membership";
    }

    @Override
    public double getDiscount() {
        return 0.10;
    }

    @Override
    public int getMaxBooks() {
        return 2;
    }
}
