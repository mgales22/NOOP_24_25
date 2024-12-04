package pckg_2d_drawing;

public class LineStyleDecorator extends ShapeDecorator{

    private LINESTYLE style;
    protected LineStyleDecorator(BasicShape shape, LINESTYLE style){
        super(shape);
        this.style = style;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing decorated: " + this.basicShape);
    }

    @Override
    public void resize() {
        System.out.println("Resizing the decorated shape: " + getClass().getSimpleName());
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public boolean isHidden() {
        return this.basicShape.isHidden();
    }

    @Override
    public void shapeName(String name) {
        System.out.println(this.basicShape + " decorated with name: " + name);
    }

    @Override
    protected void decorateShape() {
        System.out.println("Decorating: " + this.basicShape + " with line style: " + this.style);
        System.out.println("Setting some line style: " + this.style);
    }

    @Override
    public String toString() {
        return "LineStyleDecorator{" +
                "style=" + style +
                '}';
    }
}
