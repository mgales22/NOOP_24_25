package pckg_vj3.zd2;

public class NewSoftwarePlotter implements NewPlotter {
    @Override
    public void printGraphics(String graphics) {
        System.out.println("New plotter printing: " + graphics);
    }
}