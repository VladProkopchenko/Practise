/**
 * Реализация интерфейса для типа double
 */
public class DoubleArithmetic implements Arithmetic<Double> {
    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return сумму a и b
     */
    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return разность a и b
     */
    @Override
    public Double substract(Double a, Double b) {
        return a - b;
    }

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return произведение a и b
     */
    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }


    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return результат деления a на b
     */
    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }
}
