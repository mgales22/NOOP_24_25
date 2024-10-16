package pckg_wildCards;

import java.util.ArrayList;
import java.util.List;

public class ListCLS<T extends Number>{

    private final List<T> lst;

    public ListCLS() {
        this.lst = new ArrayList<>();
    }

    public void addNewElement(T element){
        lst.add(element);
    }

    public void listAllElements(){
        for(T element: lst){
            System.out.println(element);
        }
    }
}
