package pckg_arrayList_command_problem;

import java.util.ArrayList;

public class InsertElementAtIndexPosition<E> implements CommandOnList<E>{

    private E element;
    private ArrayList<E> list;
    private int index;

    public InsertElementAtIndexPosition(ArrayList<E> list, E element, int index) {
        this.list = list;
        this.element = element;
        this.index = index;
    }

    @Override
    public void runCommand() {
        if(index >= 0 && index < list.size()) {
            if(list.contains(element)){
                System.out.println("\nElement already in a list.");
            }else{
                list.add(index,element);
                System.out.println("\nElemenet added to position: "+ index + " type: " +element.getClass().getSimpleName());
            }
        } else{
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    @Override
    public void undoCommand() {
        if(list.contains(element)){
            list.remove(element);
            System.out.println("\nUndo add to position = remove element from position. Element removed!");
        }else{
            System.out.println("\nNothing to undo");
        }
    }
    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@ " + Integer.toHexString(hashCode());
    }
}
