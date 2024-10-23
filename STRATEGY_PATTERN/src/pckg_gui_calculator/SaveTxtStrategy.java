package pckg_gui_calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxtStrategy implements SaveDataStrategy<String> {
    @Override
    public void saveDataToFile(String filePath, List<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
            for (String record : data) {
                bw.write(record);
                bw.newLine();
            }
            System.out.println("Data saved to file as txt: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
