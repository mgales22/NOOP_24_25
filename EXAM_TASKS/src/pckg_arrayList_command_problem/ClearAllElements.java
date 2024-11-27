package pckg_arrayList_command_problem;

import java.util.ArrayList;

public class ClearAllElements<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private final ArrayList<E> copyList;

    public ClearAllElements(ArrayList<E> list) {
        this.list = list;
        this.copyList = new ArrayList<>();
    }

    @Override
    public void runCommand() {
        if(list.isEmpty()) {
            System.out.println("\nList is already empty.");
        }else{
            copyList.addAll(list);
            list.clear();
            System.out.println("\nList cleared.");
        }
    }

    @Override
    public void undoCommand() {
        if(copyList.isEmpty()) {
            System.out.println("\nNothing to undo.");
        }else{
            list.addAll(copyList);
            copyList.clear();
            System.out.println("\nUndo clear list = add all elements back to the list.");
        }
    }
    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@ " + Integer.toHexString(hashCode());
    }
}
