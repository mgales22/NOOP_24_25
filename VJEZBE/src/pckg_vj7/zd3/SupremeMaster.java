package pckg_vj7.zd3;

public class SupremeMaster extends Master {
    public SupremeMaster(String name) {
        super(name);
    }

    // Metoda za evaluaciju rada drugih servisera
    public void evaluateWork(Repairman repairman) {
        System.out.println("\nEvaluation report for " + repairman.getName() + ":");

        if (repairman instanceof Master) {
            System.out.println("- Can perform all repair operations independently");
            if (repairman instanceof ExperiencedMaster) {
                System.out.println("- Has proven experience in complex repairs");
            } else if (repairman instanceof NoviceMaster) {
                System.out.println("- Still gaining experience in complex repairs");
            }
        } else if (repairman instanceof Apprentice) {
            System.out.println("- Still in training phase");
            System.out.println("- Needs supervision for repairs");
        }

        System.out.println("- Tool management: Satisfactory");
    }
}
