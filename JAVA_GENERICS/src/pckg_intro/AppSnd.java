package pckg_intro;

import java.util.ArrayList;

public class AppSnd {

    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList();
        lst1.add("String1");
        ArrayList<Integer> lst2 = new ArrayList();
        lst2.add(100);
        ArrayList<User> lst3 = new ArrayList();
        lst3.add(new User("User"));

//        AUX_CLS.listStringList(lst1);
//        AUX_CLS.listIntegerList(lst2);
//        AUX_CLS.listUserList(lst3);
        AUX_CLS.listElements(lst1);
        AUX_CLS.listElements(lst2);
        AUX_CLS.listElements(lst3);

    }
}
