public class Telegram implements Messenger{
    @Override
    public void sendMessage(String message){
        System.out.println("Telegram message "+message);
    }
}
