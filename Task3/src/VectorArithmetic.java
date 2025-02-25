/**
 * Реализация интерфейса для двумерных векторов
 */

public class VectorArithmetic implements Arithmetic<Vector> {

    /**
     *
     * @param a - первый вектор
     * @param b - второй второй
     * @return результат сложения векторов
     */
    @Override
    public Vector add(Vector a, Vector b) {
        return new Vector(a.getX()+b.getX(), a.getY()+b.getY());
    }

    /**
     *
     * @param a - первый вектор
     * @param b - второй второй
     * @return результат разности векторов
     */
    @Override
    public Vector substract(Vector a, Vector b) {
        return new Vector(a.getX()-b.getX(), a.getY()-b.getY());
    }

    /**
     *
     * @param a - первый вектор
     * @param b - второй второй
     * @return результат произведения векторов
     */
    @Override
    public Vector multiply(Vector a, Vector b) {
        return new Vector(a.getX()*b.getX(), a.getY()*b.getY());
    }

    /**
     *
     * @param a - первый вектор
     * @param b - второй второй
     * @return результат деления векторов
     */
    @Override
    public Vector divide(Vector a, Vector b) {
        return new Vector(a.getX()/b.getX(), a.getY()/b.getY());
    }
}
