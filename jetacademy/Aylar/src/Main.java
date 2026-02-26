import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   /* public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);


        *//*switch (s) {
            case "JANUARY":
                System.out.println(Month.JANUARY.getValue());
                break;
            case "FEBRUARY":
                System.out.println(Month.FEBRUARY.getValue());
                break;
            case "MARCH":
                System.out.println(Month.MARCH.getValue());
                break;
            case "APRIL":
                System.out.println(Month.APRIL.getValue());
                break;
            case "MAY":
                System.out.println(Month.MAY.getValue());
                break;
            case "JUNE":
                System.out.println(Month.JUNE.getValue());
                break;
            case "JULE":
                System.out.println(Month.JULE.getValue());
                break;
            case "SEPTEMBER":
                System.out.println(Month.SEPTEMBER.getValue());
                break;
            case "OCTOBER":
                System.out.println(Month.OCTOBER.getValue());
                break;
            case "NOVEMBER":
                System.out.println(Month.NOVEMBER.getValue());
                break;
            case "DECEMBER":
                System.out.println(Month.DECEMBER.getValue());
                break;

        }*//*
        *//*if(s.equalsIgnoreCase(Month.JANUARY.name())){
            System.out.println(Month.JANUARY.getValue());
        }
        else if(s.equalsIgnoreCase(Month.FEBRUARY.name())){
            System.out.println(Month.FEBRUARY.getValue());
        }
        else if(s.equalsIgnoreCase(Month.MARCH.name())){
            System.out.println(Month.MARCH.getValue());
        }
        else if(s.equalsIgnoreCase(Month.APRIL.name())){
            System.out.println(Month.APRIL.getValue());
        }
        else if(s.equalsIgnoreCase(Month.MAY.name())){
            System.out.println(Month.MAY.getValue());
        }
        else if(s.equalsIgnoreCase(Month.JUNE.name())){
            System.out.println(Month.JUNE.getValue());
        }
        else if(s.equalsIgnoreCase(Month.JULE.name())){
            System.out.println(Month.JULE.getValue());
        }
        else if(s.equalsIgnoreCase(Month.AUGOUST.name())){
            System.out.println(Month.AUGOUST.getValue());
        }
        else if(s.equalsIgnoreCase(Month.SEPTEMBER.name())){
            System.out.println(Month.SEPTEMBER.getValue());
        }
        else if(s.equalsIgnoreCase(Month.OCTOBER.name())){
            System.out.println(Month.OCTOBER.getValue());
        }
        else if(s.equalsIgnoreCase(Month.NOVEMBER.name())){
            System.out.println(Month.NOVEMBER.getValue());
        }
        else if(s.equalsIgnoreCase(Month.DECEMBER.name())){
            System.out.println(Month.DECEMBER.getValue());
        }*//*
        *//*  switch (s) {
            case "Monday":
                System.out.println(Weekday.MONDAY.getValue());
                break;
            case "Tuesday":
                System.out.println(Weekday.TUESDAY.getValue());
                break;
            case "Wednesday":
                System.out.println(Weekday.WEDNESDAY.getValue());
            case "Thursday":
                System.out.println(Weekday.THURSDAY.getValue());
                break;
            case "Friday":
                System.out.println(Weekday.FRIDAY.getValue());
                break;
            case "Saturday":
                System.out.println(Weekday.SATURDAY.getValue());
                break;
            case "Sunday":
                System.out.println(Weekday.SUNDAY.getValue());
                break;
        }*//*
      *//*  while(true){
            String s=sc.nextLine();
            if(s.equals("0")){
break;}
            else{
        switch (s) {
            case "red":
                System.out.println(Trafficlight.RED.getValue());
                break;
            case "green":
                System.out.println(Trafficlight.GREEN.getValue());
                break;
            case "yellow":
                System.out.println(Trafficlight.YELLOW.getValue());
                break;
        }}
    }*//*
        Human h1 = new Human("Arzu", "Nusratova", 23);
        Human h2 = new Human("Arzu", "Nusratova", 23);
        Human h3 = new Human("Gulnar", "Hajiyeva", 23);
        System.out.println(h1.equals(h3));
    }}*/
//employe,menecerin bonus massi,developerin

   /* public static void main(String[] args) {
        Developer developer = new Developer("Arzu", "Nusratova", 23, 2000, 2);
        Manager manager = new Manager("Gunay", "Suleymanova", 27, 1000, 10);           System.out.println(developer);
        System.out.println(manager);
    }*/

    public static void main(String[] args) {
        Child c1 = new Child("Rasim", "Quliyev", 2);
        Child c2 = new Child("Aylin", "Quliyeva", 13);
        Child[]arr={c1,c2};
        Parent parent = new Parent("Ayshan", "Quliyeva", 34, arr);

        System.out.println("Valideyn \n"+parent.getName()+" "+parent.getSurname()+" "+parent.getAge());
        System.out.println("usaqlari");
        for(Child c:arr){
            System.out.println(c.getName()+" "+c.getSurname()+" "+c.getAge());
        }

    }

}