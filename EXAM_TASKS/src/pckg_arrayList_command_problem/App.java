package pckg_arrayList_command_problem;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        User user1 = new User("userName-01");
        User user2 = new User("userName-02");
        User user3 = new User("userName-03");
        User user4 = new User("userName-04");
        ArrayList<User> users = new ArrayList<>();

        Car car1 = new Car("Mercedes", "SLK");
        Car car2 = new Car("Tesla", "Y3");
        Car car3 = new Car("BMW", "X5");
        ArrayList<Car> cars = new ArrayList<>();

        ArrayListController arrayListController = new ArrayListController();
        AddNewElementToList<User> add1 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add2 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add3 = new AddNewElementToList<>(users, user2);
        InsertElementAtIndexPosition<User> insert1 = new InsertElementAtIndexPosition<>(users, user3, 1);
        ClearAllElements<User> clearAllElements = new ClearAllElements<>(users);

        AddNewElementToList<Car> addCar1 = new AddNewElementToList<>(cars, car1);


        arrayListController.setCommand(add1);
        arrayListController.runCommand();
        arrayListController.setCommand(add2);
        arrayListController.runCommand();
        arrayListController.setCommand(add3);
        arrayListController.runCommand();
        arrayListController.setCommand(insert1);
        arrayListController.runCommand();
        arrayListController.setCommand(addCar1);
        arrayListController.runCommand();
        arrayListController.undoCommand();
        arrayListController.undoCommand();
        arrayListController.setCommand(clearAllElements);
        arrayListController.runCommand();
    }

    private static <E> void listElements(ArrayList<E> list){
        if(list.isEmpty()){
            System.out.println("List is empty. Nothing to list!");
        }else{
            System.out.println("\n========================List elements:========================");
            for (E element : list) {
                System.out.println(element);
            }
        }
    }
}
