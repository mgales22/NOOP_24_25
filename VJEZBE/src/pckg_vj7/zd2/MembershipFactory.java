package pckg_vj7.zd2;

public class MembershipFactory {
    public static MembershipType createMembership(String type) {
        return switch (type.toLowerCase()) {
            case "diamond" -> new DiamondMembership();
            case "platinum" -> new PlatinumMembership();
            case "gold" -> new GoldMembership();
            case "silver" -> new SilverMembership();
            case "bronze" -> new BronzeMembership();
            default -> throw new IllegalArgumentException("Unknown membership type: " + type);
        };
    }
}
