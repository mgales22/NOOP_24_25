package pckg_vj3.zd4;

public class SubSystemEnergy {
    public void on() {
        System.out.println("Energy subsystem: Turning on");
    }

    public void mode(String mode) {
        System.out.println("Energy subsystem: Setting mode to " + mode);
    }

    public void start() {
        System.out.println("Energy subsystem: Starting");
    }

    public void stop() {
        System.out.println("Energy subsystem: Stopping");
    }

    public void off() {
        System.out.println("Energy subsystem: Turning off");
    }
}
