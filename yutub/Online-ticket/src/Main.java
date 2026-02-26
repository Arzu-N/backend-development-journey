import java .util.Scanner;

public class Main {
    public static void main(String[] args) {

Movie[]movies={
        new Movie("Avatar",5),
        new Movie("Honour",10)
};

TicketSystem t=new TicketSystem(movies);

Scanner sc=new Scanner(System.in);

String n = sc.next();
int a = sc.nextInt();


    t.buy(n,a);


        t.printTickets();
}
}