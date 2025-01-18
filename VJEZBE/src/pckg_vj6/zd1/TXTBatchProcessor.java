package pckg_vj6.zd1;

public class TXTBatchProcessor extends BatchProcessor {
    @Override
    public FileParser createFileParser() {
        return new TextFileParser();
    }
}
