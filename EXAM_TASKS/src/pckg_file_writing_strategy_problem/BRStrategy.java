package pckg_file_writing_strategy_problem;

import java.io.*;

public class BRStrategy implements ReadStrategy{
    @Override
    public String readFromFile(String filePath) {
        StringBuilder sb;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

}
