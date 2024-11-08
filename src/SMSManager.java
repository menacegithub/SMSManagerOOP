import java.util.ArrayList;
import java.util.List;

public class SMSManager {
    private List<Message> messages;
    private int messagesCounter;

    public SMSManager() {
        messages = new ArrayList<Message>();
        messagesCounter = 0;
    }

    public void sendMessage(String sender, String receiver, String content) {
        Message newMessage = new Message(messagesCounter++, sender, receiver, content);
        messages.add(newMessage);
        System.out.println("Message sent brat" + newMessage);

    }

    public void deleteMessage(int messageId) {
        messages.removeIf(message -> message.getId() == messageId);
        System.out.println("Message deleted oka :" + messageId);
    }

    public void markMessageAsRead(int messageId) {
        for (Message message : messages) {
            if (message.getId() == messageId) {
                message.markAsRead();
                System.out.println("Message marked as read oka :" + messageId);
                return;
            }
        }
        System.out.println("Message with id " + messageId + " not found ");
    }
    public void showAllMessages() {
        System.out.println("All messages :");
        for (Message message : messages) {
            System.out.println(message);
        }
    }
    public void showunreadMessage() {
        System.out.println("Unread messages :");
        for (Message message : messages) {
            if (!message.isIsread()){
                System.out.println(message);
            }
        }
    }
}
