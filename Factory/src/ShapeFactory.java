import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;
import Shapes.Triangle;

//instead of writing this logic of deciding b/w which class in main, we can use a factory to write all that logic
public class ShapeFactory {

    private Shape shape;

    Shape getShape(String input){
        switch (input){
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            case "TRIANGLE":
                return new Triangle();
        }
        return new Square();
    }
}
