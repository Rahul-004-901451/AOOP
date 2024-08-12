
package message.system;

public class Main {
    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        MyApplication app1 = new MyApplication(emailService);
        app1.processMessage("Hello via Email!");

        // Using SMSService
        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hello via SMS!");
    }
}
