package pckg_wildCards;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E>{
    private final List<E> someList;

    public MultiListCLS(){
        this.someList = new ArrayList<>();
    }
    public MultiListCLS(List<E> someList) {
        this.someList = someList;
    }

    public void listAllElements(){
        if(someList.isEmpty()){
            System.out.println("No elements in the list.");
        }else{
            for(E element: someList){
                System.out.println(element);
            }
        }
    }

    //Kompariranje po duljini liste, pozitivan rezultat znaci da je prva lista veca od druge, negativan obratno, nula da je jednako!
    public void compareToList(List<?> anotherList){
        System.out.println(this.someList.size() - anotherList.size());
    }
}
