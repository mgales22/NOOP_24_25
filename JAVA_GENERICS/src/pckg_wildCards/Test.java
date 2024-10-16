package pckg_wildCards;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ListCLS<Integer> fstList = new ListCLS<>();
        fstList.addNewElement(100);
        fstList.addNewElement(200);
        fstList.addNewElement(-100);
        fstList.addNewElement(200);
        fstList.listAllElements();
        List<UserSnd> users = new ArrayList<>();
        users.add(new UserSnd("Marin"));

        AnotherList anotherList = new AnotherList();
        anotherList.addNewElement(new UserSnd("Eva"), users);
        anotherList.listAllElements(users);
    }
}
