public class Cube extends Volume{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double side) {
        this.side = side;
    }


    @Override
    public double caclVolume() {
        return side * side*side;
    }

}
