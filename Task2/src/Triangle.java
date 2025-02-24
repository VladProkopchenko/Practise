

public class Triangle extends Figure {
    private double side, height;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * side * height;
    }


}
