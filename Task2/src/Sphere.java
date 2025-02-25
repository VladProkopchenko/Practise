import jdk.jfr.Percentage;

import java.math.BigDecimal;

public class Sphere extends Volume implements Printable {
    BigDecimal radius;

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }
    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calcVolume() {
        return radius.multiply(BigDecimal.valueOf(0.75*3.14));
    }

    @Override
    public void print() {
        System.out.println("Это тело с объемом " + calcVolume());
    }
}
