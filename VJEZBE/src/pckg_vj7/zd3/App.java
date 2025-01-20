package pckg_vj7.zd3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Repairman> repairmen = new ArrayList<>();

        NoviceMaster novice = new NoviceMaster("Marko");
        ExperiencedMaster experienced = new ExperiencedMaster("Josipa");
        SupremeMaster supreme = new SupremeMaster("Vedrana");
        Apprentice apprentice = new Apprentice("Stipe");

        repairmen.add(novice);
        repairmen.add(experienced);
        repairmen.add(supreme);
        repairmen.add(apprentice);

        // Osnovne operacije koje svi mogu izvrsiti
        System.out.println("\nBasic operations demonstration:");
        repairmen.forEach(repairman -> {
            repairman.askForAdvice();
            repairman.bringTools();
        });

        // Napredne operacije samo za majstore
        System.out.println("\nAdvanced operations demonstration:");
        repairmen.forEach(repairman -> {
            if (repairman instanceof Master master) {
                master.giveAdvice();
                master.performRepair();
                master.performMaintenance();
            }
        });

        System.out.println("\nWork evaluation by Supreme Master:");
        repairmen.forEach(supreme::evaluateWork);
    }
}
