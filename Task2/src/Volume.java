abstract class Volume {
    public abstract double caclVolume();
    public void print(){
        System.out.println("Это тело с объемов " + caclVolume());
    };
}
