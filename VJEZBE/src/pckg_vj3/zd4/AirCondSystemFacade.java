package pckg_vj3.zd4;

public class AirCondSystemFacade {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;
    private SubSystemEnergy subSystemEnergy;
    private SubSystemTimer subSystemTimer;

    public AirCondSystemFacade() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
        this.subSystem3 = new SubSystem3();
        this.subSystemEnergy = new SubSystemEnergy();
        this.subSystemTimer = new SubSystemTimer();
    }

    public void startAirConditioningSystem() {
        System.out.println("Starting AC system...");
        subSystem1.setMode("COOL");
        subSystem2.setTemperature(22.0f);
        subSystem2.fanSpeed(2);
        subSystem3.turnIonizer(true);
        subSystemEnergy.on();
        subSystemEnergy.mode("NORMAL");
        subSystemEnergy.start();
        subSystemTimer.program(1);
        subSystemTimer.on(true);
        System.out.println("AC system started successfully!");
    }

    public void stopAirConditioningSystem() {
        System.out.println("Stopping AC system...");
        subSystemTimer.on(false);
        subSystemTimer.program(0);
        subSystemEnergy.stop();
        subSystem3.turnIonizer(false);
        subSystem2.fanSpeed(0);
        subSystem2.setTemperature(25.0f);
        subSystem1.setMode("OFF");
        subSystemEnergy.off();
        System.out.println("AC system stopped successfully!");
    }
}
