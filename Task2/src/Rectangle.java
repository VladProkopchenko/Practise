

public class Rectangle implements Figure {

    private double side1, side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public Rectangle(double x, double y) {
        this.side1 = x;
        this.side2 = y;
    }

    @Override
    public double calcArea() {
        return side1 * side2;
    }

    @Override
    public void print() {
        System.out.println("Это фигура - прямоугольник с площадью " + calcArea());
    }
}
