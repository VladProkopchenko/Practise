import java.awt.*;

public class Circle implements Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Это фигура - круг с площадью " + calcArea());
    }
}
