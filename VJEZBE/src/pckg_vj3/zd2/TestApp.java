package pckg_vj3.zd2;

public class TestApp {
    public static void main(String[] args) {
        NewPlotter newPlotter = new NewSoftwarePlotter();

        LegacyPlotter legacyPlotter = new LegacyPlotter();

        NewPlotter adapter = new PlotterAdapter(legacyPlotter);

        System.out.println("Printing through new plotter:");
        newPlotter.printGraphics("Test graphics 1");

        System.out.println("\nPrinting through adapter (legacy plotter):");
        adapter.printGraphics("Test graphics 2");
    }
}
