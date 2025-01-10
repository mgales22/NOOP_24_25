package pckg_vj3.zd2;

public class PlotterAdapter implements NewPlotter {
    private LegacyPlotter legacyPlotter;

    public PlotterAdapter(LegacyPlotter legacyPlotter) {
        this.legacyPlotter = legacyPlotter;
    }

    @Override
    public void printGraphics(String graphics) {
        legacyPlotter.plotGraphics(graphics);
    }
}
