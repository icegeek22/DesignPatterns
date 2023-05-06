import Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        triangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}