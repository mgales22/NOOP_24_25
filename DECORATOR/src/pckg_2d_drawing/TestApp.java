package pckg_2d_drawing;

public class TestApp {

    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.drawShape();
//        ShapeFillColorDecorator colorDecorator = new ShapeFillColorDecorator(circle, SHAPECOLOR.Green);
//        colorDecorator.drawShape();
//        System.out.println(colorDecorator);
//        ShapeLineColorDecorator lineColorDecorator = new ShapeLineColorDecorator(colorDecorator, SHAPECOLOR.Magenta);
//        lineColorDecorator.drawShape();
//        System.out.println(lineColorDecorator);

        ShapeDecorator shape = new LineStyleDecorator(new ShapeFillColorDecorator(new ShapeLineColorDecorator(new Circle(), SHAPECOLOR.Magenta), SHAPECOLOR.Green), LINESTYLE.DASH);
        shape.drawShape();

    }
}
