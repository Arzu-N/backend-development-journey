public class DesignCourse extends Course implements Certificate{
    DesignCourse(String title,double price){
        super(title,price);
    }
    @Override
    public void displayInfo(){
        System.out.println("Design Course "+getTitle()+" "+getPrice());
        if(getPrice()>80) System.out.println("This is a premium course");
        else System.out.println("This is a budget-friendly course");
    }
    @Override
    public void issueCertificate(){
        System.out.println(getTitle()+" Certificate issued");
    }
}
