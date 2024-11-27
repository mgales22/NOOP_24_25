package pckg_file_writing_strategy_problem;

public class ControllerContent {
    private WriteStrategy writeStrategy;
    private ReadStrategy readStrategy;

    public ControllerContent() {
        this.writeStrategy = new FWStrategy();
        System.out.println("Default write strategy: " + writeStrategy.getClass().getSimpleName());
        this.readStrategy = new BRStrategy();
        System.out.println("Default read strategy: " + readStrategy.getClass().getSimpleName());
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
        System.out.println("Write strategy set to: " + writeStrategy.getClass().getSimpleName());
    }

    public void writeContentToFile(String content, String filePath){
        if(writeStrategy!=null){
            writeStrategy.writeToFile(content, filePath);
            System.out.println("Content written to file: " + filePath);
            System.out.println("Write strategy is: " + writeStrategy.getClass().getSimpleName());
        }
    }

    public void setReadStrategy(ReadStrategy readStrategy) {
        this.readStrategy = readStrategy;
        System.out.println("Read strategy set to: " + readStrategy.getClass().getSimpleName());
    }
    public void readContentFromFile(String filePath){
        if(readStrategy!=null){
            String content = readStrategy.readFromFile(filePath);
            System.out.println("Content read from file: " + filePath);
            System.out.println("Read strategy is: " + readStrategy.getClass().getSimpleName());
            System.out.println("Content: " + content);
        }
    }
}
