package pckg_vj6.zd1;

import java.io.File;

public class App {

    public static void main(String[] args) {
        File file1 = new File("C://Documents/fileName.json");
        File file2 = new File("someFile.csv");
        File file3 = new File("File.txt");

        String ext1 = getFileExtension(file1.getName());
        BatchProcessor bp1 = createBatchProcessor(ext1);
        bp1.processBatch(file1);

        String ext2 = getFileExtension(file2.getName());
        BatchProcessor bp2 = createBatchProcessor(ext2);
        bp2.processBatch(file2);

        String ext3 = getFileExtension(file3.getName());
        BatchProcessor bp3 = createBatchProcessor(ext3);
        bp3.processBatch(file3);
    }

    private static String getFileExtension(String file) {
        if (file.contains(".")) {
            return file.substring(file.lastIndexOf(".") + 1);
        }
        return null;
    }

    private static BatchProcessor createBatchProcessor(String ext) {
        switch (ext) {
            case "txt":
                return new TXTBatchProcessor();
            case "csv":
                return new CSVBatchProcessor();
            case "json":
                return new JSONBatchProcessor();
            default:
                System.out.println("There is no BatchProcessor for such file type yet!!!");
                return null;
        }
    }
}

