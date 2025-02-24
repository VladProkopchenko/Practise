public class Sphere implements Volume{
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

    @Override
    public void print() {
        System.out.println("Это шар с объемом " + caclVolume());
    }
}
