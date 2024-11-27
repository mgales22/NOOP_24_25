package pckg_arrayList_command_problem;

import java.util.Stack;

public class ArrayListController {
    private Stack<CommandOnList> undoStack;
    private Stack<CommandOnList> redoStack;
    private CommandOnList currentCommand;

    public ArrayListController() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void setCommand(CommandOnList cmd){
        this.currentCommand = cmd;
    }

    public void runCommand(){
        if(currentCommand!=null) {
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }else{
            System.out.println("Set some command on list!");
        }
    }

    public void undoCommand(){
        if(undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
        }else{
            currentCommand = undoStack.pop();
            currentCommand.undoCommand();
            redoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }
    public void redoCommand(){
        if(redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
        }else{
            currentCommand = redoStack.pop();
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack(){
        if(undoStack.isEmpty()) {
            System.out.println("Undo stack is empty.");
        }else {
            System.out.println("\n========================Undo stack:========================");
            for (CommandOnList cmd : undoStack) {
                System.out.println(cmd);
            }
        }
    }

    private void listRedoStack(){
        if(redoStack.isEmpty()) {
            System.out.println("\nRedo stack is empty.");
        }else {
            System.out.println("\n========================Redo stack:========================");
            for (CommandOnList cmd : redoStack) {
                System.out.println(cmd);
            }
        }
    }
}
