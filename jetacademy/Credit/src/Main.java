import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Arzu","Nusratova",23,false,LocalDate.of(2025,3,16));
        Customer c2= new Customer("Gunay","Mammadli",27,true,LocalDate.of(2025,12,20));
        Customer c3 = new Customer("Hecer","Semedli",29,true,LocalDate.of(2025,11,3));
        Customer c4 = new Customer("Ayha","Bayramli",35,false,LocalDate.of(2025,12,30));
        Customer c5 = new Customer("Ayxan","Nusratova",23,false,LocalDate.of(2025,1,18));
        Customer c6 = new Customer("Namiq","Rustaamli",35,true,LocalDate.of(2025,11,25));
        Customer c7 = new Customer("Yashaar","Hajiyev",40,false,LocalDate.of(2025,12,22));
        Customer[]customer = {c1,c2,c3,c4,c5,c6,c7};
        Credit credit = new Credit(customer);

        for(int i=0;i<customer.length;i++){
          if((credit.customer[i].getDate().getYear()< LocalDate.now().getYear())
                  ||((credit.customer[i].getDate().getYear()==LocalDate.now().getYear())&&(credit.customer[i].getDate().getMonthValue()<LocalDate.now().
                  getMonthValue()) )
                  ||((credit.customer[i].getDate().getYear()==LocalDate.now().getYear())&&(credit.customer[i].getDate().getMonthValue()==LocalDate.now().
                  getMonthValue()))&&(credit.customer[i].getDate().getDayOfMonth()<= LocalDate.now().getDayOfMonth()) ){
              if( !(credit.customer[i].isPaid()) ){
                  System.out.println(credit.customer[i].getName()+" borcunuzu odeyin");
              }
          }
        }
    }
}