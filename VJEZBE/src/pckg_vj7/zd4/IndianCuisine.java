package pckg_vj7.zd4;

public class IndianCuisine implements IBaseRecipe, IIndianRecipe {
    private String recipeName;

    public IndianCuisine(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public void generateIndianRecipe() {
        System.out.println("Generating Indian recipe for: " + recipeName);
        System.out.println("- Adding Indian spices");
        System.out.println("- Adding curry blend");
        System.out.println("- Cooking traditional Indian style");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("\nAdditional Indian cuisine info:");
        System.out.println("- Rich in spices");
        System.out.println("- Various regional styles");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("\nRecommended Indian cuisine sources:");
        System.out.println("- indiancooking.com");
        System.out.println("- spicesofindia.com");
    }
}
