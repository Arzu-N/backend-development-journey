public class ProgrammingCourse extends Course implements Certificate{
    ProgrammingCourse(String title,double price){
        super(title,price);
    }
    public void displayInfo(){
        System.out.println("Programming Course "+getTitle()+" "+getPrice());
        if(getPrice()>100)System.out.println("This is a premium course");
        else System.out.println("This is a budget-friendly course");
    }
    @Override
    public void issueCertificate(){
        System.out.println(getTitle()+" Certificate issued");
    }
}
