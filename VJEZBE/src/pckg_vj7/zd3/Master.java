package pckg_vj7.zd3;

public abstract class Master extends Repairman implements MasterRepairOperations {
    public Master(String name) {
        super(name);
    }

    @Override
    public void giveAdvice() {
        System.out.println(description + " " + name + " provides useful advice...");
    }

    @Override
    public void performRepair() {
        System.out.println(description + " " + name + " performing a repair...");
    }

    @Override
    public void performMaintenance() {
        System.out.println(description + " " + name + " provides good maintenance...");
    }
}
