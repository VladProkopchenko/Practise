public class ExObject implements Comparable<ExObject>{

    private int num;
    private String str;

    public ExObject(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "(" + num + ", " + str + ")";
    }

    @Override
    public int compareTo(ExObject o) {
        return this.num - o.num;
    }
}
