public class Telephone {
    private final String model;
    private final  Color  color;
    private final double capacity;
    private final  double price;
      static int count=0;
      static double sum=0;
    Telephone(String model, Color color, double capacity,double price) {
        this.model = model;
        this.color=color;
        this.capacity=capacity;
        this.price=price;
       count++;
       sum+=price;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }
}
