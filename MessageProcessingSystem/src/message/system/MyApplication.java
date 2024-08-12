package message.system;

public class MyApplication {
    private MessageService messageService;

    // Constructor to inject the service
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        // Delegate the task of sending the message to the service
        messageService.sendMessage(message);
    }
}
