import java.math.BigDecimal;

public class Triangle extends Figure implements Printable{
    private BigDecimal side, height;

    public BigDecimal getSide() {
        return side;
    }

    public void setSide(BigDecimal side) {
        this.side = side;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Triangle(BigDecimal side, BigDecimal height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public BigDecimal calcArea() {
        return side.multiply(height).multiply(BigDecimal.valueOf(0.5));
    }


    @Override
    public void print() {
        System.out.println("Это фигура с площадью " + calcArea());
    }
}
