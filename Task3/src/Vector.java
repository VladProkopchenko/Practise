/**
 * Класс представляет двумерный вектор
 */
public class Vector {

    private int x;
    private int y;


    /**
     * Конструктор класса Vector
     * @param x - первый параметр
     * @param y - второй параметр
     */
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Геттер для приватной переменной х
     * @return х
     */
    public int getX() {
        return x;
    }

    /**
     * Сеттер для х
     * @param x - первое число
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Геттер для y
     * @return y
     */
    public int getY() {
        return y;
    }


    /**
     * Сеттер для y
     * @param y - второе число
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * Переопределение метода toString()
     * @return представление в виде {x, y}
     */
    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}
