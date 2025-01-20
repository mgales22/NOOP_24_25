package pckg_vj7.zd4;

public class App {
    public static void main(String[] args) {
        MediterraneanCuisine mediterraneanDish = new MediterraneanCuisine("Greek Salad");
        ChineseCuisine chineseDish = new ChineseCuisine("Kung Pao Chicken");
        MexicanCuisine mexicanDish = new MexicanCuisine("Tacos al Pastor");
        IndianCuisine indianDish = new IndianCuisine("Butter Chicken");

        System.out.println("=== Mediterranean Cuisine ===");
        mediterraneanDish.generateMediterraneanRecipe();
        mediterraneanDish.provideAdditionalInfo();
        mediterraneanDish.recommendWebSources();

        System.out.println("\n=== Chinese Cuisine ===");
        chineseDish.generateChineseRecipe();
        chineseDish.provideAdditionalInfo();
        chineseDish.recommendWebSources();

        System.out.println("\n=== Mexican Cuisine ===");
        mexicanDish.generateMexicanRecipe();
        mexicanDish.provideAdditionalInfo();
        mexicanDish.recommendWebSources();

        System.out.println("\n=== Indian Cuisine ===");
        indianDish.generateIndianRecipe();
        indianDish.provideAdditionalInfo();
        indianDish.recommendWebSources();
    }
}
