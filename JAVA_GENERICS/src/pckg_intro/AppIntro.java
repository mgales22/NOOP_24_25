package pckg_intro;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class AppIntro {

    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        lst.add(100);
        lst.add("Something");
        lst.add(23.57);
        lst.add(2E11);
        lst.add(new User("Zoki"));
        listElements(lst);
        System.out.println(new User("Ime1"));
    }

    private static void listElements(ArrayList lst) {
        int lnght = lst.size();
        for (int i = 0; i < lnght; i++) {
            System.out.println("Element" + lst.get(i));
        }
    }
}
