package pckg_file_writing_strategy_problem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSStrategy implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
        try(FileOutputStream fos = new FileOutputStream(filePath, true)) {
            fos.write(content.getBytes());
            fos.write(System.lineSeparator().getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
