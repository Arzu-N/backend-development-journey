public class Circlee implements Shapee{
    private double radius;
    Circlee(double radius){
        this.radius = radius;
    }
    @Override
   public double area(){
        return 2*Math.PI*radius*radius;
    }
}
