package pckg_fst_adapter;

import java.util.Iterator;

public class Client<E> {

    private Iterator<E> iterator;

    public Client(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    public void someInfo(){
        while(iterator.hasNext()){
            System.out.println("Element info: " + iterator.next());
        }
    }

    public void removeFetchedElement(){
        if(iterator.hasNext()){
            E element = iterator.next();
            System.out.println("Fetched: " + element);
            iterator.remove();
            System.out.println("Fetched removed: " + element);
        }
    }
}