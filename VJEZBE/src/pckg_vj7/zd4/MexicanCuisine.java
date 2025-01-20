package pckg_vj7.zd4;

public class MexicanCuisine implements IBaseRecipe, IMexicanRecipe {
    private String recipeName;

    public MexicanCuisine(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public void generateMexicanRecipe() {
        System.out.println("Generating Mexican recipe for: " + recipeName);
        System.out.println("- Adding chili peppers");
        System.out.println("- Adding Mexican spices");
        System.out.println("- Preparing traditional Mexican way");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("\nAdditional Mexican cuisine info:");
        System.out.println("- Rich in flavors");
        System.out.println("- Uses variety of peppers");
        System.out.println("- Ancient cooking traditions");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("\nRecommended Mexican cuisine sources:");
        System.out.println("- mexicanfoodrecipes.com");
        System.out.println("- authenticmexican.com");
    }
}
