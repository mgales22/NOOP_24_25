package pckg_vj7.zd3;

public abstract class Repairman implements RepairmanBasicOperations {
    protected String name;
    protected String description;

    public Repairman(String name) {
        this.name = name;
        this.description = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    @Override
    public void askForAdvice() {
        System.out.println(description + " " + name + " asks for advice...");
    }

    @Override
    public void bringTools() {
        System.out.println("Every repairman can and should bring a tool bag...");
    }
}
