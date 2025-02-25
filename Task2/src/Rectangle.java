import java.math.BigDecimal;

public class Rectangle extends Figure implements Printable{

    private BigDecimal side1, side2;

    public BigDecimal getSide1() {
        return side1;
    }

    public void setSide1(BigDecimal side1) {
        this.side1 = side1;
    }

    public BigDecimal getSide2() {
        return side2;
    }

    public void setSide2(BigDecimal side2) {
        this.side2 = side2;
    }

    public Rectangle(BigDecimal x, BigDecimal y) {
        this.side1 = x;
        this.side2 = y;
    }

    @Override
    public BigDecimal calcArea() {
        return side1.multiply(side2);
    }

    @Override
    public void print() {
        System.out.println("Это фигура с площадью " + calcArea());
    }
}
