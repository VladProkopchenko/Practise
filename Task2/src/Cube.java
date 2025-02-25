import java.math.BigDecimal;

public class Cube extends Volume implements Printable{
    private BigDecimal side;

    public BigDecimal getSide() {
        return side;
    }

    public void setSide(BigDecimal side) {
        this.side = side;
    }

    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calcVolume() {
        return side.pow(3);
    }

    @Override
    public void print(){
        System.out.println("Это тело с объемом " + calcVolume());
    };

}
