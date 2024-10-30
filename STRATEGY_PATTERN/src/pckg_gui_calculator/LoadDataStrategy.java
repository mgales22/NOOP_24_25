package pckg_gui_calculator;

import java.util.List;

public interface LoadDataStrategy<E> {
    List<E> loadDataFromFile(String filePath);
}
