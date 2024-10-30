package pckg_gui_calculator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadTxtStrategy implements LoadDataStrategy<String> {
    @Override
    public List<String> loadDataFromFile(String filePath) {
        List<String> loadedData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                loadedData.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedData;
    }
}