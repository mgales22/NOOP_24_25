package pckg_wildCards;

import java.util.List;

public class AnotherList{

    public <E> void addNewElement(E element, List<E> lst){
        lst.add(element);
        System.out.println("Element added to the list.");
    }

    public <E> void listAllElements(List<E> lst){
        for(E element: lst){
            System.out.println(element);
        }
    }

    public void listElement2(List<? super UserSnd> lst){

    }
}
