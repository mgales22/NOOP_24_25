package pckg_vj7.zd4;

public class ChineseCuisine implements IBaseRecipe, IChineseRecipe {
    private String recipeName;

    public ChineseCuisine(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public void generateChineseRecipe() {
        System.out.println("Generating Chinese recipe for: " + recipeName);
        System.out.println("- Adding soy sauce");
        System.out.println("- Adding Chinese spices");
        System.out.println("- Stir-frying in wok");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("\nAdditional Chinese cuisine info:");
        System.out.println("- Balanced flavors");
        System.out.println("- Uses wok cooking");
        System.out.println("- Focus on fresh ingredients");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("\nRecommended Chinese cuisine sources:");
        System.out.println("- chinesecooking101.com");
        System.out.println("- wokrecipes.com");
    }
}

