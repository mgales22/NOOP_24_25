package pckg_vj6.zd1;

public class JSONBatchProcessor extends BatchProcessor {
    @Override
    public FileParser createFileParser() {
        return new JSONFileParser();
    }
}
