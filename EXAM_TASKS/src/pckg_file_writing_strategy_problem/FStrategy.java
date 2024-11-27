package pckg_file_writing_strategy_problem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class FStrategy implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
        try{
            Files.write(Paths.get(filePath), Collections.singletonList(content), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
