package pckg_home_controller;

import java.util.Stack;

// IMPLEMENTACIJA UNDO I REDO FUNKCIONALNOSTI!
public class ControllerHome {

    private Command command;
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public ControllerHome(){
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressBtnRunCmd(){
        if(command != null){
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }else{
            System.out.println("No command set!");
        }
    }

    public void pressBtnRunUndo(){
        if(undoStack.isEmpty()){
            System.out.println("No command to undo!");
        }else{
            command = undoStack.pop();
            command.undoCmd();
            redoStack.push(command);
            listRedoStack();
            listUndoStack();
        }
    }

    public void pressBtnRunRedo(){
        if(redoStack.isEmpty()){
            System.out.println("No command to redo!");
        }else{
            command = redoStack.pop();
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack(){
        if(undoStack.isEmpty()){
            System.out.println("Undo stack is empty!");
        }else{
            System.out.println("=============Undo stack:============");
            for(Command cmd : undoStack){
                System.out.println(cmd);
            }
        }
    }

    private void listRedoStack(){
        if(redoStack.isEmpty()){
            System.out.println("Redo stack is empty!");
        }else{
            System.out.println("============Redo stack:============");
            for(Command cmd : redoStack){
                System.out.println(cmd);
            }
        }
    }

    public void resetBtnController(){
        command = null;
        undoStack.clear();
        redoStack.clear();
        System.out.println("Controller is reset!");
    }
}
