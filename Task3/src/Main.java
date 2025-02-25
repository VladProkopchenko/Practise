/**
 * @author Влад Прокопченко
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        DoubleArithmetic doubleArithmetic = new DoubleArithmetic();
        System.out.println(doubleArithmetic.multiply(6.7, 4.3));

        StringArithmetic stringArithmetic = new StringArithmetic();
        System.out.println(stringArithmetic.divide("qwerty?", "rt"));

        IntegerArithmetic integerArithmetic = new IntegerArithmetic();
        System.out.println(integerArithmetic.substract(20, 3));

        VectorArithmetic vectorArithmetic = new VectorArithmetic();
        System.out.println(vectorArithmetic.add(new Vector(2, 3), new Vector(4, 5)));

    }
}