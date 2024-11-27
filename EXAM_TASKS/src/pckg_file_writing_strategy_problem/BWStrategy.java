package pckg_file_writing_strategy_problem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BWStrategy implements WriteStrategy{

    @Override
    public void writeToFile(String content, String filePath) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath), true))) {
            bw.write(content);
            bw.write("\n");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
