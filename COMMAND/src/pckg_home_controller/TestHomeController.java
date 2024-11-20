package pckg_home_controller;

public class TestHomeController {
    public static void main(String[] args) {
        LightOnCmd lightOnCmd = new LightOnCmd(new Light());
        ControllerHome controllerHome = new ControllerHome();
        controllerHome.setCommand(lightOnCmd);
        controllerHome.pressBtnRunCmd();
        controllerHome.setCommand(new TurnOnTVCommand(new TV()));
        controllerHome.pressBtnRunCmd();
        controllerHome.pressBtnRunUndo();
        controllerHome.pressBtnRunRedo();
        controllerHome.resetBtnController();


    }

}
