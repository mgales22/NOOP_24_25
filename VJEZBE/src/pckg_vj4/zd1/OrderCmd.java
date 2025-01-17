package pckg_vj4.zd1;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderCmd implements IntCmd {
    private Chef chef;
    private int tableNumber;
    private HashMap<FoodCat, ArrayList<Food>> orders;

    public OrderCmd(Chef chef, int tableNumber, HashMap<FoodCat, ArrayList<Food>> orders) {
        this.chef = chef;
        this.tableNumber = tableNumber;
        this.orders = orders;
    }

    @Override
    public void executeOrder() {
        System.out.println("<<<< [Table: " + tableNumber + "] >>>>");
        chef.analyzeOrder();
        chef.collectFoodStat(orders);
        chef.preparingFood(orders);
    }

    @Override
    public void undoOrder() {
        chef.stopAndRecall();
    }
}

