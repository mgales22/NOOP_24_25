package pckg_file_writing_strategy_problem;

public class App {
    public static void main(String[] args) {
        ControllerContent controllerContent = new ControllerContent();
        String content = "Something simple!\nNew Line in content...";
        String additional = "This is something new!\nAgain, new line for example...";
        String filePath = "DATA/fst_file.txt";
        controllerContent.writeContentToFile(content, filePath);
        controllerContent.setWriteStrategy(new BWStrategy());
        controllerContent.writeContentToFile(additional, filePath);
        controllerContent.readContentFromFile(filePath);
        controllerContent.setWriteStrategy(new FOSStrategy());
        controllerContent.writeContentToFile(additional, filePath);
        controllerContent.readContentFromFile(filePath);
        controllerContent.setWriteStrategy(new FStrategy());
        controllerContent.writeContentToFile(content, filePath);
        controllerContent.readContentFromFile(filePath);
    }
}
