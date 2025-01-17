package pckg_vj4.zd1;

import java.util.ArrayList;
import java.util.HashMap;

public class Chef {
    private String chefName;

    public Chef(String chefName) {
        this.chefName = chefName;
    }

    public void analyzeOrder() {
        System.out.println(chefName + " is analysing the order");
    }

    public void collectFoodStat(HashMap<FoodCat, ArrayList<Food>> orders) {
        System.out.println(chefName + " -> collecting foodstuffs:");
        for (var entry : orders.entrySet()) {
            System.out.println(entry.getKey() + " in this order...");
            for (var food : entry.getValue()) {
                System.out.println(food);
            }
        }
    }

    public void preparingFood(HashMap<FoodCat, ArrayList<Food>> orders) {
        System.out.println(chefName + " -> preparing:");
        for (var entry : orders.entrySet()) {
            for (var food : entry.getValue()) {
                System.out.println(food);
            }
        }
        System.out.println("All is finished and can be served to guests.");
    }

    public void stopAndRecall() {
        System.out.println("Order preparation stopped and recalled!");
    }
}

