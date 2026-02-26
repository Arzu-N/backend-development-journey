public class SmartLight implements SmartDevice{
    boolean ison;
    @Override
    public void turnOn() {
        ison=true;
        System.out.println("SmartLight turn on");
    }

    @Override
    public void turnOff() {
        ison=false;
        System.out.println("SmartLight turn off");
    }

    @Override
    public void displayStatus() {
        System.out.println((ison?"ON":"OFF"));
    }

}
