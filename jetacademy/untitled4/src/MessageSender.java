public class MessageSender {
    static void sendAll(Messenger[]messengers,String message){
        for(Messenger m:messengers)
            m.sendMessage(message);
    }
}
