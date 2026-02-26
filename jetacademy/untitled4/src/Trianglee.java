public class Trianglee implements Shapee {
    private double base;
    private double side;
    public Trianglee(double base, double side) {
        this.base = base;
        this.side = side;
    }
    @Override
    public double area(){
        return (base+side)/2;
    }
}
