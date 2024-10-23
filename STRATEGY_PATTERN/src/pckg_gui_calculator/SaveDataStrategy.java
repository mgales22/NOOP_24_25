package pckg_gui_calculator;

import java.util.List;

// <E> pomaze da se koristi bilo koji tip podataka, bilo objekt ili string nije vazno...
// Pozeljnija je parametrizacija na nivou sučelja nego na nivou metode (saveDataToFile)!
public interface SaveDataStrategy<E> {
     void saveDataToFile(String filePath, List<E> data);
}
