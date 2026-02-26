public class SmartThermostat implements SmartDevice {
    boolean ison;
    @Override
    public void turnOn() {
        ison=true;
        System.out.println("SmartThermostat turn on");
    }

    public void turnOff() {
        ison=false;
        System.out.println("SmartThermostat turn off");
    }
    public void displayStatus() {
        System.out.println((ison?"ON":"OFF"));
    }
}
