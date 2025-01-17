package pckg_vj4.zd1;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Chef chef = new Chef("Mirko");
        WaiterInvok waiter = new WaiterInvok("Ivan");

        HashMap<FoodCat, ArrayList<Food>> orders = new HashMap<>();
        ArrayList<Food> fishFoods = new ArrayList<>();
        fishFoods.add(new Food(FoodName.food1, 60.50));
        orders.put(FoodCat.Fish, fishFoods);

        ArrayList<Food> dessertFoods = new ArrayList<>();
        dessertFoods.add(new Food(FoodName.food3, 50));
        orders.put(FoodCat.Dessert, dessertFoods);

        ArrayList<Food> otherFoods = new ArrayList<>();
        otherFoods.add(new Food(FoodName.food5, 12.50));
        orders.put(FoodCat.Vegetables, otherFoods);

        OrderCmd orderCmd = new OrderCmd(chef, 10, orders);
        waiter.setOrderCmd(orderCmd);

        waiter.setUpOrder();
        waiter.withdrawOrder();
    }
}
