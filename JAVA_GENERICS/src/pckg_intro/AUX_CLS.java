package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    public static void listStringList(ArrayList<String> lst) {
        for (String str : lst) {
            System.out.println("String: " + str);
        }
    }

    public static void listIntegerList(ArrayList<Integer> lst) {
        for (Integer intEl : lst) {
            System.out.println("Integer: " + intEl);
        }
    }

    public static void listUserList(ArrayList<User> lst) {
        for (User user : lst) {
            System.out.println("User: " + user);
        }
    }

    public static <E> void listElements(ArrayList<E> someList) {
        if(someList.isEmpty()){
            System.out.println("List is empty");
        }else{
            for (E element : someList) {
                System.out.println("Element: " + element);
            }
        }
    }

    public static <E> void listElementsVerSnd(ArrayList<E> someList){
        Iterator<E> iter = someList.iterator();
        while(iter.hasNext()){
            System.out.println("Element: " + iter.next());
        }
    }

    public static <K,V> void listMapElements(HashMap<K,V> map){
        if(map.isEmpty()){
            System.out.println("Map is empty");
        }else{
            System.out.println("Map details as object: " + Integer.toHexString(map.hashCode()));
            for(Map.Entry<K,V> entry : map.entrySet()){
                System.out.println("Key: " + entry.getKey());
                System.out.println(" Value:" + entry.getValue());
            }
        }
    }
}
