package pckg_macro;

import java.util.ArrayList;

public class MacroTest {

    public static void main(String[] args) {
        GarageDoorOpen garageDoorOpen = new GarageDoorOpen();
        GarageLightOn garageLightOn = new GarageLightOn();

        ArrayList<Command> commands = new ArrayList<>();
        commands.add(garageDoorOpen);
        commands.add(garageLightOn);

        MacroCmdFst macroCommand = new MacroCmdFst(commands);
        macroCommand.run();
        macroCommand.undo();
    }
}
