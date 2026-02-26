public class Square implements Shapee{
    private double side;
    Square(double side){
                this.side=side;
            }

    @Override
    public double area() {
        return side*side;
    }
}
