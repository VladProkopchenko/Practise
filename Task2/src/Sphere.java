public class Sphere extends Volume{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double caclVolume() {
        return 0.75*3.14*radius;
    }

}
