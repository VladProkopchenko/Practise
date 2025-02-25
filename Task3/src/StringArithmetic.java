/**
 * Реализация интерфейса для строк
 */

public class StringArithmetic implements Arithmetic<String> {

    /**
     *
     * @param a - первая строка
     * @param b - вторая строка
     * @return конкатенация двух строк
     */
    @Override
    public String add(String a, String b) {
        return a.concat(b);
    }

    /**
     *
     * @param a - первая строка
     * @param b - вторая строка
     * @return строку a с вырезанными подстроками b
     */
    @Override
    public String substract(String a, String b) {
        return a.replace(b, "");
    }

    /**
     *
     * @param a - первая строка
     * @param b - вторая строка
     * @return строку a, повторенную b.lenght() раз
     */
    @Override
    public String multiply(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            a+=a;
        }
        return a;
    }

    /**
     *
     * @param a - первая строка
     * @param b - вторая строка
     * @return строку a, в которой подстроки b отделены "|"
     */
    @Override
    public String divide(String a, String b) {
        return a.replace(b, " | " + b + " | ");
    }
}
