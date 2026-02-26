public class Whatsapp implements Messenger{
    @Override
    public void sendMessage(String message){
        System.out.println("Whatsapp message "+message);
    }
}
