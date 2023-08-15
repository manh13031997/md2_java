import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =  new Square(5.0,"red",false);
        shapes[1] = new Circle(5.0,"red",false);
        shapes[2] = new Rectangle(4,6,"blue",false);
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.toString());

        }
    }
}