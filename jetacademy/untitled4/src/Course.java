public abstract class Course {
    private String title;
    private double price;
    public static int totalCourse=0;
    public final  String Platform="OnlineAcademy";
    Course(String title,double price){
        this.title=title;
        this.price=price;
        totalCourse++;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    abstract void displayInfo();
}
