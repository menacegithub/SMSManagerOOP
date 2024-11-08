import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        SMSManager smsManager = new SMSManager();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("""
                    ** SMS Manager: **
                    1. Send Message
                    2. Delete Message
                    3. Mark Message as Read
                    4. Show all Messages 
                    5. Show Unread Messages
                    6. Exit
                    Choose an option:
                    """);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter sender name");
                    String sender = scanner.nextLine();
                    System.out.println("Enter receiver name");
                    String receiver = scanner.nextLine();
                    System.out.println("Enter message content bro : ");
                    String content = scanner.nextLine();
                    smsManager.sendMessage(sender, receiver, content);
                    break;

                case 2:
                    System.out.println("Enter message ID to delete");
                    int deleteID = scanner.nextInt();
                    smsManager.deleteMessage(deleteID);
                    break;
                case 3:
                    System.out.println("Enter message ID to mark as read man :");
                    int markID = scanner.nextInt();
                    smsManager.markMessageAsRead(markID);
                    break;
                case 4:
                    smsManager.showAllMessages();
                    break;
                case 5:
                    smsManager.showunreadMessage();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option Mazgi!");


            }


        }
        scanner.close();
    }
}