package pckg_abs_factory_gui;

public class Application {

    private GUIFactory guiFactory;

    public Application(GUIFactory guiFactory){
        this.guiFactory = guiFactory;
        guiFactory.createGUI();
    }

    public void performSomethingForUser(){
        System.out.println("Performing in GUI: " + this.guiFactory.getClass().getSimpleName());
    }
}
