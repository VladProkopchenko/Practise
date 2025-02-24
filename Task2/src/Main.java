public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Cube cube = new Cube(10);
        Rectangle rectangle = new Rectangle(10,15);
        Sphere sphere = new Sphere(15);
        Triangle triangle = new Triangle(10,15);

        circle.print();
        cube.print();
        rectangle.print();
        sphere.print();
        triangle.print();
    }
}