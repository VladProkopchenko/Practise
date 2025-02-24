abstract class Figure {
    public abstract  double calcArea();
    public void print(){
        System.out.println("Это фигура с площадью " + calcArea());
    };
}
