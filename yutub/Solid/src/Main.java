//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static interface Notification{
       void send(String msj);
    }
    public static class  EmailNotification implements Notification{
        public void send(String msj){
            System.out.println("email notification "+msj);
        }
    }
    public static class SmsNotification implements Notification{
        public void send(String msj){
            System.out.println("sms notification "+msj);
        }
    }
    public static class MessageService{
    private  Notification ntf;
  /*  MessageService(Notification ntf){
        this.ntf=ntf;
    }*/
        void functionalInjection(String msj,Notification ntf){

           ntf.send(msj);
        }}


    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        SmsNotification sms = new SmsNotification();
      /*  MessageService ms = new MessageService(sms);
      ms.send("salam");*/
        Main.MessageService messageService = new Main.MessageService();
        messageService.functionalInjection("salam",email);
    }
}