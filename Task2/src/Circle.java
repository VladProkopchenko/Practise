import java.awt.*;
import java.io.Serializable;
import java.math.BigDecimal;

public class Circle extends Figure implements Printable {
    private BigDecimal radius;

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calcArea() {
        return radius.multiply(radius).multiply(BigDecimal.valueOf(3.14));
    }

    @Override
    public void print() {
        System.out.println("Это фигура с площадью " + calcArea());
    }
}
