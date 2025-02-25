/**
 * Реализация интерфейса для целых чисел
 */

public class IntegerArithmetic implements Arithmetic<Integer> {

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return сумму a и b
     */
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return разность a и b
     */
    @Override
    public Integer substract(Integer a, Integer b) {
        return a - b;
    }

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return произведение a и b
     */
    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return результат деления a на b
     */
    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }
}
