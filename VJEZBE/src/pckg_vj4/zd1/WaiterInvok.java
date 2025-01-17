package pckg_vj4.zd1;

public class WaiterInvok {
    private String waitName;
    private IntCmd command;

    public WaiterInvok(String waitName) {
        this.waitName = waitName;
    }

    public void setOrderCmd(IntCmd cmd) {
        this.command = cmd;
    }

    public void setUpOrder() {
        if (command != null) {
            command.executeOrder();
        }
    }

    public void withdrawOrder() {
        if (command != null) {
            command.undoOrder();
        }
    }
}

