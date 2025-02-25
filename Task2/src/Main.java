import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(BigDecimal.valueOf(10));
        Cube cube = new Cube(BigDecimal.valueOf(10));
        Rectangle rectangle = new Rectangle(BigDecimal.valueOf(10), BigDecimal.valueOf(15));
        Sphere sphere = new Sphere(BigDecimal.valueOf(10));
        Triangle triangle = new Triangle(BigDecimal.valueOf(10),BigDecimal.valueOf(15));

        circle.print();
        cube.print();
        rectangle.print();
        sphere.print();
        triangle.print();
    }
}