package pckg_vj7.zd2;

public class GoldMembership implements MembershipType {
    @Override
    public String getDescription() {
        return "Gold Membership";
    }

    @Override
    public double getDiscount() {
        return 0.20;
    }

    @Override
    public int getMaxBooks() {
        return 6;
    }
}

