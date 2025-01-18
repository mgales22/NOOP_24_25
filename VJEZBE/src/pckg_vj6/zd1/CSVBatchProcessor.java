package pckg_vj6.zd1;

public class CSVBatchProcessor extends BatchProcessor {
    @Override
    public FileParser createFileParser() {
        return new CSVFileParser();
    }
}
