package pckg_vj7.zd4;

public class MediterraneanCuisine implements IBaseRecipe, IMediterraneanRecipe {
    private String recipeName;

    public MediterraneanCuisine(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public void generateMediterraneanRecipe() {
        System.out.println("Generating Mediterranean recipe for: " + recipeName);
        System.out.println("- Adding olive oil");
        System.out.println("- Adding fresh Mediterranean herbs");
        System.out.println("- Cooking with traditional Mediterranean methods");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("\nAdditional Mediterranean cuisine info:");
        System.out.println("- Rich in healthy fats");
        System.out.println("- Uses fresh, local ingredients");
        System.out.println("- Known for health benefits");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("\nRecommended Mediterranean cuisine sources:");
        System.out.println("- mediterraneancooking.com");
        System.out.println("- oliveoilrecipes.com");
    }
}

